public class Cartao {
    
    private String numero;
    private float limite = 100;

    Cartao(String numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public boolean processarCompra(float valor) {
        if (valor <= limite) {
            limite = limite - valor;
            return true;
        }
        return false;
    }


}
