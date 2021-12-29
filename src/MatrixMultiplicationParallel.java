import java.util.Date;

public class MatrixMultiplicationParallel {
    public static void main(String[] args) {
        int matrixSize = 2000;
        int[][] m1 = MatrixGenerator.generateMatrix(matrixSize, matrixSize);
        int[][] m2 = MatrixGenerator.generateMatrix(matrixSize, matrixSize);

        int[][] result = new int[m1.length][m2[0].length];

        System.out.println("\nParallel multiplication: Matrix size = " + matrixSize);
        System.out.println("Number of threads --- Time in ms");

        for(int i = 1; i <= 10; i++) {
            Date start = new Date();
            ParallelThreadsCreator.multiply(m1, m2, result, i);
            Date end = new Date();

            System.out.println(i + " --- " + (end.getTime() - start.getTime()));
        }
    }
}
