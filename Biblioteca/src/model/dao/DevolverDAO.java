package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.bean.Tabela_Emprestimos;

public class DevolverDAO {
    
    public void devolver(int id_emprestimo, int id_leitor, int id_livro){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null; // Devolver
        PreparedStatement stmt2 = null; // Hora, data devolveu,
        PreparedStatement stmt3 = null; //Diminuir emprestimos em aberto do leitor
        PreparedStatement stmt5 = null;
        ReservasDAO reservasDAO = new ReservasDAO();
        ResultSet rs = null;
        
        int quantidade_li = 0;
        String situacao_li = "";
        
        String situacao_r = "";
        
        int quantidade_emp = 0;
        String situacao_emp = "Fechado";
        
        try{
            stmt = con.prepareStatement("SELECT emp.id, emp.situacao, emp.id_livro, "+
                                        "emp.qtd_emprestimos, li.quantidade, li.situacao,\n" +
                                        "re.situacao FROM livros li JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro JOIN reservas re ON li.id = re.id_livro\n"+
                                        "AND emp.id = ? AND re.situacao = ?");
            stmt.setInt(1, id_emprestimo);
            stmt.setString(2, "Aberta");
            rs = stmt.executeQuery();

            while(rs.next()){
                id_livro = rs.getInt("emp.id_livro");
                quantidade_li = rs.getInt("li.quantidade")+1;

                    if(quantidade_li>1)
                        situacao_li = "Disponível";

                    situacao_r = rs.getString("re.situacao");
                    if(reservasDAO.qtd_reservas_livros(id_livro)<=quantidade_li && !situacao_r.equals("Fechada")){
                        situacao_r = "Disponível";

                        try{
                           PreparedStatement stmt4 = null;
                           stmt4 = con.prepareStatement("UPDATE reservas SET situacao = ? WHERE situacao = ?");
                           stmt4.setString(1, situacao_r);
                           stmt4.setString(2, "Aberta");
                           stmt4.execute();

                        }catch(SQLException ex1){
                            System.err.println("ERRO EM RESERVAS: "+ex1);
                        }
                    }
                quantidade_emp = rs.getInt("emp.qtd_emprestimos");
            }
            
            if(quantidade_emp==0){
                stmt5 = con.prepareStatement("SELECT emp.id, emp.situacao, emp.id_livro, "+
                                        "emp.qtd_emprestimos, li.quantidade, li.situacao\n" +
                                        "FROM livros li JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro AND emp.id = ?\n"+
                                        "AND li.id = ?");
                stmt5.setInt(1, id_emprestimo);
                stmt5.setInt(2, id_livro);
                rs = stmt5.executeQuery();

                while(rs.next()){
                    quantidade_emp = rs.getInt("emp.qtd_emprestimos");
                    quantidade_li = rs.getInt("li.quantidade")+1;
                    situacao_li = rs.getString("li.situacao");

                    if(quantidade_li>1)
                        situacao_li = "Disponível";

                }
            }
            
            stmt2 = con.prepareStatement("UPDATE emprestimos emp INNER JOIN livros li "+
                                         "ON emp.id_livro = li.id AND emp.id = ? SET li.quantidade = ?,\n"
                                       + "li.situacao = ?,  emp.situacao = ?,\n"
                                       + "emp.data_devolveu = ?");

            stmt2.setInt(1, id_emprestimo);
            stmt2.setInt(2, quantidade_li);
            stmt2.setString(3, situacao_li);
            stmt2.setString(4, situacao_emp);
            
            Date data = new Date();
            Timestamp data_dev = new Timestamp(data.getTime());

            stmt2.setTimestamp(5, data_dev);
            stmt2.execute();

            stmt3 = con.prepareStatement("UPDATE emprestimos SET qtd_emprestimos = ? WHERE id_leitor = ? AND situacao = ?");
            stmt3.setInt(1, quantidade_emp-1);
            stmt3.setInt(2, id_livro);
            stmt3.setString(3, "Aberto");
            stmt3.execute();
            
        }catch(SQLException ex){
            System.err.println("ERRO AO DEVOLVER: "+ex);
        }
    }
    
