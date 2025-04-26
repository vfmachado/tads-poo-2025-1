package formas;

public class MainForma {
    public static void main(String[] args) {
        
        IForma circulo = new Circulo(1);
        System.out.println(circulo.calcularArea());

        IForma quadrado = new Quadrado(2);
        System.out.println(quadrado.calcularArea());

    }
}