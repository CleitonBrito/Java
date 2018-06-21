package determinante;

import java.util.Scanner;

public class MatrizOrdem2{
    
    private int TAMANHO = 2; //Tamanho da matriz: 2x2
    private float [][]MatrizX = new float[TAMANHO][TAMANHO]; // Matriz X
    private float [][]MatrizY = new float[TAMANHO][TAMANHO]; // Matriz Y
    private float PDiagPrin=1, PDiagSec=1; //Produto da diagonal primária/secundária
    private float num1, num2; //Igualdades, número 1 e 2
    private int linha, coluna;

    protected void Igualdade (){ //Inserir os dois números da outra matriz igualdade
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Primeiro número: ");
        this.num1 = num1.nextFloat();
        System.out.print("Segundo número: ");
        this.num2 = num2.nextFloat();
    }

    protected void MostrarMatriz (float [][]Matriz){
        for(int i=0; i < TAMANHO; i ++){
            for(int j=0; j < TAMANHO; j++){
                System.out.printf(Matriz[i][j]+"\t", i,j);
            }
            System.out.println("\n");
        }
    }

    protected float PDiagPrin (float [][]Matriz){ // Produto da diagonal principal
        PDiagPrin=1;
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO; coluna++){
                if(linha==coluna){
                    PDiagPrin *= Matriz[linha][coluna];
                }
            }    
        }
        return PDiagPrin;
    }

    protected float PDiagSec (float [][]Matriz){ //Produto da diagonal secundária
        PDiagSec=1;
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO; coluna++){
                if(linha+coluna==TAMANHO-1){
                    PDiagSec *= Matriz[linha][coluna];
                }
            }
        }
        return PDiagSec;
    }

    protected float DetA (float [][]Matriz){ // Determinante da Matriz
        return PDiagPrin(Matriz)-PDiagSec(Matriz);
    }

    protected float[][] MatX (float [][]Matriz){ //Determinante de X
       for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO; coluna++){
                if(coluna==0){
                    this.MatrizX[0][0] = this.num1;
                    this.MatrizX[1][0] = this.num2;
                }else
                    this.MatrizX[linha][coluna] = Matriz[linha][coluna];
            }
       }
       return this.MatrizX;
   }

    protected float[][] MatY (float [][]Matriz){ //Determinante de Y
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO; coluna++){
                if(coluna==1){
                    this.MatrizY[0][1] = this.num1;
                    this.MatrizY[1][1] = this.num2;
                }else
                    this.MatrizY[linha][coluna] = Matriz[linha][coluna];
            }
        }
        return this.MatrizY;
    }
    
    protected float DetX (float [][]Matriz){
        return ((PDiagPrin(MatrizX)-PDiagSec(MatrizX)))/DetA(Matriz);
    }
    
    protected float DetY(float [][]Matriz){
        return ((PDiagPrin(MatrizY)-PDiagSec(MatrizY)))/DetA(Matriz);
    }
        
}
 
