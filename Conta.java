package Banco02;

public abstract class Conta {
    protected double saldo;

    public void creditar(double valor){
        this.saldo+=valor;
    }
    public void debitar(double valor){
        this.saldo-=valor;
    }
    
    public void mostrarDados(){
        System.out.println(saldo);
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
