package listatelefonica;

public class ListaTelefonica {
    public static void main(String[] args) {
        String listaTelefones [] = {"74999999999", "718888888", "813333333", "87555555555", "73444444444"};
        int ba = 0;
        int pe = 0;
        
        for(String telefone : listaTelefones){
            if(telefone.substring(0, 2).equals("74") || telefone.substring(0, 2).equals("73") || telefone.substring(0, 2).equals("71") || telefone.substring(0, 2).equals("77")){
                ba++;
            }else if(telefone.substring(0, 2).equals("81") || telefone.substring(0, 2).equals("87")){
                pe++;
            }
        }
        System.out.println("Bahia: "+ba+"\nPernambuco: "+pe);
    }
    
}
