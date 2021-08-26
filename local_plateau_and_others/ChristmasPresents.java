import java.util.Scanner;

public class ChristmasPresents {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int A, O, L;
        A = console.nextInt();
        L = console.nextInt();
        O = console.nextInt();
        String s = "";
        s += (L>A && O>A)? "Anna \n" : "";
        s += (A>L)? "Laura \n" : "";
        s += (A>O || L>O)? "Oscar \n" : "";

         System.out.println((s.length()==0)? "None" : s);
    }
}