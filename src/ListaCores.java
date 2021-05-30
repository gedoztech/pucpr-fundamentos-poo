import java.util.ArrayList;

public class ListaCores {

    public static void main(String[] args) {

        int i;
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Amarelo");

        for(i = 0; i < cores.size(); i++)
            System.out.println((i+1) + "º) " + cores.get(i));
        System.out.println("Tamanho da lista = " + cores.size());

        cores.set(1, "Pink");

        i=0;
        System.out.println("----");
        for (String c : cores) {
            System.out.println((i+1) + "º) " + c);
            i++;
        }
        System.out.println("Tamanho da lista = " + cores.size());

        cores.remove(3);

        i=0;
        System.out.println("----");
        for (String c : cores) {
            System.out.println((i+1) + "º) " + c);
            i++;
        }
        System.out.println("Tamanho da lista = " + cores.size());

        cores.clear();
    }
}
