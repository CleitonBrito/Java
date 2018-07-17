public class SistemaVendas {
    
    public static void main(String[] args) {
        Vendedor[] vendedores = new Vendedor[3];
            vendedores[0] = new Vendedor(0, "Cleiton", "Filadélfia-BA");
            vendedores[1] = new Vendedor(1, "Paulo", "Pindobaçu-BA");
        
        
        Cliente[] clientes = new Cliente[3]; //new Cliente(0, "Marcos", "Andorinha-BA");
            clientes[0] = vendedores[0].cadastrarCliente(0, "Marcos", "Andorinha-BA");
            clientes[1] = vendedores[0].cadastrarCliente(1, "Felipe", "Campo Formoso-BA");
                
        Produto[] produtos = new Produto[20];
            produtos[0] = vendedores[0].cadastrarProduto(0, 10, 3.99, "Unidade", "Feijão");
            produtos[1] = vendedores[0].cadastrarProduto(1, 15, 2.85, "Unidade", "Arroz");
            produtos[2] = vendedores[0].cadastrarProduto(2, 8, 25, "Kg", "Carne de Sol");
            produtos[3] = vendedores[0].cadastrarProduto(3, 10, 0.90, "Unidade", "Sal");
            produtos[4] = vendedores[0].cadastrarProduto(4, 9, 10, "Kg", "Frango");
            
        Venda[] vendas = new Venda[5];
            vendas[0] = vendedores[0].vender(0, "16/07/2018", clientes[0], vendedores[0], "Cartão");
            
            ItemVenda[] itemVenda = new ItemVenda[20];
                itemVenda[0] = vendedores[0].incluirItem(0, produtos[0], 2, vendas[0]);
                itemVenda[1] = vendedores[0].incluirItem(1, produtos[1], 2, vendas[0]);
                itemVenda[2] = vendedores[0].incluirItem(3, produtos[3], 1, vendas[0]);
            vendedores[0].fecharVenda(vendas[0]);
            
            vendedores[0].mostrarVenda(itemVenda, vendas[0]);
            vendedores[0].mostrarTotaldaVenda(itemVenda, vendas[0]);
        
            vendas[1] = vendedores[0].vender(1, "17/07/2018", clientes[1], vendedores[0], "Dinheiro");
            
                itemVenda[3] = vendedores[0].incluirItem(4, produtos[4], 2, vendas[1]);
                itemVenda[4] = vendedores[0].incluirItem(5, produtos[1], 4, vendas[1]);
            vendedores[0].fecharVenda(vendas[1]);
            
            
            vendedores[0].mostrarVenda(itemVenda, vendas[1]);
            vendedores[0].mostrarTotaldaVenda(itemVenda, vendas[1]);
            
    }
}
