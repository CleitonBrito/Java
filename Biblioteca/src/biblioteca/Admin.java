package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Admin {
    private Emprestimo emprestimo;
    private final LocalDate dataSistema = LocalDate.now();
    private LocalDate dataDevolucao;
    
    private String dataHoje;
    private String DataDevolucao;
    
    public void DataDoSistema(){
        java.sql.Date dateHoje = java.sql.Date.valueOf(this.dataSistema);
        SimpleDateFormat formatador  = new SimpleDateFormat("dd/MM/yyyy");
        this.setDataHoje(formatador.format(dateHoje));
        
        this.dataDevolucao = LocalDate.from(this.dataSistema);
        this.setDataDevolucao(formatador.format(devolucao_data(+7, dateHoje))); 
    }   
    
    public static Date devolucao_data (int dias, Date data){
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        calendario.add(Calendar.DATE, dias);
        return calendario.getTime();
     }
    
    public Leitor cadastrarLeitores(String nome, String RG, String senha, String endereco, int telefone){
        return new Leitor(nome, RG, senha, endereco, telefone);
    }
    
    public Livro cadastrarLivro(String titulo, String autor, String ISBN, String genero, int quantidade){
        return new Livro(titulo, autor, ISBN, genero, quantidade);
    }
    
    public Emprestimo emprestar(Leitor leitor, Livro livro){
        livro.setSituacao("Indisponível");
        livro.setQuantidade(livro.getQuantidade()-1);
        leitor.setN_emprestimo(leitor.getN_emprestimo()+1);
        System.out.println("-------------------- EMPRESTADO -------------------\n");
        System.out.println("Livro: "+livro.getTitulo()+"\nCliente: "+leitor.getNome()+
                "\nEmprestimos do cliente: "+leitor.getN_emprestimo()+"\nData emprestimo: "
                +this.dataHoje+"\nDevolução: "+this.DataDevolucao);
        System.out.println("---------------------------------------------------");
            
         return new Emprestimo(this.dataHoje, this.DataDevolucao, leitor, livro);
    }
            
    public Emprestimo Devolucao(Livro livro, ArrayList<Emprestimo> emprestimos){
        int i;
        for(i=0; i < emprestimos.size(); i++){
            if(emprestimos.get(i)!=null){
                if(livro==emprestimos.get(i).getLivro()){
                    livro.setSituacao("Disponível");
                    livro.setQuantidade(livro.getQuantidade()+1);
                    emprestimos.get(i).setN_renovacao(0);
                    emprestimos.get(i).getLeitor().setN_emprestimo(emprestimos.get(i).getLeitor().getN_emprestimo()-1);
                    System.out.println("------------------- DEVOLUÇÃO ---------------------");
                    System.out.println("\nLivro: "+livro.getTitulo()+"\nCliente: "+emprestimos.get(i).getLeitor().getNome()+
                    "\nEmprestimos do cliente: "+emprestimos.get(i).getLeitor().getN_emprestimo()+"\nData emprestimo: "
                    +emprestimos.get(i).getData_emprestimo()+"\nDevolução: "+emprestimos.get(i).getData_devolucao());
                    Multa(emprestimos.get(i));
                    System.out.println("\nDevolvido com Sucesso!");
                    return emprestimos.get(i);
                }
            }
        }
        return emprestimos.get(i);
    }
    
    public void Renovar(ArrayList<Emprestimo> emprestimo, Leitor leitor, Livro livro) throws ParseException{
        for(int i=0; i < emprestimo.size(); i++){
            if(emprestimo.get(i) != null){
                if(leitor == emprestimo.get(i).getLeitor()){
                    if(livro == emprestimo.get(i).getLivro()){
                        if(emprestimo.get(i).getN_renovacao() < 3){
                            if(leitor.getDias_multa() == 0){
                                Date data = new Date();
                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                data = formato.parse(emprestimo.get(i).getData_devolucao());
                                emprestimo.get(i).setData_devolucao(formato.format(devolucao_data(+7, data)));
                                emprestimo.get(i).setN_renovacao(emprestimo.get(i).getN_renovacao()+1);
                                System.out.println("------------------- RENOVAÇÃO ---------------------");
                                System.out.println("\nLivro: "+livro.getTitulo()+"\nCliente: "+leitor.getNome()+
                                "\nEmprestimos do cliente: "+leitor.getN_emprestimo()+"\nData emprestimo: "
                                +emprestimo.get(i).getData_emprestimo()+"\nDevolução: "+emprestimo.get(i).getData_devolucao()+
                                "\nRenovações: "+emprestimo.get(i).getN_renovacao());
                            }
                        }
                    }
                }
            }
        }
    }
 
    public void Multa(Emprestimo emprestimos){
        int multa = Dias_Multa(emprestimos);
        if(multa>0){
            emprestimos.getLeitor().setDias_multa(multa*2);
            System.out.printf("O leitor %s obteve multa de %s dias por atraso\n", emprestimos.getLeitor().getNome(), emprestimos.getLeitor().getDias_multa());
        }
    }
    
    public int Dias_Multa(Emprestimo emprestimos){
        int total_dias=0;
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(emprestimos.getData_devolucao(), formato);
        
        Period periodo = Period.between(this.dataSistema, date);
        
        if(periodo.isNegative()){
            total_dias -= periodo.getDays();
        }

        return total_dias;
    }
    
    public void TirarMulta(ArrayList<Emprestimo> emprestimo){
        Period periodo = Period.between(this.dataDevolucao, this.dataSistema);
        
        if(periodo.getDays()>0){
            for(int i=0; i < emprestimo.size(); i++){
                if (emprestimo.get(i)!=null) {
                    if(periodo.getDays()>0 && periodo.getDays()==emprestimo.get(i).getLeitor().getDias_multa()){
                        emprestimo.get(i).getLeitor().setDias_multa(0);
                        System.out.println("A multa de "+emprestimo.get(i).getLeitor().getNome()+" foi quitada!");
                    }
                }
            }
        }
    }
    
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }  

    public String getDataHoje() {
        return dataHoje;
    }

    public void setDataHoje(String dataHoje) {
        this.dataHoje = dataHoje;
    }

    public String getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

}
