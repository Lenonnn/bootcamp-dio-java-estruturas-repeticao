package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Tamanho do Array: " + vetor.length);

        int count = 0;
        System.out.print("Vetor Original : ");
        // Ordenado
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " , ");
            count++;
        }

        System.out.print("\nVetor invertido : ");
        // Invertido
        for(int i = ( vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " , ");
        }

    }
}
