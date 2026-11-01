package com.mycompany.aula_tratamentos_erros;


public class Programa {
    public static void main(String[] args) {
        /*
        int[] vetor = new int[5];
        System.out.println(" -> Execucao antes da EXCECAO - 01 <-");
        vetor[6] = 2018;
        System.out.println(" -> Tratamento do ERRO - Excecao do Fluxo - 02");
        */
        
        
        try{
            
        int[] vetor = new int[5];
        System.out.println(" -> Erro 01 - Parada do Fluxo de execucao <-");
        vetor[6] = 2018;
        
        }catch(ArrayIndexOutOfBoundsException exception1){
            System.out.println("Tratamento do Erro 01 - Fluxo de execucao");
            System.out.println("Indice nao existe no vetor!");
        }
        
        System.out.println("Programa executado com sucesso!!");
        
    }
}
