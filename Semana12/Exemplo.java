import java.util.ArrayList;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {
        
        //    v   representa o tipo da lista, neste caso, uma lista de String
        List<String> nomes = new ArrayList<>();

        // caixas organizadoras
        // organiza por algum coisa
        Caixa<Ferramenta> caixa = new Caixa<>();
        
        var martelo = new Ferramenta("martelo");
        Ferramenta alicate = new Ferramenta("alicate");
        Ferramenta furadeira = new Ferramenta("furadeira");

        caixa.colocar(furadeira);
        caixa.colocar(alicate);
        caixa.colocar(martelo);
        caixa.olhar();

        Caixa<Pilha> cpilha = new Caixa<>();
        Pilha p1 = new Pilha("AA", 1.5f);
        Pilha p2 = new Pilha("9V)", 9);
        cpilha.colocar(p1);
        cpilha.colocar(p2);

        Par<String, Integer> par = new Par<>("Idade", 25);
        par.imprimir(); // Saída: Primeiro: Idade, Segundo: 25
        par.setSegundo(30);
        System.out.println(par.getSegundo()); // Saída: 30

        // T extends Number
        Calculadora<Double> calc = new Calculadora<>();
        System.out.println(calc.soma(2.5, 3.5)); // Saída: 6.0
        System.out.println(calc.multiplicacao(2.0, 3.0)); // Saída: 6.0
        Double[] valores = {2.0, 4.0, 6.0};
        System.out.println(calc.media(valores)); // Saída: 4.0
    }
}