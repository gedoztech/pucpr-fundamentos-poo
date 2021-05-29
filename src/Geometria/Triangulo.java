package Geometria;

public class Triangulo {
    float lado1;
    float lado2;
    float lado3;
    float area;
    float perimetro;
    float semiPerimetro;

    public Triangulo (float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.perimetro = this.calculaPerimetro();
        this.semiPerimetro = this.calculaSemiPerimetro();
        this.area = this.calculaArea();
    }

    private float calculaArea() {
        return (float) Math.sqrt(
                this.perimetro *
                        (this.perimetro-this.lado1) *
                        (this.perimetro-this.lado2) *
                        (this.perimetro-this.lado3));
    }

    private float calculaPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    private float calculaSemiPerimetro() {
        return this.perimetro / 2;
    }

    void imprimeDados() {
        System.out.println("\nInformações do Triângulo ==> ");
        System.out.println("Lado 1: " + this.lado1);
        System.out.println("Lado 2: " + this.lado2);
        System.out.println("Lado 3: " + this.lado3);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
        System.out.println("Semi-perímetro: " + this.perimetro + "\n");
    }
}
