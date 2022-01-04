package br.com.dio.exercicios.estruturasderepeticao;

import java.util.Scanner;

public class Ex2_Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a note: ");
        nota = scan.nextInt();

        while( nota < 0 || nota > 10 ){

            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();

        }
    }
}
