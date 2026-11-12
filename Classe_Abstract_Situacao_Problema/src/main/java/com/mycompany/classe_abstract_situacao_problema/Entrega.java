package com.mycompany.classe_abstract_situacao_problema;


public abstract class Entrega {
    
    private String destinatario;
    private double peso;

    public Entrega(String destinatario, double peso) {
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public abstract double calcularFrete(double peso);
    
    public void exibirDados(){
        System.out.println("Nome: " + destinatario);
        System.out.println("Peso: " + peso);
    }
        
}
