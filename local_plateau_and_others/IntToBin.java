import java.util.Scanner;

public class IntToBin {
    public static void main(String args[]){
        int input = getInput(new Scanner(System.in));
        String binInput = toBin(input);
        System.out.println(binInput);

    }

    public static int getInput(Scanner console) {
        return console.nextInt();
    }

    public static String toBin(int i) {
        return Integer.toBinaryString(i);
    }


}
