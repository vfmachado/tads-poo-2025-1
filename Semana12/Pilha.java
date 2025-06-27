public class Pilha {
    private float voltagem;
    private String tipo;

    Pilha(String tipo, float voltagem) {
        this.tipo = tipo;
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return tipo + " - " + voltagem; 
    }
}
