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
            System.out.println("Idade * : " + idade);
        }

        for ( int a = 0; a < idades.length; a++){
            int idade = idades[a];
            System.out.println("Idade : " + idade);
        }

        for ( int idade : idades ) {
            if ( idade >= 18 )
            System.out.println("Idade - : " + idade);
        }

        for ( int a = 0; a < idades.length; a++){
            int idade = idades[a];
            if ( idade >= 18 ) {
                System.out.println("Idade / " + idade + " é maior que 18 anos");
            }
            else {
                System.out.println("Com " + idade + " anos, é menor de idade!");
            }
        }

        long[][] m = new long[3][3];

        char[][] jogo = new char[3][3];
        jogo[0][0] = 'X';
        jogo[2][1] = 'O';
        System.out.println("Posição 0 " + jogo[0][0]);
        System.out.println("Posição 8 " + jogo[2][1]);

        int[][][] n = new int[3][3][3];
        n[0][0][0] = 10;
        n[1][1][0] = 20;

        //System.out.println("Array n multidimensional" + n);

        int[][] b = new int[][]{{1,2},{3,4}};
        int[][] l = {{5,6},{7,8}};
        int[][][] t = new int[][][]{ {{1,2},{3,4}}, {{5,6},{7,8}} };
        int[][][] x = { {{1,2},{3,4}}, {{5,6},{7,8}} };

        int[][] idades_ = new int[][]{{12,35},{45,22}};
        /*  12  35
            45  22   */

        for (int[] id1 : idades_ ) {
            for (int id2 : id1 ){
                System.out.println(id2);
            }
        }

        for (int c = 0; c < idades_.length; c++){
            // define id para cada loop olhando C -> id = [12,35] ; id = [45,22];
            int[] id = idades_[c];
            for (int d = 0; d < id.length; d++){ // 0 < id( 1 ) - imprime
                System.out.println("Age: " + idades_[c][d]);//[0][0];
            }
        }

        byte[] bytes = new byte[2];
        bytes[1] = 100;

        float[] floats = new float[2];
        floats[1] = 10.98f;

        for (byte byte_ : bytes ) {
            System.out.println("byte: " + byte_);
        }

        for (float float_ : floats ) {
            System.out.println("float: " + float_);
        }
    }
}
