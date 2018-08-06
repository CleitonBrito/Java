package biblioteca;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    public static void main(String[] args) throws ParseException{
        int op=0;
        Admin adm = new Admin();
        adm.DataDoSistema();

        ArrayList<Emprestimo> emprestimos = new ArrayList();
        ArrayList<Leitor> leitores = new ArrayList();
        ArrayList<Livro> livro = new ArrayList();
        adm.TirarMulta(emprestimos);
       
        do{
            op = Menu();
            switch (op) {
                
               case 1:  //Cadastrar Leitor
                   
                    Scanner nomeS = new Scanner(System.in);
                    Scanner RGS = new Scanner(System.in);
                    Scanner Senha = new Scanner(System.in);
                    Scanner ender = new Scanner(System.in);
                    Scanner tel = new Scanner(System.in);
                    System.out.println("----------- CADASTRANDO LEITOR -----------------\n");
                    System.out.print("Nome: ");
                    String nome = nomeS.nextLine();
                    System.out.print("RG: ");
                    String RG = RGS.nextLine();
                    System.out.print("Senha: ");
                    String senha = Senha.nextLine();
                    System.out.print("Endereco: ");
                    String endereco = ender.nextLine();
                    System.out.print("Telefone: ");
                    int telefone = tel.nextInt();
                    
                    leitores.add(adm.cadastrarLeitores(nome, RG, senha, endereco, telefone));
                    System.out.println("\nLeitor cadastrado!");
                    break;
                    
               case 2: // Cadastrar Livro
                   
                    Scanner tituloS = new Scanner(System.in);
                    Scanner autorS = new Scanner(System.in);
                    Scanner ISBNS = new Scanner(System.in);
                    Scanner generoS = new Scanner(System.in);
                    Scanner qtdS = new Scanner(System.in);
                    System.out.println("----------- CADASTRANDO LIVRO -----------------\n");
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
                    System.out.println("\nLivro cadastrado!");
                    break;
                   
                case 3:  //Emprestar
                   
                    Scanner leitorS = new Scanner(System.in);
                    Scanner titulo_livro = new Scanner(System.in);
                    Scanner autor_livro = new Scanner(System.in);
                    System.out.println("-------------------- EMPRESTIMO -------------------\n");
                    System.out.print("Leitor: ");
                    String leitor_1 = leitorS.nextLine();
                    System.out.print("Titulo do livro: ");
                    String titulo_1 = titulo_livro.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor_1 = autor_livro.nextLine();
                    
                    if(!livro.isEmpty()){
                        for(int i=0; i < livro.size(); i++){
                            System.out.println("Cadastrados: "+livro.size());
                            System.out.println("Livro: "+livro.get(i).getTitulo());
                            System.out.println("Livro pesquisado: "+titulo_1);
                            System.out.println("Autor: "+livro.get(i).getAutor());
                            System.out.println("Autor pesquisado: "+autor_1);
                            if(livro.get(i)!=null && livro.get(i).getQuantidade() >1 && titulo_1.equals(livro.get(i).getTitulo()) && autor_1.equals(livro.get(i).getAutor())){
                                for(int j=0; j < leitores.size(); j++){
                                    if(leitores.get(j)!=null && leitor_1.equals(leitores.get(j).getNome())){
                                        Scanner Confirm_senha = new Scanner(System.in);
                                        System.out.print("Confirme a senha: ");
                                        String senha_1 = Confirm_senha.nextLine();
                                            if(senha_1.equals(leitores.get(j).getSenha())){
                                                if(leitores.get(j).getN_emprestimo() < 3){
                                                    if(emprestimos.isEmpty()){
                                                        emprestimos.add(adm.emprestar(leitores.get(j), livro.get(i)));
                                                        break;
                                                    }else{
                                                        for(int k=0; k < emprestimos.size(); k++){
                                                            if(emprestimos.get(k)!=null && (emprestimos.get(k).getLeitor() != leitores.get(j)
                                                                    || emprestimos.get(k).getLivro() != livro.get(i))){
                                                                emprestimos.add(adm.emprestar(leitores.get(j), livro.get(i)));
                                                                break;
                                                            }else{
                                                                System.out.println("\nO leitor já possui este livro");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("\nO leitor já possui três emprestimos. "
                                                            + "\nDevolva algum livro!");
                                                    }
                                            }else{
                                                System.out.println("\nSenha incorreta!");
                                                break;
                                            }
                                    }
                                }
                            }
                        }
                    }else{
                        System.out.println("\nSem livros cadastrados!");
                        break;
                    }
                    System.out.println("Impossível emprestar!");
                    break;
                
                case 4: //DEVOLVER/
                    
                    
                    
                    
                    
                default:
                   break;
           }
        }while(op!=0);
        
      
    }
    public static int Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n------------- DIGITE A OPÇÃO -----------------\n");
        System.out.println("[1] CADASTRAR LEITOR");
        System.out.println("[2] CADASTRAR LIVRO");
        System.out.println("[3] EMPRESTAR");
        System.out.println("[4] DEVOLVER");
        System.out.println("[5] RENOVAR");
        
        System.out.print("\nDigite sua opção: ");
        int opcao = input.nextInt();
        System.out.println("--------------------------------------------\n");
        
        return opcao;
    }
}