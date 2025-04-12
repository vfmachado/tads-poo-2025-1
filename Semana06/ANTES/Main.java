public class Main {
    
    public static void main(String[] args) {
        
        Produto aguaGas = new Produto("Agua com Gas", 5);

        Produto coca = new Produto("Coca cola", 15);
        // coca2 é um produto diferente, aponta para um endereco diferente
        //Produto coca2 = new Produto("Coca cola", 15);
        Produto pizza = new Produto("Pizza Calabresa", 69.9f);
        
        Produto calzone = new Produto("Calzone", 49.9f);

        Produto thunderTrio = new Produto("Thunder Trio", 29.9f);



        // System.out.println(coca);
        // System.out.println(pizza);

        Pedido pedido1 = new Pedido();
        pedido1.addProduto(coca);
        pedido1.addProduto(pizza);

        Pagamento pagamento = new Pagamento("PIX");
        pedido1.processarPagamento(pagamento);

        System.out.println("\n==== PEDIDO 2====");
        Pedido p2 = new Pedido();
        p2.addProduto(calzone);
        p2.addProduto(aguaGas);
        Pagamento pag2 = new Pagamento("CARTAO_CREDITO", new Cartao("123"));
        p2.processarPagamento(pag2);


        System.out.println("\n===== PEDIDO 3 ====");
        Pedido p3 = new Pedido();
        p3.addProduto(pizza);
        p3.processarPagamento(pag2);

    }

}
