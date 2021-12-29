import java.util.Date;

public class MatrixMultiplicationClassic {
    public static void main(String[] args) {
        int matrixSize = 2000;
        int[][] m1 = MatrixGenerator.generateMatrix(matrixSize, matrixSize);
        int[][] m2 = MatrixGenerator.generateMatrix(matrixSize, matrixSize);

        Date start = new Date();
        int[][] result = multiply(m1, m2);
        Date end = new Date();

        System.out.println("\nClassic multiplication: time taken in milliseconds: " + (end.getTime() - start.getTime()));
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int resultRows = matrix1.length;
        int resultColumns = matrix2[0].length;

        int[][] result = new int[resultRows][resultColumns];

        int columns2 = matrix2[0].length;

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < resultColumns; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
