
public class Vendedor {

    private int cod;
    private String nome;
    private String endereco;
    
    public Vendedor(int cod, String nome, String endereco){
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public Venda vender(int cod, String data, Cliente cliente, Vendedor vendedor, String formaPagamento){
        return new Venda(cod, data, cliente, vendedor, formaPagamento);
    }
    public String cancelarVenda(Venda venda){
<<<<<<< Updated upstream
        venda.setSituacao("Cancelado");
        return "Venda cancelada com sucesso!!!";
    }
    public String cancelarItem(){
        return"";
=======
        venda.setSituacao("Cancelado!");
        return "Venda cancelada com sucesso!!!";
    }
    public String cancelarItem(ItemVenda item){
        item.setSituacao("Cancelado!");
        return "Cancelado!";
>>>>>>> Stashed changes
    }
    public Produto cadastrarProduto(int cod, int quantidade, double valorUnit, String tipo, String nome){
        return new Produto(cod, quantidade, valorUnit, tipo, nome);
    }
    public Cliente cadastrarCliente(int cod, String nome, String endereco){
        return new Cliente(cod, nome, endereco);
    }
    public ItemVenda incluirItem(int cod, Produto produto, int quantidade, Venda venda){
        
        double valorUnit = produto.getValorUnit();
        double subTotal = valorUnit * quantidade;
        ItemVenda item = new ItemVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubTotal(subTotal);
        item.setVenda(venda);
<<<<<<< Updated upstream
=======
        item.setSituacao("Ativo");
>>>>>>> Stashed changes
        
        return item;
    }
    
    public ItemVenda incluirItem(int cod, double desconto, Produto produto, int quantidade, Venda venda){
        
        double valorUnit = produto.getValorUnit();
        double subTotal = valorUnit * quantidade;
        ItemVenda item = new ItemVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubTotal(subTotal);
        item.setVenda(venda);
        item.setSituacao("Ativo");
        
        return item;
    }
    
    public String fecharVenda(Venda venda){
        venda.setSituacao("Finalizado!");
        return "Venda finalizada com sucesso!";
    }
    
    public void mostrarVenda(ItemVenda[] itens, Venda venda){
        int cod = venda.getCod();
        String situacao = venda.getSituacao();
        String data = venda.getData();
        Cliente cliente = venda.getCliente();
        Vendedor vendedor = venda.getVendedor();
        String formaPagamento = venda.getFormaPagamento();
        
        System.out.println("------------------------Vendas-------------------------\n\nCódigo: "+cod+"\nSituação: "+situacao+"\nData: "+data+
                "\nNome do Cliente: "+cliente.getNome()+"\nNome do vendedor: "+vendedor.getNome()+"\nForma de pagamento: "+formaPagamento);
        System.out.println("\n----------------------ITENS DE VENDA--------------------------------\n\n");
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(linha.getVenda()==venda){
<<<<<<< Updated upstream
                    System.out.println(
                            "Código: "+linha.getCod()+" Desconto: "+linha.getDesconto()+" Produto: "+linha.getProduto().getNome()
                                    +" Quantidade: "+linha.getQuantidade()+" Sub Total: "+linha.getSubTotal());
                }
            }
        }
    }
    
    public void mostrarTotaldaVenda(ItemVenda[] itens, Venda venda){
        double total=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(linha.getVenda()==venda){
=======
                    System.out.print("Código: "+linha.getCod()+" Desconto: "+linha.getDesconto()+" Produto: "+
                            linha.getProduto().getNome()+" Quantidade: "+linha.getQuantidade()+" Sub Total: "+linha.getSubTotal());
                    if(linha.getSituacao().equals("Cancelado!"))
                        System.out.print(" "+linha.getSituacao());
                    System.out.println("");
                }
             }
          }
    }
    
    double totalemVendas;
    public void mostrarTotaldaVenda(ItemVenda[] itens, Venda venda){
        double total=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(linha.getVenda()==venda && !linha.getSituacao().equals("Cancelado!")){
                    total += linha.getSubTotal();
                }
            }
        }
        System.out.printf("\nO total da venda é: R$ %.2f\n",total);
        this.totalemVendas += total;
    }
    
    public void TotalemVendas(ItemVenda[] itens){
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(!linha.getSituacao().equals("Cancelado!") && linha.getVenda().getSituacao().equals("Cancelado!")){
                    this.totalemVendas -= linha.getSubTotal();
                }
            }
        }
        System.out.println("\n------------------TOTAL EM VENDAS--------------------------");
        System.out.printf("\n\t\tO total em vendas é: R$ %.2f\n", this.totalemVendas);
        System.out.println("-----------------------------------------------------------");
    }
    
    public void TotalemVendasPorData(ItemVenda[] itens, String data){
        double total=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(linha.getVenda().getData().equals(data) && !linha.getVenda().getSituacao().equals("Cancelado!") && !linha.getSituacao().equals("Cancelado!")){
>>>>>>> Stashed changes
                    total += linha.getSubTotal();
                }
            }
        }
<<<<<<< Updated upstream
        System.out.println("\nO total da venda é: "+total);
    }
    
    
=======
        System.out.println("\n--------------TOTAL EM VENDAS POR DATA---------------------");
        System.out.printf("\n\tNa data %s o total em vendas foi: R$ %.2f\n", data, total);
        System.out.println("-----------------------------------------------------------");
    }
    
    public void ApuradoPorItem(ItemVenda[] itens){
        System.out.println("\n---------------------APURADO POR ITEM----------------------\n");
        int[] total = new int[itens.length];
        int contador=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(!linha.getVenda().getSituacao().equals("Cancelado!") && !linha.getSituacao().equals("Cancelado!")){
                    total[contador] = linha.getProduto().getQuantidade();
                    linha.getProduto().setQuantidade(linha.getProduto().getQuantidade()-linha.getQuantidade());
                    contador++;
                }
            }   
        }
        contador=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(!linha.getVenda().getSituacao().equals("Cancelado!") && !linha.getSituacao().equals("Cancelado!")){
                    if(linha.getProduto().getCod()==linha.getCod()){
                        int vendidos=total[contador]-linha.getProduto().getQuantidade();
                        System.out.println(linha.getProduto().getNome()+": "+vendidos+" = R$ "+linha.getProduto().getValorUnit()*vendidos);
                        System.out.println("Quantidade em estoque de "+linha.getProduto().getNome()+": "+linha.getProduto().getQuantidade()+"\n");
                        contador++;
                    }
                }
            }
        }
        System.out.println("-----------------------------------------------------------");
    }
    
    public void ApuradoPorItem(ItemVenda[] itens, String data){
        System.out.println("\n----------------APURADO ITEM POR DATA----------------------\n");
        System.out.printf("Na data %s foram vendidos os itens\n\n", data);
        int[] total = new int[itens.length];
        int contador=0;
        for(ItemVenda linha : itens){
            if(linha!=null){
                if(linha.getVenda().getData().equals(data) && !linha.getVenda().getSituacao().equals("Cancelado!") && !linha.getSituacao().equals("Cancelado!")){
                    System.out.println(linha.getQuantidade()+"x "+linha.getProduto().getNome()+": R$ "+linha.getSubTotal());
                }
                
            }   
        }
        System.out.println("-----------------------------------------------------------");
    }
    //System.out.println("\t- "+linha.getProduto().getNome()+": "+linha.getQuantidade()+" = R$ "+linha.getProduto().getValorUnit()*linha.getQuantidade());
>>>>>>> Stashed changes
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