    public List<Tabela_Emprestimos> leitura_devolver(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Emprestimos> tabela_emprestimos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT emp.id, li.titulo,\n" +
                                        "li.autor, li.genero, lei.nome\n" +
                                        "FROM livros li \n" +
                                        "JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro\n" +
                                        "JOIN leitores lei\n" +
                                        "ON lei.id = emp.id_leitor\n" +
                                        "WHERE emp.situacao = 'Aberto'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Tabela_Emprestimos emprestimo = new Tabela_Emprestimos();
                
                emprestimo.setId_emprestimo(rs.getInt("emp.id"));
                emprestimo.setTitulo_livro(rs.getString("li.titulo"));
                emprestimo.setAutor_livro(rs.getString("li.autor"));
                emprestimo.setGenero_livro(rs.getString("li.genero"));
                emprestimo.setLeitor(rs.getString("lei.nome"));
                tabela_emprestimos.add(emprestimo);
            }
                    
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_emprestimos;
    }
    
    public List<Tabela_Emprestimos> leitura_devolver(String cpf){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Emprestimos> tabela_emprestimos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT emp.id, li.titulo,\n" +
                                        "li.autor, li.genero, lei.nome\n" +
                                        "FROM livros li \n" +
                                        "JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro\n" +
                                        "JOIN leitores lei\n" +
                                        "ON lei.id = emp.id_leitor\n" +
                                        "WHERE lei.cpf = ? AND emp.situacao = ?");
            stmt.setString(1, cpf);
            stmt.setString(2, "Aberto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Tabela_Emprestimos emprestimo = new Tabela_Emprestimos();
                
                emprestimo.setId_emprestimo(rs.getInt("emp.id"));
                emprestimo.setTitulo_livro(rs.getString("li.titulo"));
                emprestimo.setAutor_livro(rs.getString("li.autor"));
                emprestimo.setGenero_livro(rs.getString("li.genero"));
                emprestimo.setLeitor(rs.getString("lei.nome"));
                tabela_emprestimos.add(emprestimo);
            }
                    
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_emprestimos;
    }
    
    public int verificar_atraso(int id_emprestimo, int id_leitor, Date data_hoje){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Date data_devolucao;
        int dias_atraso=0;
        int qtd_emprestimos = 1;
        
        try{
            stmt = con.prepareStatement("SELECT id, data_devolucao, situacao "+
                                        "FROM emprestimos WHERE id = ? AND "+
                                        "situacao = ?");
            stmt.setInt(1, id_emprestimo);
            stmt.setString(2, "Aberto");
            rs = stmt.executeQuery();
           
            while(rs.next()){
                 data_devolucao = rs.getDate("data_devolucao");
                 System.out.println(data_devolucao);
               
                 long diff = (data_hoje.getTime() - data_devolucao.getTime())/86400000L;
                 if(diff>0)
                     dias_atraso = (int) diff*2*qtd_emprestimo(id_leitor)+1;
                     System.out.println(dias_atraso);
                 
                stmt = con.prepareStatement("UPDATE emprestimos SET data_disponível = ?"+
                                            " WHERE id = ?");
                stmt.setTimestamp(1, data_disponivel(dias_atraso, data_devolucao));
                stmt.setInt(2, id_emprestimo);
                stmt.execute();
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO AO VERIFICAR ATRASO: "+ex);
        }
        return dias_atraso;
    }
    
    public int verificar_atraso(int id_leitor, Date data_hoje){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Date data_disponivel;
        int dias_atraso=0;
        
        try{
            stmt = con.prepareStatement("SELECT id, data_disponível, situacao "+
                                        "FROM emprestimos WHERE "+
                                        "situacao = ?");
            stmt.setString(1, "Aberto");
            rs = stmt.executeQuery();
           
            while(rs.next()){
                 data_disponivel = rs.getDate("data_disponível");
                 
                 if(data_disponivel!=null){
                    long diff = (data_hoje.getTime() - data_disponivel.getTime())/86400000L;
                    if(diff<0)
                     dias_atraso = (int) diff;
                 }
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO AO VERIFICAR ATRASO: "+ex);
        }
        return dias_atraso;
    }
    
    public int qtd_emprestimo(int id_leitor){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int quantidade = 1;
        
            try{
               stmt = con.prepareStatement("SELECT id_leitor, qtd_emprestimos, situacao FROM emprestimos "
                                        + "WHERE id_leitor = ? AND situacao = ? AND qtd_emprestimos = 3");
               stmt.setInt(1, id_leitor);
               stmt.setString(2, "Aberto");
               rs = stmt.executeQuery();
               
                while(rs.next()){
                    System.out.println("QUANTIDADE DE EMPRESTIMOS: "+rs.getInt("qtd_emprestimos"));
                    quantidade = rs.getInt("qtd_emprestimos");
                }
                
            }catch(SQLException ex){
            }finally{
                Conexao.fechar_conexao(con, stmt, rs);
            }
        return quantidade;
    }
    
    public Timestamp data_disponivel(int dias, Date data){
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DAY_OF_MONTH, dias);
        String data_format;
        data_format = new SimpleDateFormat("dd/MM/YYYY").format(gc.getTime());
        Timestamp data_devolucao;
        data_devolucao = new Timestamp(gc.getTimeInMillis());
        return data_devolucao;
    }
}
