import java.util.Scanner;

public class Circulo {
    float raio;
    final static float PI = 3.1415f;

    public Circulo (float raio) {
        this.raio = raio;
    }

    float calculaPerimetro() {
        return 2 * PI * this.raio;
    }
    
    void imprimeDados() {
        System.out.println("Círculo: ");
        System.out.println("Raio: " + raio);
        System.out.println("Perímetro: " + calculaPerimetro());
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float raio;
        
        System.out.println("Círculos ==> \n");
        
        System.out.print("Digite o valor do raio: ");
        raio = leitor.nextFloat();
        Circulo circulo1 = new Circulo(raio);
        circulo1.imprimeDados();
        
        System.out.print("\nDigite o valor do raio: ");
        raio = leitor.nextFloat();
        Circulo circulo2 = new Circulo (raio);
        circulo2.imprimeDados();
    }
}