package com.mycompany.exercicio_heranca;


public class Carro extends Veiculo{
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int ano, double valocidadeAtual, int numeroPortas){
        super(marca, modelo, ano, valocidadeAtual);
        this.numeroPortas = numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    @Override
    public String toString(){
        return "Numero de portas do veiculo: " + numeroPortas + "\nEspecificacoes: " + super.toString(); 
    }
}
