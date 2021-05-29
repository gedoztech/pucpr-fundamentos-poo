package Geometria;

import java.util.Scanner;

public class Geometria {

    private static void mostraOpcoes(Scanner leitor) {
        int figura;

        System.out.println("Menu de Opções:");
        System.out.println("1 => Círculo.");
        System.out.println("2 => Quadrado.");
        System.out.println("3 => Retângulo.");
        System.out.println("4 => Triângulo.");
        System.out.println("5 => Sair do programa.");

        System.out.print("Digite a opção desejada: ");
        figura = leitor.nextInt();

        if (figura == 1) {
            processaCirculo(leitor);
        } else if (figura == 2) {
            processaQuadrado(leitor);
        } else if (figura == 3) {
            processaRetangulo(leitor);
        } else if (figura == 4) {
            processaTriangulo(leitor);
        } else if (figura == 5) {
            System.out.println("\nOpção selecionada: Sair do Programa.");
            System.out.println("\nObrigado por utilizar a Calculadora de Figuras Geométricas.");
            System.out.println("Programa encerrado.");
            leitor.close();
        } else {
            System.out.println("\nOpção Incorreta. Por favor, tente novamente.\n");
            mostraOpcoes(leitor);
        }
    }

    private static void processaCirculo(Scanner leitor) {
        System.out.println("\nFigura geométrica selecionada: Círculo.");
        System.out.print("Digite o valor do raio: ");
        Circulo circulo = new Circulo(leitor.nextFloat());
        circulo.imprimeDados();
        mostraOpcoes(leitor);
    }

    private static void processaRetangulo(Scanner leitor) {
        float altura;
        float largura;

        System.out.println("\nFigura geométrica selecionada: Retângulo.");
        System.out.print("Digite o valor da altura: ");
        altura = leitor.nextFloat();
        System.out.print("Digite o valor da largura: ");
        largura = leitor.nextFloat();
        Retangulo retangulo = new Retangulo(altura, largura);
        retangulo.imprimeDados();
        mostraOpcoes(leitor);
    }

    private static void processaQuadrado(Scanner leitor) {
        System.out.println("\nFigura geométrica selecionada: Quadrado.");
        System.out.print("Digite o valor do lado: ");
        Quadrado quadrado = new Quadrado(leitor.nextFloat());
        quadrado.imprimeDados();
        mostraOpcoes(leitor);
    }

    private static void processaTriangulo(Scanner leitor) {
        float lado1;
        float lado2;
        float lado3;

        System.out.println("\nFigura geométrica selecionada: Retângulo.");
        System.out.print("Digite o valor do lado 1: ");
        lado1 = leitor.nextFloat();
        System.out.print("Digite o valor do lado 2: ");
        lado2 = leitor.nextFloat();
        System.out.print("Digite o valor do lado 3: ");
        lado3 = leitor.nextFloat();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        triangulo.imprimeDados();
        mostraOpcoes(leitor);
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo(a) à Calculadora de Figuras Geométricas!\n");
        Scanner leitor = new Scanner(System.in);
        mostraOpcoes(leitor);
    }
}
