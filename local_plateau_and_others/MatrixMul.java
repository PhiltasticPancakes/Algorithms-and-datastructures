import java.util.Scanner;

public class MatrixMul {
    public static int[][] matrixMul(int[][] A, int[][] B) {
        int[] size = {A.length, A[0].length};
        int[][] matProd = new int[size[0]][size[1]];
        for(int row = 0; row<size[0]; row++) {
            for(int col = 0; col<size[1]; col++) {
                matProd[row][col] = indiceMul(row, col, A, B);
            }
        }

        return matProd;
    }

    public static int indiceMul(int row, int col, int[][] A, int[][] B) {
        int newNum = 0;
        for(int index = 0; index<A[0].length; index++) {
            newNum += A[row][index]*B[index][col];
        }
        return newNum;
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

}
