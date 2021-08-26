import java.util.*;

public class Peak2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = console.nextInt();
        }
        System.out.println(peak2(A, n));
    }

    public static int peak2(int[] A, int n) {
        int max = 0;
        for(int i = 1; i < n; i++) {
            if(A[i] > A[max]) max = i;
        }
        return max;
    }

}