package biblioteca;


public class Emprestimo {
    private String data_emprestimo;
    private String data_devolucao;
    private Cliente cliente;
    private Livro livro;
    
    public Emprestimo(String data_emprestimo, String data_devolucao, Cliente cliente, Livro livro){
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
