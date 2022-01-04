package br.com.dio.exercicios.estruturasderepeticao;

// Ex.: 5! = 120 || ( 5 * 4 * 3 * 2 * 1 )

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fatorial deseja exibir ? ");
        int numero = scan.nextInt();

        int x = 1;

        System.out.println("Fatorial a ser descoberto ! = " + numero);

        for( int i = numero; i >= 1 ; i--){
            x = x * i ;
        }
        System.out.println("Fatorial ! = " + numero + " é = " + x);



    }
}
