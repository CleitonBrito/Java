package programada11.pkg06.pkg2018;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("15", "Azul", 10, 2.50);
    
        //Valores Iniciais
        System.out.println("Numero: "+invoice1.getNumero()+"\nDescrição: "+invoice1.getDescricao()+"\nQuantidade: "+invoice1.getQtdItem()+"\nPreço: "+invoice1.getPrecoItem());
        
        //Mostra valores
        System.out.printf("\nPreço Total: R$%.2f\n",invoice1.getInvoiceAmount());
    }
}
