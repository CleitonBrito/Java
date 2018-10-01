package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Tabela_Reservas;

public class ReservasDAO {
    
    public void reservar(int id_livro, int id_leitor){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        
        try{
           stmt = con.prepareStatement("INSERT INTO reservas (id_livro, id_leitor) VALUES (?, ?)");
           stmt.setInt(1, id_livro);
           stmt.setInt(2, id_leitor);
           stmt.executeUpdate();
           
           stmt2 = con.prepareStatement("UPDATE livros SET situacao = 'Reservado' WHERE id = ?");
           stmt2.setInt(1, id_livro);
           stmt2.executeUpdate();
            
        }catch(SQLException ex){
            System.err.println("ERRO AO INSERIR: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt);
        }
    }
    
    public List<Tabela_Reservas> leitura(){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Reservas> tabela_reservas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT res.id_reserva, res.situacao, li.titulo, li.autor," +
                                       "li.genero, lei.nome FROM livros li " +
                                       "JOIN reservas res ON li.id = res.id_livro " +
                                       "JOIN leitores lei ON lei.id = res.id_leitor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Tabela_Reservas reserva = new Tabela_Reservas();
                
                reserva.setId_reserva(rs.getInt("res.id_reserva"));
                reserva.setTitulo_livro(rs.getString("li.titulo"));
                reserva.setAutor_livro(rs.getString("li.autor"));
                reserva.setGenero_livro(rs.getString("li.genero"));
                reserva.setNome_leitor(rs.getString("lei.nome"));
                reserva.setSituacao(rs.getString("res.situacao"));
                tabela_reservas.add(reserva);
            }
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_reservas;
    }
    
    public List<Tabela_Reservas> buscarReserva(String cpf){
        
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Tabela_Reservas> tabela_reservas = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT res.id_reserva, res.situacao, li.titulo, li.autor," +
                                       "li.genero, lei.nome FROM livros li " +
                                       "JOIN reservas res ON li.id = res.id_livro " +
                                       "JOIN leitores lei ON lei.id = res.id_leitor "+
                                       "WHERE lei.cpf = ?");
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Tabela_Reservas reserva = new Tabela_Reservas();
                
                reserva.setId_reserva(rs.getInt("res.id_reserva"));
                reserva.setTitulo_livro(rs.getString("li.titulo"));
                reserva.setAutor_livro(rs.getString("li.autor"));
                reserva.setGenero_livro(rs.getString("li.genero"));
                reserva.setNome_leitor(rs.getString("lei.nome"));
                reserva.setSituacao(rs.getString("res.situacao"));
                tabela_reservas.add(reserva);
            }
        }catch(SQLException ex){
            System.err.println("ERRO NA LEITURA: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return tabela_reservas;
    }
    
    public boolean verificar_reserva(int id_livro){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean nao_autorizado = false;
        
            try{
               stmt = con.prepareStatement("SELECT * FROM reservas WHERE id_livro = ? AND situacao = ?");
               stmt.setInt(1, id_livro);
               stmt.setString(2, "Aberta");
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
    
    public boolean verificar_reserva(int id_livro, int id_leitor){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean nao_autorizado = false;
        
            try{
               stmt = con.prepareStatement("SELECT id_livro, id_leitor, situacao "+
                                           "FROM emprestimos WHERE id_livro = ? AND "+
                                           "id_leitor = ? AND situacao = ?");
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
    
    //Id leitor pela reserva
    public int buscar_leitor_reserva(int id_reserva){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int id = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id_reserva, id_leitor FROM reservas WHERE id_reserva = ?");
            stmt.setInt(1, id_reserva);
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
    
    //Id livro pela reserva
    public int buscar_livro_reserva(int id_reserva){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int id = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id_reserva, id_livro FROM reservas WHERE id_reserva = ?");
            stmt.setInt(1, id_reserva);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("id_livro");
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return id;
    }
    
    public int fechar_reserva(int id_reserva){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int id = 0;
        
        try{
            stmt = con.prepareStatement("UPDATE reservas SET situacao = ? WHERE id_reserva = ?");
            stmt.setString(1, "Fechada");
            stmt.setInt(2, id_reserva);
            stmt.execute();
            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            Conexao.fechar_conexao(con, stmt, rs);
        }
        return id;
    }
    
    public int qtd_reservas_livros(int id_livro){
        Connection con = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtd_reservas = 0;
        
        try{
            stmt = con.prepareStatement("SELECT id_livro, situacao FROM reservas WHERE id_livro = ?");
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                qtd_reservas++;
            }
            
        }catch(SQLException ex){
            System.err.println("ERRO :"+ex);
        }
        return qtd_reservas;
    }
}
