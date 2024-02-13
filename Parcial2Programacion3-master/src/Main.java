import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [][] matriz = new String[6][6];

        String[][] casos = {
                {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"}, //caso 1 secuencia horizontal, vertical, diagonal CASO DEL WORD
                {"ATGCGA", "CATTGC", "CCCAAA", "AGAATG", "CCCAAA", "TTGGAG"}, //caso 2 sin secuencias
                {"ATGCCA", "CAGTCC", "TTATCT", "AGAACG", "CCCCCA", "TTTTAG"}, //caso 3 secuencia horizontal,vertical, diagonal
                {"TAAAAA", "CAGTGC", "TTATGT", "AGAAGG", "CGCCTA", "TCACTG"}, //caso 4 secuencia horizontal
                {"ATGCGA", "CAGTGC", "TTATGT", "AGAATG", "TCCCTA", "TCACTG"}, //caso 5 secuencia diagonal
                {"CTGCGA", "CCGTGC", "TTCTGT", "AGACGG", "AAAATA", "TTTTAG"}, //caso 6 secuencia horizontal, vertical, diagonal
                {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCTTA", "TCACTG"}, //caso 7 secuencia vertical, diagonal
                {"GTGCGA", "CGGTGC", "TTGTGT", "AGAGGG", "CCCCTA", "TTTTAG"}, //caso 8 secuencia horizontal, vertical, diagonal
                {"CTGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCGTA", "GTTAAG"}, //caso 9 secuencia vertical
                {"ATGCGA", "CTGTAC", "TTAAGT", "AGAAGG", "CCGCCA", "ATTTAG"}  //caso 10 secuencia diagonal inversa
        };


        System.out.println("Matriz:");

        //Armado de la matriz
        for (int caso = 0; caso < casos.length; caso++) {
            System.out.println("Evaluando Caso " + (caso + 1) + ":");

            for (int i = 0; i < casos[caso].length; i++) {
                for (int j = 0; j < casos[caso][0].length(); j++) {
                    matriz[i][j] = String.valueOf(casos[caso][i].charAt(j));
                    System.out.print(" " + matriz[i][j] + " ");
                }
                System.out.println();
            }

            boolean isMutant = verificarMutante.isMutant(matriz);
            System.out.println("Mutante: " + isMutant);
            System.out.println();
        }
    }
}