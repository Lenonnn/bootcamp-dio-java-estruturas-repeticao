package br.com.dio.exercicios.estruturasderepeticao;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;
        int counter = 0;

        int numerosInseridos;

        double media = 0;

        System.out.println("Quantos números quer inserir ? ");
        numerosInseridos = scan.nextInt();

        do{

            System.out.println("Digite o Número " + ( counter + 1 ) +" : ");
            numero = scan.nextInt();

            if (numero < menor || menor == 0 ){
                menor = numero ;
            }

            if (numero > maior ){
                maior = numero ;
            }

            media = media + numero;

            counter += 1;

        } while(counter < numerosInseridos);

        System.out.println("O Menor número é: " + menor );
        System.out.println("O Maior número é: " + maior );
        System.out.println("Média final é : " + (media / numerosInseridos));

    }
}
