package com.mycompany.aula_tratamentos_erros;

public class Programa1 {

    public static void main(String[] args) {

        /*
        int[] vetorNumeros1 = {10, 20, 30, 40, 50, 60};
        int[] vetorNumeros2 = {2, 1, 0, 2, 0};

        for (int i = 0; i < vetorNumeros1.length; i++) {
            System.out.println(vetorNumeros1[i] + "/" + vetorNumeros2[i] + " = " + vetorNumeros1[i] / vetorNumeros2[i]);
        }
         */
        int[] vetorNumeros1 = {10, 20, 30, 40, 50, 60, 70};
        int[] vetorNumeros2 = {2, 1, 0, 2, 0};

        for (int i = 0; i < vetorNumeros1.length; i++) {
            try {
                System.out.println(vetorNumeros1[i] + "/" + vetorNumeros2[i] + " = " + vetorNumeros1[i] / vetorNumeros2[i]);

            } catch (ArithmeticException exception1) {
                System.out.println("Erro 01 - Divisao por 0");
            } catch (ArrayIndexOutOfBoundsException exception2){
                System.out.println("Erro 02 - indece do vetor invalido!");
            }

        }

    }

}
