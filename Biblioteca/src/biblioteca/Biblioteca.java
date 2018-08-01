package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
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
       //livro[3] = adm.cadastrarLivro("Gambiarras", "Projoe", "8888", "Programação", 3);
       
       emprestimos.add(adm.emprestar(cliente[0], livro.get(0)));
       emprestimos.add(adm.emprestar(cliente[1], livro.get(1)));
        
        emprestimos.remove(adm.Devolucao(livro.get(1), emprestimos));
        
        for(int i=0; i<emprestimos.size();i++){
            System.out.println("Emprestimos: "+emprestimos.get(i).getLivro().getTitulo());
        }
        
       
        System.out.println("------------------------------------------");
        
    }
    
}
