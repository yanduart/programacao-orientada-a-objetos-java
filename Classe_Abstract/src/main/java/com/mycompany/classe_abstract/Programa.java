package com.mycompany.classe_abstract;

import java.util.*;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // evita problema de vírgula/ponto no nextDouble

        Retangulo R = new Retangulo(0, 0);
        /*System.out.println("_______RETANGULO______");
        System.out.println("Informe a Base do Retangulo: ");
        R.setBase(sc.nextDouble());
        System.out.println("Informe a Altura do Retangulo: ");
        R.setAltura(sc.nextDouble());
        System.out.printf("Area: %.2f%n", R.calcularArea());
        R.apresentar();
         */

        Circulo C = new Circulo(0);
        /*System.out.println("_______CIRCULO_______");
        System.out.println("Informe o Raio do Circulo: ");
        C.setRaio(sc.nextDouble());
        System.out.printf("Raio: %.2f%n", C.calcularArea());
        C.apresentar();
         */

 /*System.out.println("________POLIMORFISMO________");
        FormaGeometrica[] formas = {R, C};
        for(FormaGeometrica forma: formas){
            System.out.printf(Locale.US,"Area: %.2f%n", forma.calcularArea());
         */
 
        int opcao;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circulo");
            System.out.println("3 - Polimorfismo (todas as formas)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("_______RETANGULO______");
                    System.out.println("Informe a Base do Retangulo: ");
                    R.setBase(sc.nextDouble());
                    System.out.println("Informe a Altura do Retangulo: ");
                    R.setAltura(sc.nextDouble());
                    System.out.printf("Area: %.2f%n", R.calcularArea());
                    R.apresentar();
                    break;

                case 2:

                    System.out.println("_______CIRCULO_______");
                    System.out.println("Informe o Raio do Circulo: ");
                    C.setRaio(sc.nextDouble());
                    System.out.printf("Area: %.2f%n", C.calcularArea());
                    C.apresentar();
                    break;

                case 3:
                    System.out.println("________POLIMORFISMO________");
                    FormaGeometrica[] formas = {R, C};
                    for (FormaGeometrica forma : formas) {
                        System.out.printf(Locale.US, "Area: %.2f%n", forma.calcularArea());
                    }
                    break;

                case 0:
                    System.out.println("Encerrando....");
                    break;

                default:
                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 0);

        sc.close();
    }
}
    

        
