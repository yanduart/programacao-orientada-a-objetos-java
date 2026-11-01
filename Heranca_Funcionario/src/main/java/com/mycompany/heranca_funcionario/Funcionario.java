package com.mycompany.heranca_funcionario;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }
    
    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            salarioBase += (salarioBase * (percentual / 100));
        } else {
            System.out.println("Percentual invalido para calcular o salario!");
        }

    }

    @Override
    public String toString() {
        return "Funcionario -> {" + "nome: " + nome + ", matricula: " + matricula + ", salarioBase: " + salarioBase + '}';
    }
    

}
