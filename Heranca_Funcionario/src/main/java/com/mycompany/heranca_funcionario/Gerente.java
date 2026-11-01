package com.mycompany.heranca_funcionario;

public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, String matricula, double salarioBase, double bonus){
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    
    public double calcularSalario(double bonus){
        return super.calcularSalario() + bonus;
    }
    
    @Override
    public String toString(){
        System.out.println("Bonus: " + getBonus());
        return "Dados do Gerente -> " + super.toString();
    }
    
}
