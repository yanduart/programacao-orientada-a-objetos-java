package com.mycompany.pratica_interface;

import java.util.*;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Relatorio rt = new Relatorio("");
    private NotaFiscal nf = new NotaFiscal(0, 0);

    public void executar() {
        int opcao;

        do {
            System.out.println();
            System.out.println("<----MENU DE OPERACOES---->");
            System.out.println("1 -> Relatorio");
            System.out.println("2 -> Nota Fiscal");
            System.out.println("3 -> Polimorfismo");
            System.out.println("0 -> Sair");
            System.out.println("Escolha o numero: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("<-----RELATORIO----->");
                    sc.nextLine();
                    System.out.println("Informe o titulo: ");
                    rt.setTitulo(sc.nextLine());
                    rt.imprimir();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("<----NOTA FISCAL---->");
                    System.out.println("Informe o numero da nota: ");
                    nf.setNumero(sc.nextInt());
                    System.out.println("Informe o valor da nota: ");
                    nf.setValor(sc.nextDouble());
                    nf.imprimir();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("<----POLIMORFISMO---->");
                    Impressao[] documentos = {rt, nf};
                    for (Impressao documento : documentos) {
                        documento.imprimir();
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando....");
                    break;

                default:
                    System.out.println("Opcao incorreta! Informe uma opcao valida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
