package br.com.dio.exercicios.arrays;
/*
    Faça um programa que leia um vetor de 6 caracteres,
    e diga quantos são consoantes.
    Imprima consoantes
 */
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int qtdConsoantes = 0;
        int counter = 0;

        do{
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            // adiciona apenas consoantes no array
            if ( !( letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u") )) {
                consoantes[counter] = letra;
                qtdConsoantes++;
            }

            counter++;
        } while (counter < consoantes.length);

        System.out.print("Consoantes : ");

        // foreach
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade de consoantes : " + qtdConsoantes);

    }
}
