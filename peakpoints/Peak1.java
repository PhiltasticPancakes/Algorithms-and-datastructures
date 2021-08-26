import java.util.*;

public class Peak1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = console.nextInt();
        }
        System.out.println(peak1(A, n));
        

    }

    public static int peak1(int[] A, int n) {
        if(A[0]>=A[1]) return 0;
        for(int i = 1; i < n -1 ; i++) {
            if(A[i-1] <= A[i] && A[i] >= A[i+1]) return i;
        }
        return n-1;
    }

}