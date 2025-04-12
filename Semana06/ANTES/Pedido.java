import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> items;

    Pedido() {
        this.items = new ArrayList<Produto>();
    }

    public void addProduto(Produto p) {
        this.items.add(p);
    }

    public void processarPagamento(Pagamento pagamento) {
        // calcular a soma dos produtos;
        // executar algum tipo de pagamento
        float valorTotal = 0;
        for (Produto produto : items) {
            System.out.println(produto);
            valorTotal = valorTotal + produto.getPreco();
        }
        
        System.out.println("SITUACAO PAGAMENENTO");
        // var atribui o tipo automaticamente
        var aprovado = pagamento.pagar(valorTotal);
        System.out.println(aprovado);
    }
}
