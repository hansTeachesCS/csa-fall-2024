import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // get user input
        String str = s.nextLine();

        // send the String to a method to test
        System.out.println(middleThree(str));

        s.close();
    }

    public static String middleThree(String str) {
        // determine the length of str
        int length = str.length();

        // reduce length by dividing by two
        length /= 2;

        // subtract by 1
        int from = length - 1;

        // add two
        int to = length + 2;

        // return
        return str.substring(from, to);
    }
}