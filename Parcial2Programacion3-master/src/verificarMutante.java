import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verificarMutante {
    public static boolean isMutant(String[][] matriz) {
        List<String> dna = Arrays.asList("AAAA", "TTTT", "CCCC", "GGGG"); //secuencias a encontrar

        int filas = matriz.length;
        int columnas = matriz[0].length;
        boolean mutante = false; // Variable para rastrear si se encuentra una secuencia mutante
        List<String> secuenciaMutanteVertical = new ArrayList<>(); // Lista para almacenar secuencias mutantes verticales
        List<String> secuenciaMutanteDiagonal = new ArrayList<>(); // Lista para almacenar secuencias mutantes diagonales
        List<String> secuenciaMutanteHorizontal = new ArrayList<>(); // Lista para almacenar secuencias mutantes horizontales
        List<String> secuenciaMutanteDiagonalInversa = new ArrayList<>(); // Lista para almacenar secuencias mutantes diagonales inversas

        // Verificar horizontalmente
        for (int row = 0; row < filas; row++) {
            for (int col = 0; col <= columnas - dna.get(0).length(); col++) {
                StringBuilder sequence = new StringBuilder();
                //bucle para agregar 4 valores de la matriz en la clase StringBuilder
                for (int i = 0; i < dna.get(0).length(); i++) {
                    //misma fila, voy incrementando en la columna
                    sequence.append(matriz[row][col + i]);
                }
                if (dna.contains(sequence.toString()) && !secuenciaMutanteHorizontal.contains(sequence.toString())) {
                    System.out.println("Secuencia horizontalmente mutante encontrada: " + sequence.toString());
                    secuenciaMutanteHorizontal.add(sequence.toString());
                    mutante = true;
                }
            }
        }

        // Verificar verticalmente
        for (int col = 0; col < columnas; col++) {
            for (int row = 0; row <= filas - dna.get(0).length(); row++) {
                StringBuilder sequence = new StringBuilder();
                //bucle para agregar de a 4 valores de la matriz en la clase StringBuilder
                for (int i = 0; i < dna.get(0).length(); i++) {
                    //misma columna, incremento en la fila
                    sequence.append(matriz[row + i][col]);
                }

                if (dna.contains(sequence.toString()) && !secuenciaMutanteVertical.contains(sequence.toString())) {
                    System.out.println("Secuencia verticalmente mutante encontrada: " + sequence.toString());
                    secuenciaMutanteVertical.add(sequence.toString());
                    mutante = true;

                }
            }
        }

        // Verificar diagonal
        for (int row = 0; row <= filas - dna.get(0).length(); row++) {
            for (int col = 0; col <= columnas - dna.get(0).length(); col++) {
                StringBuilder sequence = new StringBuilder();
                //bucle para agregar de a 4 valores de la matriz en la clase StringBuilder
                for (int i = 0; i < dna.get(0).length(); i++) {
                    //incremento fila y columna
                    sequence.append(matriz[row + i][col + i]);
                }
                if (dna.contains(sequence.toString()) && !secuenciaMutanteDiagonal.contains(sequence.toString())) {
                    System.out.println("Secuencia diagonalmente mutante encontrada: " + sequence.toString());
                    secuenciaMutanteDiagonal.add(sequence.toString());
                    mutante = true;

                }
            }
        }
        // Verificar diagonal inversa
        for (int row = filas - 1; row >= dna.get(0).length() - 1; row--) {
            for (int col = 0; col <= columnas - dna.get(0).length(); col++) {
                StringBuilder sequence = new StringBuilder();
                //bucle para agregar de a 4 valores de la matriz en la clase StringBuilder
                for (int i = 0; i < dna.get(0).length(); i++) {
                    //incremento columna y resto fila
                    sequence.append(matriz[row - i][col + i]);
                }
                if (dna.contains(sequence.toString()) && !secuenciaMutanteDiagonalInversa.contains(sequence.toString())) {
                    System.out.println("Secuencia diagonal inversa mutante encontrada: " + sequence.toString());
                    secuenciaMutanteDiagonalInversa.add(sequence.toString());
                    mutante = true;
                }
            }
        }

        if (mutante) {
            return true; // Se encontró al menos una secuencia mutante
        }
        return false; // No se encontraron secuencias mutantes
    }
}
