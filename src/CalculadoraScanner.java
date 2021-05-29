import java.util.Scanner;

public class CalculadoraScanner {
    
    static float soma (float a, float b) {
        return a + b;
    }

    static float multiplica (float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float x, y, z;

        System.out.println("Soma e Multiplicação entre 2 valores (x e y) ==>\n");

        System.out.print("Digite o valor de x: ");
        x = leitor.nextFloat();

        System.out.print("Digite o valor de y: ");
        y = leitor.nextFloat();

        z = CalculadoraScanner.soma(x, y); 
        System.out.println("x + y = " + z);

        z = CalculadoraScanner.multiplica(x, y);
        System.out.println("x * y = " + z);
    }
}