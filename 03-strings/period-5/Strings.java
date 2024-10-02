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

    public static String middleThree(String s) {
        return s.substring(s.length()/2 - 1, s.length()/2 + 2);
    }

}