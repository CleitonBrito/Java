package biblioteca;
public class Cliente {
    private String nome;
    private String RG;
    private String endereco;
    private int telefone;
    private int dias_multa;
    private int n_emprestimo;
    
    public Cliente(String nome, String RG, String endereco, int telefone){
        this.nome = nome;
        this.RG = RG;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dias_multa = 0;
        this.n_emprestimo = 0;
    }
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDias_multa() {
        return dias_multa;
    }

    public void setDias_multa(int dias_multa) {
        this.dias_multa = dias_multa;
    }

    public int getN_emprestimo() {
        return n_emprestimo;
    }

    public void setN_emprestimo(int n_emprestimo) {
        this.n_emprestimo = n_emprestimo;
    }
    
}