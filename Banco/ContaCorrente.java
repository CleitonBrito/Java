public class ContaCorrente extends Conta{

    private int numerosaqueMensal;
    private int numeroExtratoMensal;
    private double limite;
    final private double LIMITE_INICIAL;
    
    public ContaCorrente(int conta, String agencia, String titular, String senha, double saldo, int numerosaqueMensal, int numeroExtratoMensal, double limite) {
        super(conta, agencia, titular, senha, saldo);
        this.numerosaqueMensal = numerosaqueMensal;
        this.numeroExtratoMensal = numeroExtratoMensal;
        this.limite = limite;
        this.LIMITE_INICIAL = limite;
    }

    public void debitoCesta(double valorDebito){
        if(valorDebito<getSaldo()){
            setSaldo(getSaldo() - valorDebito);
        }
        else{
            System.out.println("Saldo indisponível");
        }
    }
    public String sacar(double saque){
        double saldoTotal = this.limite+getSaldo();
        if(saldoTotal>saque){
            double limiteAnterior;
            double restante = saque - getSaldo();
            if(restante<0){
                setSaldo(0);
                limiteAnterior = this.limite - restante;
                this.limite += restante;
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        "Seu limite é: "+this.limite+"! Houve uma movimentação de "+(limiteAnterior-limite);
            }
            else{
                setSaldo(getSaldo()-saque);
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        "Seu limite é: "+this.limite;
            }
            
        }
        else
            return "Saldo indisponível";
    }
    
    public String depositar (double deposito){
        if(this.LIMITE_INICIAL>this.limite){
            double restante = this.LIMITE_INICIAL - this.limite;
            if(deposito > restante){
                this.limite = this.LIMITE_INICIAL;
                setSaldo(deposito-restante);
                return "Depósito efetuado com sucesso! Seu novo saldo é: "+getSenha()+". Seu limite é: "+this.limite;
            }else{
                this.limite +=deposito;
                return "Depósito efetuado com sucesso! Seu novo saldo é: "+getSenha()+". Seu limite é: "+this.limite;
            }
        }else{
            setSaldo(getSaldo()+deposito);
            return "Depósito efetuado com sucesso! Seu novo saldo é: "+getSenha()+". Seu limite é: "+this.limite;
        }
    }
    

    @Override
    public boolean login() {
        return false;
    }
    
}
