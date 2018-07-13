public class ContaPoupanca extends Conta{
    double TaxaRendimento = 1.000000000002;
    public ContaPoupanca(double taxaRendimento, int conta, String agencia, String titular, String senha, double saldo) {
        super(conta, agencia, titular, senha, saldo);
        this.TaxaRendimento = taxaRendimento;
    }
    public String rendimento (){
        setSaldo(getSaldo()*this.TaxaRendimento);
        return "Crédito atribuido a conta! Seu novo saldo é: "+getSaldo();
    }
    
    @Override
    public boolean login() {
        return false;
    }
}
