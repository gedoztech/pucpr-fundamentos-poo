public class StringDemo {

    public static void main(String[] args) {
        String ola = "Olá";

        String nome1 = "Maria";
        String nome2 = "João";

        String saudacao = ola + ", " + nome1 + "!\n";
        System.out.println(saudacao);

        saudacao = ola;

        saudacao = saudacao.concat(", " + nome2);
        saudacao = saudacao.concat("!\n\n");

        System.out.println(saudacao + "fim");
    }
}