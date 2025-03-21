public class Referencia {

    // PUBLIC STATIC VOID NOME ( ATRIBUTOS )
    //  PUBLIC ->  VISIBILIDADE
    //  STATIC -> O ATRIBUTO OU METODO PERTECEM A DEFINIÇÃO DA CLASSE E NAO AS INSTANCIAS DELA
    //  VOID => TIPO DE RETORNO DO METODO, QUANDO VOID, SIGNIFICA QUE NAO TEM RETORNO

    // nao tem return
    public static void mostraTexto(String texto) {
        System.out.println(texto);
    }
    
    // o int na assinatura obriga um return com o tipo inteiro
    public static int soma(int a, int b) {
        return a + b;
    }

    // AGUA É UMA CLASSE, LOGO A PASSAGEM É POR REFERENCIA
    public static void alterar(AguaMineral agua) {
        agua.beber(200);;
    }

    // tipo primitivo
    public static void alterar(int quantidade) {
        quantidade = 100;
    }
}
