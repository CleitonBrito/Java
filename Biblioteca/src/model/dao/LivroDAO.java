package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Livro;

public class LivroDAO {
    
    public void criar(Livro livro){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try{
           stmt =con.prepareStatement("INSERT INTO livros (titulo, autor, isbn, genero, edicao, quantidade) VALUES (?,?,?,?,?,?)");
           stmt.setString(1, livro.getTitulo());
           stmt.setString(2, livro.getAutor());
           stmt.setString(3, livro.getISBN());
           stmt.setString(4, livro.getGenero());
           stmt.setInt(5, livro.getEdicao());
           stmt.setInt(6, livro.getQuantidade());
           
           stmt.executeUpdate();
            
        }catch(SQLException ex){
            System.err.println("ERRO AO INSERIR: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt);
        }
    }
    
    public List<Livro> leitura(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM livros");
            rs =stmt.executeQuery();
            
            while(rs.next()){
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setISBN(rs.getString("isbn"));
                livro.setGenero(rs.getString("genero"));
                livro.setEdicao(rs.getInt("edicao"));
                livro.setQuantidade(rs.getInt("quantidade"));
                livros.add(livro);
            }
            
        }catch(SQLException ex){
            System.err.println("Erro ao consultar\n"+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return livros;
    }
    public List<Livro> buscar(String titulo, String autor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT titulo, autor, id, isbn, genero, edicao, situacao "+
                                        "FROM livros WHERE titulo LIKE ? and autor LIKE ?");
            stmt.setString(1, "%"+titulo+"%");
            stmt.setString(2, "%"+autor+"%");
            rs =stmt.executeQuery();
            
            while(rs.next()){
                
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setISBN(rs.getString("isbn"));
                livro.setGenero(rs.getString("genero"));
                livro.setEdicao(rs.getInt("edicao"));
                livro.setSituacao(rs.getString("situacao"));
                livros.add(livro);
            }
                    
        }catch(SQLException ex){
            System.err.println("Erro ao consultar livro: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return livros;
    }
    
    public void diminuir_acervo(int id_livro){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareCall("SELECT quantidade FROM livros WHERE id = ?");
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int quantidade = rs.getInt("quantidade")-1;
                
                stmt = con.prepareStatement("UPDATE livros SET quantidade = ? WHERE id = ?");
                stmt.setInt(1, quantidade);
                stmt.setInt(2, id_livro);
                
                if(quantidade==1){
                    stmt2 = con.prepareStatement("UPDATE livros SET situacao = ? WHERE id = ?");
                    stmt2.setString(1, "Indisponível");
                    stmt2.setInt(2, id_livro);
                    stmt2.execute();
                }
                stmt.execute();
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
    }
    
    public int verificarSaldo_livro(int id_livro){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int quantidade = 0;
        
        try{
            stmt = con.prepareCall("SELECT quantidade FROM livros WHERE id = ?");
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                quantidade = rs.getInt("quantidade");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return quantidade;
    }
    
    public String verificar_situacao(int id_livro){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String situacao = "";
        
            try{
               stmt = con.prepareStatement("SELECT id, situacao FROM livros WHERE id = ?");
               stmt.setInt(1, id_livro);
               rs = stmt.executeQuery();

               while(rs.next()){
                   situacao = rs.getString("situacao");
               }

            }catch(SQLException ex){
                System.err.println(""+ex);
            }finally{
                Conexao.fechar_conexao(con, stmt, rs);
            }
        return situacao;
    }
}
