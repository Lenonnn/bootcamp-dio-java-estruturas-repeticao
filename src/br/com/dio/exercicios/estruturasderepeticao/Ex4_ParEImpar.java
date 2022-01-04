package br.com.dio.exercicios.estruturasderepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int counter = 0;
        int numerosInseridos;

        int qtdPares = 0 ;
        int qtdImpares = 0;

        System.out.println("Quantos números quer inserir ? ");
        numerosInseridos = scan.nextInt();

        do{

            System.out.println("Digite o Número " + ( counter + 1 ) +" : ");
            numero = scan.nextInt();

            if (numero % 2 == 0) qtdPares++ ;
            else qtdImpares++;

            counter += 1;

        } while(counter < numerosInseridos);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

    }
}
