package com.mycompany.pratica_interface2;

import java.util.*;

public class Menu {
     
    Scanner sc = new Scanner(System.in);
    PagamentoCartao pc = new PagamentoCartao("", 0.0);
    PagamentoPix pp = new PagamentoPix("", 0.0);
    PagamentoBoleto pb = new PagamentoBoleto("", 0.0);

    public void executar() {
        int opcao;
        

        do {
            System.out.println();
            System.out.println("<======MENU======>");
            System.out.println("1 -> Cartao");
            System.out.println("2 -> Pix");
            System.out.println("3 -> Boleto");
            System.out.println("4 -> Polimorfismo");
            System.out.println("0 -> Sair");
            System.out.println("Informe o metodo de pagamento: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("<=======Pagamento======>");
                    System.out.println("Informe o valor: ");
                    pc.setValor(sc.nextDouble());
                    pc.setModalidade("Cartao");
                    pc.pagar();
                    break;

                case 2:
                    System.out.println();    
                    System.out.println("<=======Pagamento======>");
                    System.out.println("Informe o valor: ");
                    pp.setValor(sc.nextDouble());
                    pp.setModalidade("Pix");
                    pp.pagar();
                    break;
                   
                case 3:
                    System.out.println();
                    System.out.println("<=======Pagamento======>");
                    System.out.println("Informe o valor: ");
                    pb.setValor(sc.nextDouble());
                    pb.setModalidade("Boleto");
                    pb.pagar();
                    break;
                    
                case 4:
                    System.out.println();
                    System.out.println("<======Polimorfismo======>");
                    Pagamento[] pagamentos = {pc, pp, pb};
                    for(Pagamento pagamento : pagamentos){
                        pagamento.pagar();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando.....");
                    break;

                default:
                    System.out.println("Opcao invalida, Informe um valor correspondente!!");
            }

        } while (opcao != 0);
        sc.close();
    }
}
