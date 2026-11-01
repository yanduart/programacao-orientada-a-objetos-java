package com.mycompany.exercicio_heranca;


public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    
    public Veiculo(){
        
    }

    public Veiculo(String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void acelerar(double valor){
        velocidadeAtual += valor;
    }
    
    public void frear(double valor){
        if(valor > 0){
            velocidadeAtual -= valor;
        }else{
            System.out.println("Nao existe freada negativa");    
        }
    }

    @Override
    public String toString() {
        return "Veiculo -> " + "marca: " + marca + ", modelo: " + modelo + ", ano: " + ano + ", velocidadeAtual: " + velocidadeAtual + '}';
    }
    
    
}
