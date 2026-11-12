package com.mycompany.classe_abstract_situacao_problema;


public class EntregaExpressa extends Entrega{

    
    public EntregaExpressa(String destinatario, double peso) {
        super(destinatario, peso);
    }
    
    @Override  
    public double calcularFrete(double peso){
        return 20 + (5 * peso);
    }
}
