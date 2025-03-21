public class AguaMineral {
    private String estado = "fechada";
    // visibilidade public / private / protected
    private int quantidadeMl = 500;

    // VOID => TIPO DE RETORNO
    // NESSE CASO, COMO NAO TEM RETORNO É VOID
    void beber(int quantidade) {
        if (estado.equals("fechada")) {
            System.out.println("nao pode beber, esta fechada");
            return; // early return => finaliza aqui o metodo entao nao preciso de um else e evito codigo hadouken
        }

        quantidadeMl = quantidadeMl - quantidade;
        if (quantidadeMl < 0) {
            quantidadeMl = 0;
        }
    }

    int quantoTem() {
        return quantidadeMl;
    }

    boolean estaAberta() {
        return estado.equals("aberta");
    }

    void abrir() {
        estado = "aberta";
    }

    void fechar() {
        estado = "fechada";
    }
}