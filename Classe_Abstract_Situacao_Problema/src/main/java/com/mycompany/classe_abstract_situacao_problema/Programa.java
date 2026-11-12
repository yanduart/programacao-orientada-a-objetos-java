package com.mycompany.classe_abstract_situacao_problema;

import java.util.*;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EntregaNormal EN = new EntregaNormal("", 0);
        EntregaExpressa EX = new EntregaExpressa("", 0);
        EntregaEconomica EC = new EntregaEconomica("", 0);
        int opcao;

        do {

            System.out.println("=========MENU========");
            System.out.println("-> 1 Entrega Normal");
            System.out.println("-> 2 Entrega Expressa");
            System.out.println("-> 3 Entrega Economica");
            System.out.println("-> 0 Sair");
            System.out.println("Ecolha: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome: ");
                    sc.nextLine();
                    EN.setDestinatario(sc.nextLine());
                    System.out.println("Informe o peso: ");
                    EN.setPeso(sc.nextDouble());
                    EN.exibirDados();
                    System.out.println("Frete extimado: " + EN.calcularFrete(EN.getPeso()));
                    break;

                case 2:
                    System.out.println("Informe o nome: ");
                    sc.nextLine();
                    EX.setDestinatario(sc.nextLine());
                    System.out.println("Informe o peso: ");
                    EX.setPeso(sc.nextDouble());
                    EX.exibirDados();
                    System.out.println("Frete extimado: " + EX.calcularFrete(EX.getPeso()));
                    break;

                case 3:
                    System.out.println("Informe o nome:");
                    sc.nextLine();
                    EC.setDestinatario(sc.nextLine());
                    System.out.println("Informe o peso: ");
                    EC.setPeso(sc.nextDouble());
                    EC.exibirDados();
                    System.out.printf(Locale.US, "Frete extimado: %.2f%n", EC.calcularFrete(EC.getPeso()));
                    break;

                case 0:
                    System.out.println("Encerrando....");
                    break;

                default:
                    System.out.println("Opcao errada!!");
            }

        } while (opcao != 0);
        
        sc.close();

    }
}
