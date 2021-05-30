package ReceitaFederal;

import java.util.ArrayList;

public class Contribuinte {
    
    private String nome;
    private ArrayList <Dependente> dep;
    
    public Contribuinte (String nome) {
        this.nome = nome;
        dep = new ArrayList<>();
    }
    
    public void ligaDependente(Dependente d) {
        dep.add (d);
    }
    
    public void imprime() {
        System.out.println("Contribuinte: " + this.nome);
        imprimeDependentes();
    }
    
    private void imprimeDependentes() {
        for (Dependente d : dep) {
            d.imprime();
        }
    }
    
    public int numeroDependentes() {
        return dep.size();
    }
}
