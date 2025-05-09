package composicao;

public class Cliente {

    private String nome;
    private Endereco endereco;

    // NESTE CASO O CLIENTE NAO ESPERA UM INSTANCIA DE ENDERECO
    public Cliente(String nome, String rua) {
        this.nome = nome;

        // O PROPRIO CLIENTE CRIA A INSTANCIA
        this.endereco = new Endereco(rua);  // INSTANCIA DA PARTE DENTRO DO TODO
    }


    @Override
    public String toString() {
        return this.nome + " mora em " + this.endereco;
    }


    public static void main(String[] args) {
        Cliente c = new Cliente("vini", "marques, 123");
        System.out.println(c);

        // SE O CLIENTE DEIXAR DE EXISTIR, AUTOMATICAMENTE O ENDERECO TBM DEIXA DE EXISTIR.
    }
}
