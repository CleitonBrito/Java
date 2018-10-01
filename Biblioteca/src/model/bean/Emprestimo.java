package model.bean;

public class Emprestimo {
    private int id_emprestimo;
    private String data_emprestimo;
    private String hora_emprestimo;
    private String data_devolucao;
    private String data_devolveu;
    private String hora_devolveu;
    private int dias_atraso;
    private int id_livro;
    private int id_leitor;
    private int n_renovacao;
    private String situacao;

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getHora_emprestimo() {
        return hora_emprestimo;
    }

    public void setHora_emprestimo(String hora_emprestimo) {
        this.hora_emprestimo = hora_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    
    public String getData_devolveu() {
        return data_devolveu;
    }

    public void setData_devolveu(String data_devolveu) {
        this.data_devolveu = data_devolveu;
    }
    
    public String getHora_devolveu() {
        return hora_devolveu;
    }

    public void setHora_devolveu(String hora_devolveu) {
        this.hora_devolveu = hora_devolveu;
    }

    public int getDias_atraso() {
        return dias_atraso;
    }

    public void setDias_atraso(int dias_atraso) {
        this.dias_atraso = dias_atraso;
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

    public int getN_renovacao() {
        return n_renovacao;
    }

    public void setN_renovacao(int n_renovacao) {
        this.n_renovacao = n_renovacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
