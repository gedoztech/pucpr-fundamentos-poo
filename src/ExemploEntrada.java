import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x, y, z;

        System.out.println("Olá! Vamos fazer uma soma simples entre 2 números inteiros (x + y).\n");

        System.out.print("Digite um valor para x: ");
        x = leitor.nextInt();

        System.out.print("Digite um valor para y: ");
        y = leitor.nextInt();

        z = x + y;
        System.out.println("\nA soma de x + y é igual a: " + z);
    }
}
