package Geometria;

public class Circulo {

    float raio;
    float area;
    float diametro;
    float circunferencia;

    public Circulo (float raio) {
        this.raio = raio;
        this.area = this.calculaArea();
        this.diametro = this.calculaDiametro();
        this.circunferencia = this.calculaCircunferencia();
    }

    private float calculaArea() {
        return (float) (Math.PI * Math.pow(this.raio, 2));
    }

    private float calculaDiametro() {
        return 2 * this.raio;
    }

    private float calculaCircunferencia() {
        return (float) (2.0 * Math.PI * this.raio);
    }

    void imprimeDados() {
        System.out.println("\nInformações do Círculo ==> ");
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area);
        System.out.println("Diâmetro: " + this.diametro);
        System.out.println("Circunferência: " + this.circunferencia + "\n");
    }
}