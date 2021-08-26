import java.util.ArrayList;

public class LongestPlateau {
    public static ArrayList<Integer> plateau(int[] A) {
        ArrayList<Integer> longestSeq = new ArrayList<Integer>();
        ArrayList<Integer> curSeq = new ArrayList<Integer>();
        int i = 1;
        while(i < A.length-1) {
            if(A[i] > A[i-1]) {
                curSeq = new ArrayList<Integer>();
                curSeq.add(A[i]);
                while(i < A.length-1 && A[i]==A[i+1]) {
                    curSeq.add(A[i]);
                    i++;
                }

                if(i < A.length-1 && curSeq.size() > longestSeq.size() && A[i] > A[i+1]){
                    longestSeq = new ArrayList<Integer>(curSeq);
                }
            }
            i++;
        }
        return longestSeq;
    }

}