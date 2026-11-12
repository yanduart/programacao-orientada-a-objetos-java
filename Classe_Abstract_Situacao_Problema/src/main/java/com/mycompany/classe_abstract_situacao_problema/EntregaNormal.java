package com.mycompany.classe_abstract_situacao_problema;


public class EntregaNormal extends Entrega{

    
    public EntregaNormal(String destinatario, double peso) {
        super(destinatario, peso);
    }
    
    @Override
    public double calcularFrete(double peso){
        return 10 + (2 * peso);
    }
}
