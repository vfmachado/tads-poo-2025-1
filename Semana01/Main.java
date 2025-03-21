public class Main {
    public static void main(String [] args) {

        AguaMineral agua = new AguaMineral();
        System.out.println(agua);   // agua é um ponteiro
                                    // para a memoria durante a execuçao
                                    // vai aparcer algo como
                                    // AguaMineral@HEXADECIMAL
        
        System.out.println(agua.estaAberta());
        System.out.println(agua.quantoTem());

        // passagem por referencia
        Referencia.alterar(agua);
        System.out.println(agua.quantoTem());
        
        // passagem do valor
        Referencia.alterar(agua.quantoTem());
        System.out.println(agua.quantoTem());  // 300 ou 100?

        // TEORICAMENTE O MESMO RESULTADO
        String estado = "fechada";
        int quantidadeMl = 500;

        // CLASSE AGUAMINERAL E OBJETO AGUA2
        AguaMineral agua2 = new AguaMineral();
        // isso é péssimo
        // pq a classe permite que os seus atributos sejam acessados livremente.
        // e se eu posso fazer isso, eu posso quebrar o meu codigo;
        // agua2.quantidadeMl = 100000;

        agua2.abrir();
        agua2.beber(100);
        System.out.println("agua2.quantidadeMl " + agua2.quantoTem());

        // nao conseguimos mais acessar diretamente esse cara
        // agua2.quantidadeMl = 1000;
    }  
}