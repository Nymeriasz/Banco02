public abstract class Conta {
    protected double saldo;

    public abstract void creditar(double valor);
    public abstract void debitar(double valor);

    public void mostrarDados(){
        System.out.println(saldo);
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

}
