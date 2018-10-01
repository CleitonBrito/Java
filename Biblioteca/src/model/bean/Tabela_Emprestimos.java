package model.bean;

public class Tabela_Emprestimos {
    private int id_emprestimo;
    private String titulo_livro;
    private String autor_livro;
    private String genero_livro;
    private String leitor;
    private int n_renovacao;
    private String data_emprestimo;
    private String situacao;

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
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

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    /**
     * @return the n_renovacao
     */
    public int getN_renovacao() {
        return n_renovacao;
    }

    /**
     * @param n_renovacao the n_renovacao to set
     */
    public void setN_renovacao(int n_renovacao) {
        this.n_renovacao = n_renovacao;
    }
    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
