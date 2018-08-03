package biblioteca;

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
        Calendar calendário = Calendar.getInstance();
        calendário.setTime(data);
        calendário.add(Calendar.DATE, dias);
        return calendário.getTime();
     }
    
    public Cliente cadastrarCliente(String nome, String RG, String endereco, int telefone){
        return new Cliente(nome, RG, endereco, telefone);
    }
    
    public Livro cadastrarLivro(String titulo, String autor, String ISBN, String genero, int quantidade){
        return new Livro(titulo, autor, ISBN, genero, quantidade);
    }
    
    public Emprestimo emprestar(Cliente cliente, Livro livro){
        livro.setSituacao("Indisponível");
        livro.setQuantidade(livro.getQuantidade()-1);
        cliente.setN_emprestimo(cliente.getN_emprestimo()+1);
        System.out.println("------ EMPRESTIMO --------\n");
        System.out.println("Livro: "+livro.getTitulo()+"\nCliente: "+cliente.getNome()+
                "\nEmprestimos do cliente: "+cliente.getN_emprestimo()+"\nData emprestimo: "
                +this.dataHoje+"\nDevolução: "+this.DataDevolucao);
        System.out.println("---------------------------------------------------");
            
         return new Emprestimo(this.dataHoje, this.DataDevolucao, cliente, livro);
    }
            
    public Emprestimo Devolucao(Livro livro, ArrayList<Emprestimo> emprestimos){
        int i;
        for(i=0; i < emprestimos.size(); i++){
            if(emprestimos.get(i)!=null){
                if(livro==emprestimos.get(i).getLivro()){
                    Multa(emprestimos.get(i));
                    System.out.println("------------------- DEVOLUÇÃO ---------------------");
                    System.out.println("Leitor: "+emprestimos.get(i).getCliente().getNome()+
                            "\nLivro: "+livro.getTitulo());
                    System.out.printf("O leitor %s obteve multa de %s dias por atraso\n", emprestimos.get(i).getCliente().getNome(), emprestimos.get(i).getCliente().getDias_multa());
                    System.out.println("\nDevolvido com Sucesso!");
                    return emprestimos.get(i);
                }
            }
        livro.setSituacao("Disponível");
        livro.setQuantidade(livro.getQuantidade()+1);
        }
        return emprestimos.get(i);
    }
 
    public void Multa(Emprestimo emprestimos){
        int multa = Dias_Multa(emprestimos);
        if(multa>0){
            emprestimos.getCliente().setDias_multa(multa*2);
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
                    if(periodo.getDays()>0 && periodo.getDays()==emprestimo.get(i).getCliente().getDias_multa()){
                        emprestimo.get(i).getCliente().setDias_multa(0);
                        System.out.println("A multa de "+emprestimo.get(i).getCliente().getNome()+" foi quitada!");
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
