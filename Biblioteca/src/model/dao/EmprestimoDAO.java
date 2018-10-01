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

public class EmprestimoDAO {
    
    public void emprestar(int id_livro, int id_leitor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        ResultSet rs= null;
        
        int quantidade_emp = 0;
        
        try{
            stmt2 = con.prepareStatement("INSERT INTO emprestimos (data_emprestimo,"
                                      + "data_devolucao, id_livro, id_leitor)"
                                      + " VALUES (?,?,?,?)");
            
            Date data = new Date();
            Timestamp data_emp = new Timestamp(data.getTime());
            
            stmt2.setTimestamp(1, data_emp);
            stmt2.setTimestamp(2, devolucao(7, data));
            stmt2.setInt(3, id_livro);
            stmt2.setInt(4, id_leitor);
            
            stmt2.executeUpdate();
            
            stmt = con.prepareStatement("SELECT qtd_emprestimos, id_leitor, situacao FROM emprestimos WHERE id_leitor = ? AND situacao = ?");
            stmt.setInt(1, id_leitor);
            stmt.setString(2, "Aberto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.println("QTD EMPRESTIMOS: "+quantidade_emp);
                quantidade_emp = rs.getInt("qtd_emprestimos")+1;
                System.out.println("\nQTD EMPRESTIMOS: "+quantidade_emp);
                stmt3 = con.prepareStatement("UPDATE emprestimos SET qtd_emprestimos = ? WHERE id_leitor = ? AND situacao = ?");
                stmt3.setInt(1, quantidade_emp);
                stmt3.setInt(2, id_leitor);
                stmt3.setString(3, "Aberto");
                stmt3.executeUpdate();
                quantidade_emp = 0;
            }
           
        }catch(SQLException ex){
            System.out.println("ERRO NO EMPRESTIMO:"+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt2, rs);
        }
    }
    
    public List<Tabela_Emprestimos> leitura(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Emprestimos> tabela_emprestimos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT emp.id, emp.data_emprestimo,"+
                                        "emp.situacao, emp.n_renovacao, li.titulo,\n" +
                                        "li.autor, li.genero, lei.nome\n" +
                                        "FROM livros li \n" +
                                        "JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro\n" +
                                        "JOIN leitores lei\n" +
                                        "ON lei.id = emp.id_leitor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Tabela_Emprestimos emprestimo = new Tabela_Emprestimos();
                
                emprestimo.setId_emprestimo(rs.getInt("emp.id"));
                emprestimo.setTitulo_livro(rs.getString("li.titulo"));
                emprestimo.setAutor_livro(rs.getString("li.autor"));
                emprestimo.setGenero_livro(rs.getString("li.genero"));
                emprestimo.setLeitor(rs.getString("lei.nome"));
                emprestimo.setN_renovacao(rs.getInt("emp.n_renovacao"));
                emprestimo.setData_emprestimo(rs.getString("emp.data_emprestimo"));
                emprestimo.setSituacao(rs.getString("emp.situacao"));
                tabela_emprestimos.add(emprestimo);
            }
                    
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_emprestimos;
    }
    
    public List<Tabela_Emprestimos> leituraAberta(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Emprestimos> tabela_emprestimos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT emp.id, emp.data_emprestimo,"+
                                        "emp.situacao, emp.n_renovacao, li.titulo,\n" +
                                        "li.autor, li.genero, lei.nome\n" +
                                        "FROM livros li \n" +
                                        "JOIN emprestimos emp\n" +
                                        "ON li.id = emp.id_livro\n" +
                                        "JOIN leitores lei\n" +
                                        "ON lei.id = emp.id_leitor AND emp.situacao = 'Aberto'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Tabela_Emprestimos emprestimo = new Tabela_Emprestimos();
                
                emprestimo.setId_emprestimo(rs.getInt("emp.id"));
                emprestimo.setTitulo_livro(rs.getString("li.titulo"));
                emprestimo.setAutor_livro(rs.getString("li.autor"));
                emprestimo.setGenero_livro(rs.getString("li.genero"));
                emprestimo.setLeitor(rs.getString("lei.nome"));
                emprestimo.setN_renovacao(rs.getInt("emp.n_renovacao"));
                emprestimo.setData_emprestimo(rs.getString("emp.data_emprestimo"));
                emprestimo.setSituacao(rs.getString("emp.situacao"));
                tabela_emprestimos.add(emprestimo);
            }
                    
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_emprestimos;
    }
    
    public boolean emprestimo_repetido(int id_livro, int id_leitor){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean nao_autorizado = false;
        
            try{
               stmt = con.prepareStatement("SELECT * FROM emprestimos WHERE id_livro = ? AND id_leitor = ? AND situacao = ?");
               stmt.setInt(1, id_livro);
               stmt.setInt(2, id_leitor);
               stmt.setString(3, "Aberto");
               rs = stmt.executeQuery();

               while(rs.next()){
                   nao_autorizado=true;
               }

            }catch(SQLException ex){
                System.err.println(""+ex);
                nao_autorizado=false;
            }finally{
                Conexao.fechar_conexao(con, stmt, rs);
            }
        return nao_autorizado;
    }
    
    public boolean qtd_emprestimo(int id_leitor){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int quantidade = 0;
        boolean autorizado = true;
        
            try{
               stmt = con.prepareStatement("SELECT id_leitor, qtd_emprestimos, situacao FROM emprestimos "
                                        + "WHERE id_leitor = ? AND situacao = ? AND qtd_emprestimos = 3");
               stmt.setInt(1, id_leitor);
               stmt.setString(2, "Aberto");
               rs = stmt.executeQuery();
               
                while(rs.next()){
                    System.out.println("QUANTIDADE DE EMPRESTIMOS: "+rs.getInt("qtd_emprestimos"));
                    autorizado=false;
                }
                
            }catch(SQLException ex){
                autorizado=false;
            }finally{
                Conexao.fechar_conexao(con, stmt, rs);
            }
        return autorizado;
    }
    
    public int id_livro(int id_emprestimo){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int id_livro = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id_livro FROM emprestimos WHERE id = ?");
            stmt.setInt(1, id_emprestimo);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                id_livro = rs.getInt("id_livro");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO AO ENCONTRAR ID LIVRO: "+ex);
        }
        return  id_livro;
    }
    
    public Timestamp devolucao(int dias, Date data){
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DAY_OF_MONTH, dias);
        String data_format;
        data_format = new SimpleDateFormat("dd/MM/YYYY").format(gc.getTime());
        Timestamp data_devolucao;
        data_devolucao = new Timestamp(gc.getTimeInMillis());
        return data_devolucao;
    }
}
