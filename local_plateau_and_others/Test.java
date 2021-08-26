public class Test {
    public static void main(String args[]) {
        int[][] arrA = {
            {2,3},
            {7,4}
        };

        int[][] arrB = {
            {-3,2},
            {2,5}
        };       



        int[][] res = MatrixMul.matrixMul(arrA, arrB);
        MatrixMul.printMatrix(res);
    }
}