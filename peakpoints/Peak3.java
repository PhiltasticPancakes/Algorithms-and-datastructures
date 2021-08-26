import java.util.*;

public class Peak3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = console.nextInt();
        }
        System.out.println(peak3(A, 0, n-1));
    }

    public static int peak3(int[] A, int i, int j) {
        int m = (i+j)/2;
        int next =  m+1;
        int prev = m-1;
        if((next >= A.length || prev < 0) || (A[m] >= A[next]) &&  A[m] >= A[prev]) {
            return m;
        } else if(A[prev] > A[m]) {
            return peak3(A, i, prev);
        }
        return peak3(A, next, j);
    }

}