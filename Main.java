public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();

        cp.setSaldo(1000);

        CaixaEletronico c = new CaixaEletronico();


        c.creditar(500);
        c.mostrarDados();
        c.debitar(50);
        c.mostrarDados();
    }
}
