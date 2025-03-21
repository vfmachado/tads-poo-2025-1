
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("96211480", "123");
        endereco.setComplemento("sobrado amarelo");
        // System.out.println(endereco);

        Usuario user = new Usuario("jovana@gmail.com");
        user.addEndereco(endereco);

        user.addEndereco(new Endereco("12312312", "220A"));

        System.out.println(user);
    }
}