package com.mycompany.pratica_interface;

public class NotaFiscal implements Impressao {

    private int numero;
    private double valor;

    public NotaFiscal(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }
    
   
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO NOTA FISCAL");
        System.out.println("Numero: " + numero);
        System.out.printf("Valor: %.2f%n", valor);
    }
}
