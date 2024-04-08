public class CaixaEletronico {
    private Conta conta;

    public void creditar(double valor){
        conta.creditar(valor);
    }
    public void debitar(double valor){
        conta.debitar(valor);
    }
    public void mostrarDados(){
        conta.mostrarDados();
    }
}
