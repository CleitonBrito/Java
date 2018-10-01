package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Bibliotecario;
import model.bean.Leitor;

public class BibliotecarioDAO {
    
    public void criar(Bibliotecario bibliotecario){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO admins (usuario, cpf, senha) VALUES (?, ?, ?)");
            stmt.setString(1, bibliotecario.getUsuario());
            stmt.setString(2, bibliotecario.getCPF());
            stmt.setString(3, bibliotecario.getSenha());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CPF já existe!");
            System.err.println(ex);
        }finally{
            Conexao.fechar_conexao(con, stmt);
        }
    }
    
    public boolean login_admin(String usuario, String senha){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean autorizado = false;
        
        try {
            stmt = con.prepareStatement("SELECT usuario, senha FROM admins WHERE usuario = ? AND senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                autorizado=true;
            }
        } catch (SQLException ex){
            System.err.println("Erro ao consultar\n"+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return autorizado;
    }
}
