package Geometria;

public class Quadrado{

    float lado;
    float area;
    float perimetro;

    public Quadrado (float lado) {
        this.lado = lado;
        this.area = this.calculaArea();
        this.perimetro = this.calculaPerimetro();
    }

    private float calculaArea() {
        return (float) Math.pow(this.lado, 2);
    }

    private float calculaPerimetro() {
        return 4 * this.lado;
    }

    void imprimeDados() {
        System.out.println("\nInformações do Quadrado ==> ");
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro + "\n");
    }
}
