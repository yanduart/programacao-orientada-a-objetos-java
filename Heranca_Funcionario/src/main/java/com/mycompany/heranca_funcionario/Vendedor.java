package com.mycompany.heranca_funcionario;


public class Vendedor extends Funcionario{
    private double totalVendas;
    private double percentualComissao;
    
    
    public Vendedor(String nome, String matricula, double salarioBase, double totalVendas, double percentualComissao){
        super(nome, matricula, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    
    
    public double calcularSalario(double totalVendas, double percentualComissao){
        return super.calcularSalario() + (totalVendas * (percentualComissao / 100));
    }

    @Override
    public String toString(){
        System.out.println("Total de vendas: " + getTotalVendas());
        System.out.println("Percentual da comissao: " + getPercentualComissao());
        return "Dados do vendedor: " + super.toString();
    }
    
    
}
