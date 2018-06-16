
package determinante;

import java.util.Scanner;


public class Determinante {
    public static void main(String[] args) {
        System.out.print("Informe a quantidade de linhas: ");
        Scanner linha = new Scanner(System.in);
        int qtdLinha = linha.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        Scanner coluna = new Scanner (System.in);
        int qtdColuna = coluna.nextInt();
        
        
      
        
        int [][]Matriz = new int[qtdLinha][qtdColuna];
        int i, j;
        for(i=0; i < qtdLinha; i++){
            for(j=0; j < qtdColuna; j++){
                System.out.printf("Posição[%d][%d]: ", i, j);
                Matriz[i][j] = linha.nextInt();
            }
        }
        System.out.println("\n");
        
        for(i=0; i < qtdLinha; i++){
            for(j=0;j < qtdColuna; j++){
                System.out.printf(Matriz[i][j]+"\t", i,j);
            }
            System.out.println("\n");
        }
    }
    
}
