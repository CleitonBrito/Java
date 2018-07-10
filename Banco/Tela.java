
public class Tela {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(410, "BB", "Cleiton Brito", "1234", 150.00, 15, 15, 1000.0);
        System.out.println(contaCorrente1.depositar(50.00));
        System.out.println(contaCorrente1.transferir(40.0));
        System.out.println(contaCorrente1.sacar(60.0));
        System.out.println(contaCorrente1.sacar(101));
    }
        
}
