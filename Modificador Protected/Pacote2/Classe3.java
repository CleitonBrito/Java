package Pacote2;

import Pacote1.Classe1;

public class Classe3 extends Classe1 {
    
    public Classe3(){
        super("Valor 6");
    }
    
    public  String get(){
        return valor1;
    }
    
    public static void main(String[] args) {
        Classe3 objClasse3 = new Classe3();
        System.out.println(objClasse3.get());
    }
}
