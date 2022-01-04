package br.com.dio.exercicios.estruturasderepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada gostaria de exibir? ");
        int numero = scan.nextInt();

        System.out.println("*** Primerio Jeito ***");
        if(numero >= 1 && numero <= 10) {

            System.out.println("1 x " + numero + " = " + ( 1 * numero));
            System.out.println("2 x " + numero + " = " + ( 2 * numero));
            System.out.println("3 x " + numero + " = " + ( 3 * numero));
            System.out.println("4 x " + numero + " = " + ( 4 * numero));
            System.out.println("5 x " + numero + " = " + ( 5 * numero));
            System.out.println("6 x " + numero + " = " + ( 6 * numero));
            System.out.println("7 x " + numero + " = " + ( 7 * numero));
            System.out.println("8 x " + numero + " = " + ( 8 * numero));
            System.out.println("9 x " + numero + " = " + ( 9 * numero));
            System.out.println("10 x " + numero + " = " + ( 10 * numero));

        } else {

            System.out.println("Digite uma tabuada valida! Sugestão de valores entre 1 e 10.");

        }

        System.out.println("*** Segundo jeito ***");
        if(numero >= 1 && numero <= 10){
            for(int i = 0; i < 10; i++){
                System.out.println( (i + 1) + " X " + numero + " = " + (i * numero) );
            }

        }else{
            System.out.println("Digite uma tabuada valida! Sugestão de valores entre 1 e 10.");
        }


    }
}
