/* Algoritmo desenvolvido em Java por Cleiton Brito em 21/06/2018 com o objetivo
 * de resolver Determinantes de segunda e terceira ordem, matrizes 2x2 e 3x3 
 * respectivamente.
 * OBS.: Essa classe deve ser usada em conjuntos com outras duas:
 * MatrizOrdem2.class e MatrizOrdem3.class
 */

package determinante;

import java.util.Scanner;


public class Determinante {
    public static void main(String[] args) {
        //Informar a quantidade de linhas e colunas da matriz
        System.out.println("Descubra o determinante de matrizes de ordem 2 ou 3."+
        "\nInsira a ordem da matriz! Exemplo: 2\n");
        System.out.print("Informe a ordem da matriz: ");
        Scanner entrada = new Scanner(System.in);
        int tamanho = entrada.nextInt();
        float [][]Matriz = new float[tamanho][tamanho]; // Matriz original
        
        if(tamanho == 2 || tamanho == 3){
            int linha, coluna;
            Scanner itens = new Scanner(System.in);
            System.out.println("\nPreenchendo matriz...\n");
            for(linha=0; linha < tamanho; linha++){
                for(coluna=0; coluna < tamanho; coluna++){
                    System.out.printf("Posição[%d][%d]: ", linha, coluna);
                    Matriz[linha][coluna] = itens.nextFloat();
                }
            }
        }else
            System.out.println("Tamanho não aceito. Favor inserir Matriz de ordem 2 ou 3!");
        
        System.out.println("");
        Scanner op = new Scanner(System.in); // Igualdade
        switch (tamanho) {
            //Se a matriz for de ordem 2
            case 2:
                MatrizOrdem2 MaOrd2 = new MatrizOrdem2(); //Instanciar objeto da Classe: MatrizOrdem2
                System.out.print("Tem igualdade?\n[1] - SIM\n[2] - NÃO\nOpção: ");
                int resposta = op.nextInt();
                float [][]MatrizOrd2X = MaOrd2.MatX(Matriz);
                float [][]MatrizOrd2Y = MaOrd2.MatY(Matriz);
                    if(resposta == 1){
                        MaOrd2.Igualdade();
                        System.out.println("\nMatriz A\n");
                        MaOrd2.MostrarMatriz(Matriz);
                        System.out.println("Produto Diagonal Principal de A: "+MaOrd2.PDiagPrin(Matriz));
                        System.out.println("Produto Diagonal Secundário de A: "+MaOrd2.PDiagSec(Matriz));
                        System.out.println("Determinante de A: "+MaOrd2.DetA(Matriz));
                        //Matriz X
                        System.out.println("\nMatriz X\n");
                        MaOrd2.MatX(Matriz);
                        MaOrd2.MostrarMatriz(MatrizOrd2X);
                        System.out.println("Produto Diagonal Principal de X: "+MaOrd2.PDiagPrin(MatrizOrd2X));
                        System.out.println("Produto Diagonal Segundária de X: "+MaOrd2.PDiagSec(MatrizOrd2X));
                        System.out.println("Determinante de X: "+MaOrd2.DetX(Matriz));
                        //Matriz Y
                        System.out.println("\nMatriz Y\n");
                        MaOrd2.MatY(Matriz);
                        MaOrd2.MostrarMatriz(MatrizOrd2Y);
                        System.out.println("Produto Diagonal Principal de Y: "+MaOrd2.PDiagPrin(MatrizOrd2Y));
                        System.out.println("Produto Diagonal Segundária de Y: "+MaOrd2.PDiagSec(MatrizOrd2Y));
                        System.out.println("Determinante de Y: "+MaOrd2.DetY(Matriz));
                        System.out.println("\nResultado:\nDeterminante de A: "+MaOrd2.DetA(Matriz)+"\nDeterminante de X: "+MaOrd2.DetX(Matriz)+"\nDeterminante de Y: "+MaOrd2.DetY(Matriz));
                    }
                    else{
                        System.out.println("\nMatriz A\n");
                        MaOrd2.MostrarMatriz(Matriz);
                        System.out.println("Produto Diagonal Principal de A: "+MaOrd2.PDiagPrin(Matriz));
                        System.out.println("Produto Diagonal Secundário de A: "+MaOrd2.PDiagSec(Matriz));
                        System.out.println("\nDeterminante de A: "+MaOrd2.DetA(Matriz));
                    }
                    break;
            case 3:
                MatrizOrdem3 MaOrd3 = new MatrizOrdem3(); //Instanciar objeto da Classe: MatrizOrdem3
                System.out.print("Tem igualdade?\n[1] - SIM\n[2] - NÃO\nOpção: ");
                resposta = op.nextInt();
                float [][]MatrizNew = MaOrd3.MatrizNew(Matriz, 3, 5);
                float [][]MatrizOrd3X = MaOrd3.MatX();
                float [][]MatrizOrd3Y = MaOrd3.MatY();
                float [][]MatrizOrd3Z = MaOrd3.MatZ();
                    if(resposta == 1){
                        MaOrd3.Igualdade();
                        System.out.println("");
                        MaOrd3.MostrarMatriz(Matriz,3,3);
                        MaOrd3.MatrizNew(Matriz,3,5);
                        System.out.println("Nova Matriz\n");
                        MaOrd3.MostrarMatrizNew();
                        System.out.println("\nO produto é: "+MaOrd3.PDiagPrin(MatrizNew,3,5));
                        System.out.println("O produto é: "+MaOrd3.PDiagSec(MatrizNew,3,5));
                        System.out.println("Determinante de A: "+MaOrd3.DetA(MatrizNew,3,5));
                        //Matriz X
                        System.out.println("\nMatriz X\n");
                        MaOrd3.MatX();
                        MaOrd3.MostrarMatriz(MatrizOrd3X,3,5);
                        System.out.println("Produto Diagonal Principal de X: "+MaOrd3.PDiagPrin(MatrizOrd3X,3,5));
                        System.out.println("Produto Diagonal Segundária de X: "+MaOrd3.PDiagSec(MatrizOrd3X,3,5));
                        System.out.println("Determinante de X: "+MaOrd3.DetX());
                        //Matriz Y
                        System.out.println("\nMatriz Y\n");
                        MaOrd3.MatY();
                        MaOrd3.MostrarMatriz(MatrizOrd3Y,3,5);
                        System.out.println("Produto Diagonal Principal de Y: "+MaOrd3.PDiagPrin(MatrizOrd3Y,3,5));
                        System.out.println("Produto Diagonal Segundária de Y: "+MaOrd3.PDiagSec(MatrizOrd3Y,3,5));
                        System.out.println("Determinante de Y: "+MaOrd3.DetY());
                        //Matriz Z
                        System.out.println("\nMatriz Z\n");
                        MaOrd3.MatZ();
                        MaOrd3.MostrarMatriz(MatrizOrd3Z,3,5);
                        System.out.println("Produto Diagonal Principal de Z: "+MaOrd3.PDiagPrin(MatrizOrd3Z,3,5));
                        System.out.println("Produto Diagonal Segundária de Z: "+MaOrd3.PDiagSec(MatrizOrd3Z,3,5));
                        System.out.println("Determinante de Z: "+MaOrd3.DetZ());
                        System.out.println("\nResultado:\nDeterminante de A: "+MaOrd3.DetA(MatrizNew,3,5)+"\nDeterminante de X: "+MaOrd3.DetX()+"\nDeterminante de Y: "+MaOrd3.DetY()+"\nDeterminante de Z: "+MaOrd3.DetZ());
                    }else{
                        System.out.println("");
                        MaOrd3.MostrarMatriz(Matriz,3,3);
                        MaOrd3.MatrizNew(Matriz,3,5);
                        System.out.println("Nova Matriz\n");
                        MaOrd3.MostrarMatrizNew();
                        System.out.println("\nO produto é: "+MaOrd3.PDiagPrin(MatrizNew,3,5));
                        System.out.println("O produto é: "+MaOrd3.PDiagSec(MatrizNew,3,5));
                        System.out.println("Determinante de A: "+MaOrd3.DetA(MatrizNew,3,5));
                    }
                    break;
        }
    } //Fim Main
}
