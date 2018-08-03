package biblioteca;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    public static void main(String[] args){
       Admin adm = new Admin();
       adm.DataDoSistema();
       
       ArrayList<Emprestimo> emprestimos = new ArrayList();
       Cliente[] cliente = new Cliente[100];
       ArrayList<Livro> livro = new ArrayList();
       adm.TirarMulta(emprestimos);
       
       cliente[0] = adm.cadastrarCliente("Ana", "1", "RuaA", 001);
       cliente[1] = adm.cadastrarCliente("João", "1555", "Rio de Janeiro", 14444);
       livro.add(adm.cadastrarLivro("As aventuras", "Jó", "18-888", "aventura", 5));
       livro.add(adm.cadastrarLivro("Vampires", "Doidão", "885489", "terror", 12));
       livro.add(adm.cadastrarLivro("Dois amores", "Fernanda", "15555", "romance", 21));
       
       int i=1;
       if(i==1){
           Scanner tituloS = new Scanner(System.in);
           Scanner autorS = new Scanner(System.in);
           Scanner ISBNS = new Scanner(System.in);
           Scanner generoS = new Scanner(System.in);
           Scanner qtdS = new Scanner(System.in);
           
           System.out.print("Titulo: ");
           String titulo = tituloS.nextLine();
           System.out.print("Autor: ");
           String autor = autorS.nextLine();
           System.out.print("ISBN: ");
           String ISBN = ISBNS.nextLine();
           System.out.print("Genero: ");
           String genero = generoS.nextLine();
           System.out.print("Quantidade: ");
           int quant = qtdS.nextInt();
           livro.add(adm.cadastrarLivro(titulo, autor, ISBN, genero, quant));
           System.out.println("Livro cadastrado!");
           i++;
       }
       
       if(i==2){
           Scanner nomeS = new Scanner(System.in);
           Scanner RGS = new Scanner(System.in);
           Scanner ender = new Scanner(System.in);
           Scanner tel = new Scanner(System.in);
           
           System.out.print("Nome: ");
           String nome = nomeS.nextLine();
           System.out.print("RG: ");
           String RG = RGS.nextLine();
           System.out.print("Endereco: ");
           String endereco = ender.nextLine();
           System.out.print("Telefone: ");
           int telefone = tel.nextInt();
           cliente[2] = adm.cadastrarCliente(nome, RG, endereco, telefone);
           System.out.println("Cliente cadastrado!");
       }
       
       emprestimos.add(adm.emprestar(cliente[2], livro.get(3)));
       
       
       Scanner inputCliente = new Scanner(System.in);
       Scanner inputLivro = new Scanner(System.in);
       Scanner inputAutor = new Scanner(System.in);
        
        System.out.print("\nCliente: ");
        String nomeCliente = inputCliente.nextLine();
        //String tituloLivro = inputLivro.nextLine();
        //String nomeAutor = inputAutor.nextLine();
        
        if(nomeCliente.equals(cliente[2].getNome())){
             System.out.println("Iguais");
        }
 
        /*for(int i=0; i<emprestimos.size();i++){
            System.out.println("Emprestimos: "+emprestimos.get(i).getLivro().getTitulo());
        }*/
        
       
        System.out.println("------------------------------------------");
        
    }
}