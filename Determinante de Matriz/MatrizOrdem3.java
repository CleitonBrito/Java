package determinante;

import java.util.Scanner;

public class MatrizOrdem3 {
    
    private int TAMANHO = 3; //Tamanho da matriz: 3x3
    //private int TamLinha, TamColuna;
    private float [][]MatrizNew = new float [TAMANHO][TAMANHO+2];
    private float [][]MatrizX = new float[TAMANHO][TAMANHO+2]; // Matriz X
    private float [][]MatrizY = new float[TAMANHO][TAMANHO+2]; // Matriz Y
    private float [][]MatrizZ = new float[TAMANHO][TAMANHO+2]; // Matriz Z
    private float PDiagPrin1=1, PDiagPrin2=1, PDiagPrin3=1; //Produto das diagonais pricipais
    private float PDiagSec1=1, PDiagSec2=1, PDiagSec3=1; //Produto das diagonais secundárias
    private float DiagnalP=1, DiagnalS=1;
    private float num1, num2, num3; //Igualdades, número 1, 2 e 3
    private int linha, coluna;
    
    protected void Igualdade (){ //Inserir os dois números da outra matriz igualdade
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Primeiro número: ");
        this.num1 = num1.nextFloat();
        System.out.print("Segundo número: ");
        this.num2 = num2.nextFloat();
        System.out.print("Terceiro número: ");
        this.num3 = num3.nextFloat();
    }
    
    protected void MostrarMatriz (float [][]Matriz, int TamLinha, int TamColuna){ 
        for(int i=0; i < TamLinha; i ++){
            for(int j=0; j < TamColuna; j++){
                System.out.printf(Matriz[i][j]+"\t", i,j);
            }
            System.out.println("\n");
        }
    }
    
    protected float[][] MatrizNew (float [][]Matriz, int TamLinha, int TamColuna){
        for(int i=0; i < TamLinha; i++){
            for(int j=0; j < TamColuna; j++){
                switch (j) {
                    case 3:
                        this.MatrizNew[0][3] = Matriz[0][0];
                        this.MatrizNew[1][3] = Matriz[1][0];
                        this.MatrizNew[2][3] = Matriz[2][0];
                        break;
                    case 4:
                        this.MatrizNew[0][4] = Matriz[0][1];
                        this.MatrizNew[1][4] = Matriz[1][1];
                        this.MatrizNew[2][4] = Matriz[2][1];
                        break;
                    default:
                        this.MatrizNew[i][j] = Matriz[i][j];
                        break;
                }
            }
        }
        return this.MatrizNew;
    }
    
    protected void MostrarMatrizNew(){
        for(int i=0; i < TAMANHO; i++){
            for(int j=0; j < TAMANHO+2; j++){
                System.out.printf(this.MatrizNew[i][j]+"\t", i,j);
            }
            System.out.println("\n");
        }
    }
    
    protected float PDiagPrin (float [][]Matriz, int TamLinha, int TamColuna){ // Produto da diagonal principal
        PDiagPrin1=1;
        PDiagPrin2=1;
        PDiagPrin3=1;
        for(linha=0; linha < TamLinha; linha++){
            for(coluna=0; coluna < TamColuna; coluna++){
                if((linha==0 && linha+coluna==0) || (linha==1 && linha+coluna==2) || (linha==2 && linha+coluna==4))
                    PDiagPrin1 *= Matriz[linha][coluna];
                else if((linha==0 && linha+coluna==1) || (linha==1 && linha+coluna==3) || (linha==2 && linha+coluna==5))
                    PDiagPrin2 *= Matriz[linha][coluna];
                else if((linha==0 && linha+coluna==2) || (linha==1 && linha+coluna==4) || (linha==2 && linha+coluna==6))
                    PDiagPrin3 *= Matriz[linha][coluna];
            }
        }
        this.DiagnalP = PDiagPrin1+PDiagPrin2+PDiagPrin3;
        return this.DiagnalP;
    }
    
    protected float PDiagSec (float [][]Matriz, int TamLinha, int TamColuna){ // Produto da diagonal principal
        PDiagSec1=1;
        PDiagSec2=1;
        PDiagSec3=1;
        for(linha=0; linha < TamLinha; linha++){
            for(coluna=0; coluna < TamColuna; coluna++){
                if((linha==0 && linha+coluna==2) || (linha==1 && linha+coluna==2) || (linha==2 && linha+coluna==2))
                    PDiagSec1 *= Matriz[linha][coluna];
                else if((linha==0 && linha+coluna==3) || (linha==1 && linha+coluna==3) || (linha==2 && linha+coluna==3))
                    PDiagSec2 *= Matriz[linha][coluna];
                else if((linha==0 && linha+coluna==4) || (linha==1 && linha+coluna==4) || (linha==2 && linha+coluna==4))
                    PDiagSec3 *= Matriz[linha][coluna];
            }
        }
        this.DiagnalS = PDiagSec1+PDiagSec2+PDiagSec3;
        return this.DiagnalS;
    }
    
    protected float DetA (float [][]Matriz, int TamLinha, int TamColuna){ // Determinante da Matriz
        return PDiagPrin(Matriz,TamLinha,TamColuna)-PDiagSec(Matriz,TamLinha,TamColuna);
    }
    
    protected float[][] MatX (){
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO+2; coluna++){
                if(coluna==0 || coluna==3){
                    this.MatrizX[0][0] = this.num1;
                    this.MatrizX[1][0] = this.num2;
                    this.MatrizX[2][0] = this.num3;
                    this.MatrizX[0][3] = this.num1;
                    this.MatrizX[1][3] = this.num2;
                    this.MatrizX[2][3] = this.num3;
                }else
                    this.MatrizX[linha][coluna] = this.MatrizNew[linha][coluna];
            }
        }
        return this.MatrizX;
    }
    
    protected float[][] MatY (){
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO+2; coluna++){
                if(coluna==1 || coluna==4){
                    this.MatrizY[0][1] = this.num1;
                    this.MatrizY[1][1] = this.num2;
                    this.MatrizY[2][1] = this.num3;
                    this.MatrizY[0][4] = this.num1;
                    this.MatrizY[1][4] = this.num2;
                    this.MatrizY[2][4] = this.num3;
                }else
                    this.MatrizY[linha][coluna] = this.MatrizNew[linha][coluna];
            }
        }
        return this.MatrizY;
    }
    
    protected float[][] MatZ (){
        for(linha=0; linha < TAMANHO; linha++){
            for(coluna=0; coluna < TAMANHO+2; coluna++){
                if(coluna==2){
                    this.MatrizZ[0][2] = this.num1;
                    this.MatrizZ[1][2] = this.num2;
                    this.MatrizZ[2][2] = this.num3;
                }else
                    this.MatrizZ[linha][coluna] = this.MatrizNew[linha][coluna];
            }
        }
        return this.MatrizZ;
    }
    
    protected float DetX (){
        return (PDiagPrin(MatrizX,3,5)-PDiagSec(MatrizX,3,5))/DetA(MatrizNew,3,5);
    }
    
    protected float DetY (){
        return (PDiagPrin(MatrizY,3,5)-PDiagSec(MatrizY,3,5))/DetA(MatrizNew,3,5);
    }
    
    protected float DetZ (){
        return (PDiagPrin(MatrizZ,3,5)-PDiagSec(MatrizZ,3,5))/DetA(MatrizNew,3,5);
    }
}
