package avaliacaoi;

import java.util.Collection;
import java.util.ArrayList;

public class AvaliacaoI {
    public static void main(String[] args) {
        
        //NUMERO 1 - INICIA AQUI
        
        System.out.println("\nNumero 1 - a e b\n");
        String listaMensagens[] = new String[5];
        listaMensagens[0]="Olá meu nome é João Mourato moro em Senhor do Bonfim/BA e meu e-mail é joao.mourato@gmail.com";
        listaMensagens[1]="Anota meu endereçoo eletrónico pedroalcantra@gmail.com e meu telefone é : 87 9 9999-9999";
        listaMensagens[2]="Boa noite meu e-mail de contata é fabio@bolcom";
        listaMensagens[3]="Está aí meu e-mail: cleisson@formigueirotecnologico.com.br estarei aguardando seu retono";
        listaMensagens[4]="Contato: mariapedrina @ gmail . com";
        
        //Letra B
        String listaEmails[] = new String[5];
        String separar[] = new String[100];
        for (int i=0; i < listaMensagens.length; i++){
            for(int j=0; j < separar.length; j++){   
                separar = listaMensagens[i].split(" ");
                    if(separar[j].matches("|[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}|[a-z|A-Z]\\w+\\.\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}|[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}\\.[a-z|A-Z]{2,3}")){
                        listaEmails[i] = separar[j];
                        System.out.println(listaEmails[i]);
                    }
              //System.out.println(separar[j]);
        }
        }
        
        // Numero 2 - INICIA AQUI
        
        System.out.println("\nNumero 2\n");
        String[] link = new String[3];
        link[0]="http://www.baixaki.com.br/?id=rb.moc.knilretrevni.www.//:ptth";
        link[1]="http://www.baixaki.com.br/?page=rb.moc.knilretrevni.www.//:ptth";
        link[2]="http://www.baixaki.com.br/?link=rb.moc.knilretrevni.www.//:ptth";
        
        String[] linkI = new String[3];
        String[] separar2 = new String[10];
        String[] linkC = new String[3];
        int posicao;
        
        for(int i=0; i < link.length; i++){
            if(link[i].contains("=")){
                posicao = link[i].indexOf("=");
                separar2[i] = link[i].substring(posicao+1, link[i].length());
                linkI[i] = new StringBuffer(separar2[i]).reverse().toString();
                System.out.println(linkI[i]);
            }
        }
        
        //Numero 3 - INICIA AQUI
        
        
        String links[] = new String[2];
        links[0]="http://www.uol.com.br:8080/pasta/pagina1.php";
        links[1]="ftp://microsoft.com:21/pasta";
        
        
        System.out.println("\nNumero 3 - Letra C-I\n");
        String protocolo = null;
        String porta = null;
        for(int i =0; i < links.length; i++){
            if(links[i].startsWith("http") && links[i].contains("8080")){
                porta = "8080";
                protocolo = "http";
            }else if(links[i].startsWith("ftp") && links[i].contains("21")){
                porta = "21";
                protocolo = "ftp";
            }else if(links[i].startsWith("tcp") && links[i].contains("20")){
                porta = "20";
                protocolo = "tcp";
            }
            System.out.println("O protocolo de "+i+" de endereço é:"+protocolo+" e porta: "+porta);
        }
    }
}