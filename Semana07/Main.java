import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PARA O NOSSO SISTEMA DE ALUNOS E PROFESSORES, FAZ SENTIDO PODER INSTANCIAR UMA PESSOA?
        // Pessoa p1 = new Pessoa("VINICIUS");
        // NAO POSSO / CONSIGO INSTANCIAR PESSOA POIS ELA É ABSTRATA.

        Aluno a1 = new Aluno("Gustavo Silva");
        System.out.println(a1);

        Professor p1 = new Professor("Vinicius Machado");
        System.out.println(p1);

        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(a1);
        lista.add(p1);
    }
}