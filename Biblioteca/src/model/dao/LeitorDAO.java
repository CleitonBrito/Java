package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Leitor;

public class LeitorDAO {
    
    public void criar(Leitor leitor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO leitores (nome, cpf, senha, endereco, telefone) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, leitor.getNome());
            stmt.setString(2, leitor.getCpf());
            stmt.setString(3, leitor.getSenha());
            stmt.setString(4, leitor.getEndereco());
            stmt.setString(5, leitor.getTelefone());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CPF já existe!");
            System.err.println(ex);
        }finally{
            Conexao.fechar_conexao(con, stmt);
        }
    }
    
    public List<Leitor> leitura(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Leitor> leitores = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM leitores");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Leitor leitor = new Leitor();
                
                leitor.setNome(rs.getString("nome"));
                leitor.setCpf(rs.getString("cpf"));
                leitor.setSenha(rs.getString("senha"));
                leitor.setEndereco(rs.getString("endereco"));
                leitor.setTelefone(rs.getString("telefone"));
                leitores.add(leitor);
            }
        } catch (SQLException ex){
            System.err.println("Erro ao consultar\n"+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return leitores;
    }
    
    //Buscar por nome
    public List<Leitor> buscar_nome(String busca_leitor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Leitor> leitores = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM leitores WHERE nome LIKE ?");
            stmt.setString(1, busca_leitor+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Leitor leitor = new Leitor();
                
                leitor.setNome(rs.getString("nome"));
                leitor.setCpf(rs.getString("cpf"));
                leitor.setSenha(rs.getString("senha"));
                leitor.setEndereco(rs.getString("endereco"));
                leitor.setTelefone(rs.getString("telefone"));
                leitores.add(leitor);
            }
        } catch (SQLException ex){
            System.err.println("Erro ao consultar\n"+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return leitores;
    }
    
    //Buscar por cpf e senha
    public int buscarLeitor(String Busca_cpf, String senha){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        
        try{
            stmt = con.prepareStatement("SELECT cpf, senha, id FROM leitores WHERE cpf = ? AND senha = ?");
            stmt.setString(1, Busca_cpf);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("id");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return id;
    }
    
    //Buscar por cpf
    public int buscarCpf(String Busca_cpf){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        
        try{
            stmt = con.prepareStatement("SELECT cpf, senha, id FROM leitores WHERE cpf = ?");
            stmt.setString(1, Busca_cpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("id");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return id;
    }
    
    //Buscar id
    public int buscarId(int id_emprestimo){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id, id_leitor FROM emprestimos WHERE id = ?");
            stmt.setInt(1, id_emprestimo);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("id_leitor");
            }
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        
        return id;
    }
    
    public String senha(int id_leitor){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String senha_leitor = "";
        
        try{
            stmt = con.prepareStatement("SELECT id, senha FROM leitores WHERE id = ?");
            stmt.setInt(1, id_leitor);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                senha_leitor = rs.getString("senha");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO NA SENHA: "+ex);
        }
        return senha_leitor;
    }
    
}
