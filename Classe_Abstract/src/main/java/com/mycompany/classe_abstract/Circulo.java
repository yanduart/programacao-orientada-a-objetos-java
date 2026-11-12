package com.mycompany.classe_abstract;

public class Circulo extends FormaGeometrica{
    private double raio;
    
    
    public Circulo(double raio){
        this.raio = raio;
    }

    
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
