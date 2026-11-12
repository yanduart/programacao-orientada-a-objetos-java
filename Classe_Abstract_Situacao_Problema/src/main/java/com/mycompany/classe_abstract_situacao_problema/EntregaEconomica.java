package com.mycompany.classe_abstract_situacao_problema;


public class EntregaEconomica extends Entrega{

    public EntregaEconomica(String destinatario, double peso) {
        super(destinatario, peso);
    }
    
   @Override
   public double calcularFrete(double peso){
       return 5 + (1.50 * peso);
   }
    
}
