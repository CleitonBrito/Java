package biblioteca;


public class Emprestimo {
    private String data_emprestimo;
    private String data_devolucao;
    private Leitor leitor;
    private Livro livro;
    private int n_renovacao;
    
    public Emprestimo(String data_emprestimo, String data_devolucao, Leitor leitor, Livro livro){
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getN_renovacao() {
        return n_renovacao;
    }

    public void setN_renovacao(int n_renovacao) {
        this.n_renovacao = n_renovacao;
    }

}
