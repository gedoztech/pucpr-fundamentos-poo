package Arquitetura.Especialista;

import Arquitetura.Matematica.Circulo;

public class Arquiteto {
    private String nome;
    private int idade;

    public Arquiteto(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirDadosPessoais(){
        System.out.println( nome);
        System.out.println( idade+ " anos");
    }
    
    public void trabalha(double r1, double r2, double r3) {
        Circulo a = new Circulo(r1);
        double x = a.area();
        double y = a.perimetro();
        imprime(r1, x, y);

        Circulo b = new Circulo(r2);
        x = b.area();
        y = b.perimetro();
        imprime(r2, x, y);

        b = new Circulo(r3);
        x = b.area();
        y = b.perimetro();
        imprime(r3, x, y);
    }

    private void imprime(double raio, double area, double perimetro) {
        System.out.printf("Raio: %.2f cm\n", raio);
        System.out.printf("Área: %.2f cm\n", area);
        System.out.printf("Perímetro: %.2f cm\n", perimetro);
        System.out.println();
    }

    public static void main (String[] args) {
        Arquiteto a1 = new Arquiteto ("Oscar Niemeyer", 104);
        a1.trabalha(5, 7, 10);
    }
}