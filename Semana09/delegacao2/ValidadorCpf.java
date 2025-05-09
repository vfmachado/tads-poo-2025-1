package delegacao2;

public class ValidadorCpf {
    public static boolean verifica(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
}
