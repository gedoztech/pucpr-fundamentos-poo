package Pet;

public class Dono {

    private String nome;
    private Cao[] pets;

    public Dono(String nome) {
        this.nome = nome;
        pets = new Cao[3];
    }
    
    public void addPet(int index, Cao pet) {
        this.pets[index] = pet;
    }
    
    public Cao getPet(int index) {
        return this.pets[index];
    }
    
    public void alimentaCaes() {
        for(int i=0; i< 3; i++)
            pets[i].realizaRefeicao();
    }
    
    public void recebeCarinho() {
        for(int i=0; i< 3; i++) 
            System.out.println(this.nome + " está recebendo carinho de " + this.pets[i].getNomeCao());
    }
    
    public void listaCaes() {
        for(int i=0; i< 3; i++)
            this.getPet(i).printCao();
    }

    public static void main(String[] args) {

        Dono maria = new Dono("Maria");

        Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3,
                "Enrolada", "Pêlo curtinho");

        Cao bruce = new Cao("Bruce", "Pug", "Macho", 2, "Caracol",
                "Pêlo curtinho");

        Cao jujuba = new Cao("Jujuba", "Maltês", "Fêmea", 1,
                "Enrolada", "Pêlo longo");

        maria.addPet(0, pipoca);
        maria.addPet(1, bruce);
        maria.addPet(2, jujuba);

        pipoca.setMeuDono(maria);
        bruce.setMeuDono(maria);
        jujuba.setMeuDono(maria);

        System.out.println("Cãozinhos de " + maria.nome + " ==>\n");
        maria.listaCaes();

        maria.alimentaCaes();
        System.out.println("");
        maria.recebeCarinho();
    }
}
