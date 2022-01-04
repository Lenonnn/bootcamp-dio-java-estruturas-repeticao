package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int numerosAleatorios[] = new  int[20];

        for( int i = 0; i < numerosAleatorios.length; i++){
            // Obtem numeros aleatórios com valor máximo = 100
            int numero = random.nextInt(100);
            // Appenda numero aleatória para cada posição do array
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for ( int numeroAleatorio : numerosAleatorios) {
            System.out.print(numeroAleatorio + " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numeroSucessor : numerosAleatorios ) {
            System.out.print((numeroSucessor + 1) + " ");

        }

        System.out.println("\nAntecessores dos números aleatórios: ");
        for (int numeroAntecessore : numerosAleatorios ) {
            System.out.print((numeroAntecessore - 1) + " ");

        }

    }

}

