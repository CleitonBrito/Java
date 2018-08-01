package biblioteca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Admin {
    private Emprestimo emprestimo;
    private String data_sistema;
    private String data_devolucao;
    private LocalDate dataSistema;
    private LocalDate dataDevolucao;
    
    public void DataDoSistema(){
        Date data = new Date();
        this.dataSistema = LocalDate.now();
        SimpleDateFormat dataFormat;
        dataFormat = new SimpleDateFormat("dd/MM/YYYY");
        setData_sistema(dataFormat.format(data));
        setData_devolucao(dataFormat.format(devolucao_data(+7, data)));
        
        int dia =0, mes=0, ano=0;
        
        dia = Integer.parseInt(this.data_devolucao.substring(0, 2));
        mes = Integer.parseInt(this.data_devolucao.substring(3, 5));
        ano = Integer.parseInt(this.data_devolucao.substring(6, 10));
        
        this.dataDevolucao = LocalDate.of(ano, mes, dia); 
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
        if(cliente.getDias_multa()==0 && cliente.getN_emprestimo()<3 &&
            livro.getSituacao().equals("Disponível")){
            livro.setSituacao("Indisponível");
            livro.setQuantidade(livro.getQuantidade()-1);
            cliente.setN_emprestimo(cliente.getN_emprestimo()+1);
            System.out.println("Livro: "+livro.getTitulo()+"\nCliente: "+cliente.getNome()+"\nSituação: "+livro.getSituacao()+
                    "\nQuantidade: "+livro.getQuantidade()+"\nEmprestimos do cliente: "+cliente.getN_emprestimo());
            System.out.println("---------------------------------------------------");
            return new Emprestimo(this.getData_sistema(), this.getData_devolucao(), cliente, livro);
        }
        else{
            if(cliente.getDias_multa()!=0){
                System.out.println("Cliente com multa! Impossível emprestar");
            }if(cliente.getN_emprestimo()==3){
                System.out.println("Cliente já possui três emprestimos!");
            }if(!livro.getSituacao().equals("Disponível"))
                System.out.println("Livro indisponível!");
        }
        System.out.println("---------------------------------------------------");
        return null;
    }
    
    public Emprestimo Devolucao(Livro livro, ArrayList<Emprestimo> emprestimos){
        int i=0;
        for(i=0; i < emprestimos.size(); i++){
            if(emprestimos.get(i)!=null){
                if(livro==emprestimos.get(i).getLivro()){
                    Multa(emprestimos.get(i));
                    System.out.println("Devolvido com Sucesso!");
                    return emprestimos.get(i);
                }
            }
        livro.setSituacao("Disponível");
        livro.setQuantidade(livro.getQuantidade()+1);
        }
        return emprestimos.get(i);
    }
    
    public static final long TEMPO = (6000 * 60);
    public static final String HORA = "00:00";
    public void TirarMulta(ArrayList<Emprestimo> emprestimo){
        Date data = new Date();
        DateFormat hora = new SimpleDateFormat("HH:mm");
        String horaF = hora.format(data);
        Timer timer = null;
        if(timer==null){
            timer = new Timer();
            TimerTask retirar = new TimerTask() {
                @Override
                public void run() {
                    try{
                        if(horaF==HORA){
                            for(int i=0; i< emprestimo.size(); i++){
                                emprestimo.get(i).getCliente().setDias_multa(emprestimo.get(i).getCliente().getDias_multa()-1);
                            }
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };
            timer.scheduleAtFixedRate(retirar, TEMPO, TEMPO);
        }
    }
    
    public void Multa(Emprestimo emprestimos){
        Period periodo = Period.between(this.dataDevolucao, this.dataSistema);
        if(periodo.getDays()>0){
            emprestimos.getCliente().setDias_multa(periodo.getDays()*2);
            System.out.printf("O leitor %s obteve multa de %s por atraso\n", emprestimos.getCliente().getNome(), emprestimos.getCliente().getDias_multa());
        }
    }
    
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }  

    public String getData_sistema() {
        return data_sistema;
    }

    public void setData_sistema(String data_sistema) {
        this.data_sistema = data_sistema;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
