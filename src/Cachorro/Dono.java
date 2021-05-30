package Cachorro;

public class Dono {

    private String nome;
    private Cao pet;
    private Cao pet2;

    public Dono(String nome) {
        this.nome = nome;
    }

    public void setPet(Cao pet) {
        this.pet = pet;
    }

    public Cao getPet() {
        return this.pet;
    }

    public void setPet2(Cao pet) {
        this.pet2 = pet;
    }

    public Cao getPet2() {
        return this.pet2;
    }

    public void alimentaCao(Cao cao) {
        cao.realizaRefeicao();
    }

    public void recebeCarinho(Cao cao) {
        System.out.println(this.nome + " está recebendo carinho de " + cao.getNomeCao() + ".\n");
    }

    public static void main(String[] args) {

        Dono maria = new Dono("Maria");

        System.out.println("Cãozinhos de " + maria.nome + " ==>\n");

        Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3,
                "Enrolada", "pêlo curtinho");
        maria.setPet(pipoca);
        pipoca.setMeuDono(maria);
        maria.getPet().printCao();
        maria.alimentaCao(pipoca);
        pipoca.agradaDono();

        Cao floquinho = new Cao("Floquinho", "Poodle", "Macho", 1,
                "Curta", "pelagem cacheada");
        maria.setPet2(floquinho);
        floquinho.setMeuDono(maria);
        maria.getPet2().printCao();
        maria.alimentaCao(floquinho);
        floquinho.agradaDono();
    }
}
