public class StringExamples {

    public static void main(String[] args) {
        String txt;

        txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Comprimeto de [" + txt + "] = " + txt.length());

        txt = "Olá Mundo!";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        txt = "Localize a posição da palavra 'eureka' neste texto!";
        System.out.println(txt.indexOf("eureka"));
    }
}