package model.bean;

public class Reservas {
    
    private int id_emprestimo;
    private int id_livro;
    private int id_leitor;
    private String situacao;

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getId_leitor() {
        return id_leitor;
    }

    public void setId_leitor(int id_leitor) {
        this.id_leitor = id_leitor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
