package formas;

public class Quadrado extends Retangulo {
    
    Quadrado(double a) {
        //  NA CLASSE FILHA É OBRIGATORIO CHAMAR EXPLICITAMENTE O CONSTRUTOR DA CLASSE PAI QUANDO ELE É DEFINIDO
        super(a, a);
    }

    public double getLado() {
        return this.base;
        // return this.getBase();
    }

}
