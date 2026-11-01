package com.mycompany.aula_heranca;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       FuncionarioComissaoBase fcb = new FuncionarioComissaoBase("Yan", "Duarte Marques", "345", 1000, 0.06, 0);
       
       System.out.println("Informe seu salario: ");
       fcb.setSalarioBase(sc.nextDouble());
       
        System.out.println("Rendimento: " + fcb.calcularRendimentos(fcb.getTaxaComissao(), fcb.getVendasBrutas()));
        
        System.out.println(fcb.toString());
       
    }
    
}
