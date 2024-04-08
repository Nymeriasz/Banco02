public class ContaPoupanca extends Conta {
    private double taxa;

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void creditar(double valor){
        this.saldo += valor;
    }

    @Override
    public void debitar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void mostrarDados(){
        System.out.println(saldo);
    }
}
