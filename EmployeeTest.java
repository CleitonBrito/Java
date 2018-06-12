
package programada11.pkg06.pkg2018;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("José", "Gomes", 954);
        Employee employee2 = new Employee("Ana", "Souza", 1094);
        
        //Sal mensal
        System.out.println("Nome: "+employee1.getPNome()+"\nSobrenome: "+employee1.getSNome()+"\nSalário: "+employee1.getSal());
        System.out.println("\nNome: "+employee2.getPNome()+"\nSobrenome: "+employee2.getSNome()+"\nSalário: "+employee2.getSal());
        
        
        //Sal Anual + 10%
        System.out.printf("\nO Salário anual de %s é de : R$%.2f\n",employee1.getPNome(),employee1.getSalAnual());
        System.out.printf("O Salário anual de %s é de : R$%.2f\n",employee2.getPNome(), employee2.getSalAnual());
    }
}
