package Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("vini", "123");
        System.out.println("DEPOSITO DE 1000");
        conta.depositar(1000);
        conta.depositar(500);
        try {
            System.out.println("SAQUE IMPOSSIVEL");
            conta.sacar(100000);
        } catch (Exception e) {
            System.out.println("ERRO AO SACAR... ");
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("SAQUE DE 300");
            conta.sacar(300);
        } catch (Exception e) {
            System.out.println("ERRO AO SACAR... ");
            System.out.println(e.getMessage());
        }

        System.out.println("BUSCA SALDO");
        System.out.println(conta.getSaldo());

        System.out.println(conta.extrato());
    }
}
