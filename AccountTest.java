package programada11.pkg06.pkg2018;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("João", 100.00);
        Account account2 = new Account("Maria", 90.00);
        
        //Valores iniciais da conta
        displayAccount(account1);
        displayAccount(account2);
        
        Scanner input = new Scanner(System.in);
       
        //Depositar nas conta 1
        System.out.print("\nDeposite na conta1: " );
        double depositAmount = input.nextDouble();
        System.out.printf("\nDepositado %.2f na conta\n\n", depositAmount);
        account1.deposit(depositAmount);
        
        //Mostra saldo
        displayAccount(account1);
        displayAccount(account2);
        
        //Depositar na conta 2
        System.out.print("\nDeposite na conta2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nDepositado %.2f na conta\n\n", depositAmount);
        account2.deposit(depositAmount);
        
        
        //Mostra saldo
        displayAccount(account1);
        displayAccount(account2);
        
        //Saque da conta 1
        System.out.print("\nSaque da conta1: ");
        double saque = input.nextDouble();
        System.out.printf("\nSacado %.2f da conta\n\n", saque);
        account1.withdraw(saque);
        
        //Mostra saldo
        displayAccount(account1);
        displayAccount(account2);
    }
    //Método Mostra saldo
    public static void displayAccount (Account accountToDisplay){
        System.out.printf("%s tem saldo de: R$%.2f\n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
