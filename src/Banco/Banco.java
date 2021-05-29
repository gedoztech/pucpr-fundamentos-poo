package Banco;

public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setDono("Maria");
        conta1.setSaldo(1234.56);

        conta2.setDono("José");
        conta2.setSaldo(7890.12);

        System.out.println("Conta 1 ==>");
        System.out.println("Correntista: " + conta1.getDono());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("\nConta 2 ==>");
        System.out.println("Correntista: " + conta2.getDono());
        System.out.println("Saldo: " + conta2.getSaldo());
    }
}
