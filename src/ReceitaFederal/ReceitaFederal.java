package ReceitaFederal;

public class ReceitaFederal {

    public static void main(String[] args) {

        Contribuinte julia = new Contribuinte( "Julia");
        Dependente jorge = new Dependente( "Jorge");
        Dependente sandra = new Dependente( "Sandra");
        julia.ligaDependente(jorge);
        julia.ligaDependente(sandra);
        julia.imprime();
        System.out.println("Número de dependentes : " + julia.numeroDependentes ( ) + "\n");

        Contribuinte leonardo = new Contribuinte ("Leonardo");
        Dependente marta = new Dependente("Marta");
        Dependente diego = new Dependente("Diego");
        Dependente claudia = new Dependente("Cláudia");
        leonardo.ligaDependente(marta);
        leonardo.ligaDependente(diego);
        leonardo.ligaDependente(claudia);
        leonardo.imprime();
        System.out.println ("Número de dependentes: " + leonardo.numeroDependentes ( ) + "\n");

        Contribuinte pedro = new Contribuinte( "Pedro");
        pedro.imprime();
        System.out.println("Número de dependentes : " + pedro.numeroDependentes ( ) + "\n");

        Contribuinte joao = new Contribuinte( "João");
        Dependente ana = new Dependente( "Ana");
        joao.ligaDependente(ana);
        joao.imprime();
        System.out.println("Número de dependentes : " + joao.numeroDependentes ( ) + "\n");
    }
}
