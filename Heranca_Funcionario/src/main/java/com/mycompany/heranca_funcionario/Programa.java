package com.mycompany.heranca_funcionario;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Funcionario fc = new Funcionario("Yan", "234", 0);
        
        System.out.println("Informe o seu salario: ");
        fc.setSalarioBase(sc.nextDouble());
        
        sc.nextLine();
        
        System.out.println("Informe o aumento: ");
        fc.aplicarAumento(sc.nextDouble());
        
        System.out.println("Salario: ");
        System.out.println(fc.calcularSalario());
        
        System.out.println(fc.toString());
        */
        
        
        Gerente gr = new Gerente("Bruno", "567", 0, 0);
        
        System.out.println("Informe o salario do gerente: ");
        gr.setSalarioBase(sc.nextDouble());
        
        sc.nextLine();
        
        System.out.println("Informe o bonus do gerente");
        gr.setBonus(sc.nextDouble());
        
        System.out.println("Salario do gerente com bonus: " + gr.calcularSalario(gr.getBonus()));
        
        System.out.println(gr.toString());
        
        
        Vendedor vd = new Vendedor("Luan", "224", 0, 0, 0);
        
        System.out.println("Informe o Salario do Vendedor: ");
        vd.setSalarioBase(sc.nextDouble());
        
        sc.nextLine();
                
        System.out.println("Informe o total de vendas do vendedor: ");
        vd.setTotalVendas(sc.nextDouble());
        
        sc.nextLine();
        
        System.out.println("Informe o percentual da comissao do vendedor: ");
        vd.setPercentualComissao(sc.nextDouble());
        
        System.out.println("Salario com sua comissao: " + vd.calcularSalario(vd.getTotalVendas(), vd.getPercentualComissao()));
   
        System.out.println(vd.toString());
    }
        
}
    

