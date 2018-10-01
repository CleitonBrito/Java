package conexao;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/db_lib";
    private static final String USER = "root";
    private static final String PASS = "";
   
    public static Connection Conectar(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desculpe! Não consegui conectar ao banco de dados.");
            throw new RuntimeException("Erro na no conexão: "+ex);
        }
    }
    
    public static void fechar_conexao(Connection con){
        try {
            if(con!=null){
                con.close();
            }
        }catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }
    }
    
    public static void fechar_conexao(Connection con, PreparedStatement stmt){
        
        fechar_conexao(con);
        
        try {
            if(stmt!=null){
                stmt.close();
            }
        }catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }
    }
    
    public static void fechar_conexao(Connection con, PreparedStatement stmt, ResultSet rs){
        
        fechar_conexao(con, stmt);
        
        try {
            if(rs!=null){
                rs.close();
            }
            
        }catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }
    }
}
