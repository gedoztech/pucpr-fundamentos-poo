public class Calculadora {

    public static int multiplica(int a, int b) {
        int x;
        x = a * b;
        return x;
    }

    public static void main(String[] args) {
        int x = 4, y = 5, z;
        System.out.println("Calculadora");
        z = multiplica(x, y);
        System.out.println("Z = " + z);
        System.out.println("Z = " + multiplica(10, 3));
    }
}
