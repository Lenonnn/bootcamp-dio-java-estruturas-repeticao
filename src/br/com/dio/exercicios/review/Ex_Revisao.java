package br.com.dio.exercicios.review;

public class Ex_Revisao {
    public static void main(String[] args) {

        int[] idades = new int[10];
        idades[0] = 27;
        idades[1] = 32;
        System.out.println("Idade 0 : " + idades[0]);
        System.out.println("Idade 1 : " + idades[1]);
        System.out.println("Idade 2 : " + idades[2]);

        int[]i = {10,25};
        System.out.println("i 0 : " + i[0]);
        System.out.println("i 1 : " + i[1]);

        int k[] = new int[] {1,2,3};
        System.out.println("K 0: " + k[0]);
        System.out.println("K 1: " + k[1]);
        System.out.println("K 2: " + k[2]);

        int[] j = new int[2];
        System.out.println("J 0: " + j[0]);

        idades = new int[] {12, 35, 45, 29 ,9, 37, 51, 61};

        for ( int idade : idades ) {
            System.out.println("Idade: " + idade);
        }

        for ( int a = 0; a < idades.length; a++){
            int idade = idades[a];
            if ( idade >= 18 ) {
                System.out.println("Idade " + idade + " é maior que 18 anos");
            }
            else {
                System.out.println("Com " + idade + " anos, é menor de idade!");
            }
        }

    }
}
