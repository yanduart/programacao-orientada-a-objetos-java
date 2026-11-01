package com.mycompany.aula_heranca;


public class FuncionarioComissionado {
    private String nome;
    private String sobrenome;
    private String numeroRegistro;
    private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String sobrenome, String numeroRegistro, double vendasBrutas, double taxaComissao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroRegistro = numeroRegistro;
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public void setVandasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public double calcularRendimentos(double taxaComissao, double vendasBrutas){
        double resultado = (taxaComissao * vendasBrutas);
        return resultado;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" + "nome: " + nome + ", sobrenome: " + sobrenome + ", numeroRegistro: " + numeroRegistro + ", vandasBrutas: " + vendasBrutas + ", taxaComissao: " + taxaComissao + '}';
    }
    
}
