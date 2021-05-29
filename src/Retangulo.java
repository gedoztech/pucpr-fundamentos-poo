public class Retangulo {
    float altura;
    float largura;

    float calculaPerimetro() {
        return (2 * altura) + (2 * largura);
    }

    void imprimeDados() {
        float perimetro;
        perimetro = calculaPerimetro();
        System.out.println("Retângulo: ");
        System.out.println("Altura:    " + altura);
        System.out.println("Largura:   " + largura);
        System.out.println("Perímetro: " + perimetro + "\n");
    }

    public static void main(String[] args) {
        System.out.println("Classe Retângulo ==> \n");

        Retangulo retangulo1;
        retangulo1 = new Retangulo();
        retangulo1.altura = 10;
        retangulo1.largura = 20;
        retangulo1.imprimeDados();

        Retangulo retangulo2;
        retangulo2 = new Retangulo();
        retangulo2.altura = 5;
        retangulo2.largura = 15;
        retangulo2.imprimeDados();
    }
}