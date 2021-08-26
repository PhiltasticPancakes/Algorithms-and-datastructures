import java.util.ArrayList;

public class PlateauTest {
    public static void main(String args[]) {
        int[] testArr = {2,1,3,3,3,4,1,7,7,7,2,5,5,5,5,4};
        ArrayList<Integer> res = LongestPlateau.plateau(testArr);
        System.out.println(res);
    }
}