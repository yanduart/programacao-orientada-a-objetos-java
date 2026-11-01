package com.mycompany.aula_heranca;


public class FuncionarioComissaoBase extends FuncionarioComissionado{
    
    private double salarioBase;
    
    public FuncionarioComissaoBase(String nome, String sobrenome, String numeroRegistro, double vendasBrutas, double taxaComissao, double salarioBase){
        super(nome, sobrenome, numeroRegistro, vendasBrutas, taxaComissao);
        this.salarioBase = salarioBase;
        
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
      @Override
    public double calcularRendimentos(double taxaComissao, double vendasBrutas) {
        return super.calcularRendimentos(taxaComissao, vendasBrutas) + salarioBase;
    }
    
      @Override
    public String toString() {
        return "Salario base: " + salarioBase + " | " + super.toString();
    }

}
