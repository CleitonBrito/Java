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

public class RenovarDAO {
    
    public void renovar(int id_emprestimo, int id_leitor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int qtd_renovacao = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id, situacao, n_renovacao FROM emprestimos "+
                                        "WHERE id = ? AND situacao = ?");
            stmt.setInt(1, id_emprestimo);
            stmt.setString(2, "Aberto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                qtd_renovacao = rs.getInt("n_renovacao")+1;
                stmt = con.prepareStatement("UPDATE emprestimos SET n_renovacao = ?,"+
                                            "data_devolucao = ? WHERE id = ?");
                stmt.setInt(1, qtd_renovacao);
                
                Date data = new Date();
                stmt.setTimestamp(2, devolucao(7, data));
                
                stmt.setInt(3, id_emprestimo);
                stmt.execute();
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO AO RENOVAR: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
    }
    
    public boolean verificar_renovacao(int id_emprestimo){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean autorizado = true;
        int qtd_renovacao = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id, situacao, n_renovacao FROM emprestimos "+
                                        "WHERE id = ? AND situacao = ? AND n_renovacao = 3");
            stmt.setInt(1, id_emprestimo);
            stmt.setString(2, "Aberto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                autorizado = false;
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
            autorizado = false;
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return autorizado;
    }
    
    public List<Tabela_Emprestimos> leitura(int id_leitor){
        
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
                                        "ON lei.id = emp.id_leitor AND emp.situacao = 'Aberto'"
                                      + "AND emp.id_leitor = ?");
            stmt.setInt(1, id_leitor);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Tabela_Emprestimos emprestimo = new Tabela_Emprestimos();
                
                emprestimo.setId_emprestimo(rs.getInt("emp.id"));
                emprestimo.setTitulo_livro(rs.getString("li.titulo"));
                emprestimo.setAutor_livro(rs.getString("li.autor"));
                emprestimo.setGenero_livro(rs.getString("li.genero"));
                emprestimo.setLeitor(rs.getString("lei.nome"));
                emprestimo.setN_renovacao(rs.getInt("emp.n_renovacao"));
                tabela_emprestimos.add(emprestimo);
            }
                    
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_emprestimos;
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
