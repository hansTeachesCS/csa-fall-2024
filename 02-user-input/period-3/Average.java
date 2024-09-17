import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // STEP 1: create Scanner object
        Scanner s = new Scanner(System.in);

        // STEP 2: display a prompt on the screen
        System.out.print("enter your first test score: ");

        // STEP 3: accept and store the input
        int score1 = s.nextInt();
        // System.out.println(score1);

        System.out.print("enter your second test score: ");
        int score2 = s.nextInt();
        
        System.out.print("enter your third test score: ");
        int score3 = s.nextInt();

        System.out.println("the average is: " + calculateAverage(score1, score2, score3));
    } // end main method

    /*
     * N: calculateAverage
     * P: find the average of 3 numbers
     * I: 3 ints
     * R: a double
     */
    public static double calculateAverage(int a, int b, int c) { 
        return (a + b + c) / 3.0;
    } // end calculateAverage method


} // end Average class