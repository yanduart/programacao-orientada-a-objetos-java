package com.mycompany.exercicio_heranca;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro("Toyota", null, 2024, 55.4, 0);
         
       System.out.println("Informe quantas portas tem o carro: ");
       c1.setNumeroPortas(sc.nextInt());
       
       sc.nextLine();
       
       System.out.println("Informe o modelo do carro: ");
       c1.setModelo(sc.nextLine());
       
       System.out.println(c1.toString());
       
       Moto m1 = new Moto("Shineray", "SHI250", 2026, 70.5, 0);
       
        System.out.println("Informe as cilindradas da moto: ");
        m1.setCilindradas(sc.nextInt());
        
        System.out.println("Informe a velocidade que a moto acelerou: ");
        m1.acelerar(sc.nextDouble());
        
        m1.frear(20);
        m1.frear(-10);
        
        System.out.println(m1.toString());
    }
}
