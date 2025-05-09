package delegacao;

public class Carro {
    
    private Motor motor;

    public Carro() {
        this.motor = new Motor();   // COMPOSICAO
    }

    public void ligar() {
        // aqui precisamos ligar o motor do carro
        motor.ligar();
    }

}
