public class Carro {
    private String  marca;
    private boolean ligado;

    public Carro(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Ford",false);

        System.out.println("Marca:  " + carro.getMarca()); 
        System.out.println("Ligado: " + (carro.isLigado() ? "Ligado" : "Desligado\n"));

        carro.setMarca("Renault");
        carro.setLigado(true);

        System.out.println("Marca: " + carro.getMarca()); 
        System.out.println("Ligado: " + (carro.isLigado() ? "Ligado" : "Desligado"));
    }
}
