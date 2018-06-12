package programada11.pkg06.pkg2018;

public class Invoice {
    
    private String numero;
    private String descricao;
    private int qtdItem;
    private double precoItem;
    
    public Invoice (String numero, String descricao, int qtdItem, double precoItem){
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }
    
    public double getInvoiceAmount(){
        if(qtdItem < 0){
            this.qtdItem = 0;
            System.out.println("Quantidade definida como 0");
        }
        if(precoItem < 0){
            this.precoItem = 0;
            System.out.println("Preço definido como 0");
        }
        return this.qtdItem*this.precoItem;
     }
    
    
    public String getNumero() {
        return numero;
    }

    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public int getQtdItem() {
        return qtdItem;
    }

    
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    
    public double getPrecoItem() {
        return precoItem;
    }

   
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
