package formas;

public class Retangulo  implements IForma {
    // atributo protegido permite que os filhos acessem-o, o mesmo vale para metodos
    protected double base;

    // atributos privados pertecem somente a própria classe
    private double altura;
    
    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
