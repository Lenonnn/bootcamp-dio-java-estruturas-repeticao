package br.com.dio.exercicios.estruturasderepeticao;

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int idade;

        while(true) {

            System.out.println("Nome: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Finaliza aqui...");

    }

}
