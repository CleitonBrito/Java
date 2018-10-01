package model.bean;

public class Tabela_Reservas {
   
    private int id_reserva;
    private String titulo_livro;
    private String autor_livro;
    private String genero_livro;
    private String nome_leitor;
    private String situacao;

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }

    public String getGenero_livro() {
        return genero_livro;
    }

    public void setGenero_livro(String genero_livro) {
        this.genero_livro = genero_livro;
    }

    public String getNome_leitor() {
        return nome_leitor;
    }

    public void setNome_leitor(String nome_leitor) {
        this.nome_leitor = nome_leitor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
