
package com.mycompany.exercicio_heranca;


public class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto(String modelo, String marca, int ano, double velocidadeAtual, int cilindradas){
        super(modelo, marca, ano, velocidadeAtual);
        this.cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    
    @Override
    public void acelerar(double valor){
        super.acelerar(valor * 2);
    }
    
    @Override
    public void frear(double valor){
        super.frear(valor);
    }
    
    @Override
    public String toString(){
        return "Cilindradas da moto: " + cilindradas + "\n" + super.toString();
    }
}
