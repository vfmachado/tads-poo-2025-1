public class Pagamento {
    // idealmente um tipo proprio que só aceite valores especificos, vulgo ENUM
    private String tipo;
    private Cartao cartao;

    public Pagamento(String tipo) {
        // PERCEBA A FRAGILIDADE DO NOSSO SISTEMA
        this.tipo = tipo;
    }

    public Pagamento(String tipo, Cartao cartao) {
        this.tipo = tipo;
        this.cartao = cartao;
    }

    public boolean pagar(float valor) {
        if (tipo.equals("PIX")) {
            System.out.println("PROCESSANDO PAGAMENTO TIPO PIX NO VALOR DE " + valor);
            return true;
        }
        if (tipo.equals("CARTAO_CREDITO")) {
            // VERIFICAR LIMITE DO CARTAO
            System.out.println("PROCESSANDO PAGAMENTO TIPO CARTAO NO VALOR DE " + valor);
            return this.cartao.processarCompra(valor);
        }

        if (tipo.equals("DINHEIRO")) {
            // outra regra aqui
        }

        if (tipo.equals("CARTAO_ALIMENTACAO")) {
            // outra regra aqui
        }

        return false;
    }


}
