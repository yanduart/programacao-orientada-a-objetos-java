package com.mycompany.pratica_interface2;


public class PagamentoCartao implements Pagamento{
  
    private String modalidade;
    private double valor;

    public PagamentoCartao(String modalidade, double valor) {
        this.modalidade = modalidade;
        this.valor = valor;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getValor() {
        return valor;
    }
    
    @Override
    public void pagar(){
        System.out.println();
        System.out.println("Pagamento realizado com o cartao de credito");
        System.out.println("Modalidade: " + modalidade);
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
