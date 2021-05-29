package Geometria;

public class Retangulo{

    float altura;
    float largura;
    float area;
    float perimetro;

    public Retangulo (float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
        this.area = this.calculaArea();
        this.perimetro = this.calculaPerimetro();
    }

    private float calculaArea() {
        return this.altura * this.largura;
    }

    private float calculaPerimetro() {
        return (2 * this.altura) + (2 * this.largura);
    }

    void imprimeDados() {
        System.out.println("\nInformações do Retângulo ==> ");
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro + "\n");
    }
}