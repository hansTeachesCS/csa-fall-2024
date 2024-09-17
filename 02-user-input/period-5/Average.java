// STEP 1: import statement
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // STEP 2: create the Scanner object
        Scanner s = new Scanner(System.in);

        // STEP 3: prompt the user for input
        System.out.print("enter your first test: ");
        // STEP 4: accept and store input
        int test1 = s.nextInt();

        System.out.print("enter your second test: ");
        int test2 = s.nextInt();

        System.out.print("enter your third test: ");
        int test3 = s.nextInt();
        // System.out.println(test1 + " " + test2 + " " + test3);

        System.out.println("average: " + calculateAverage(test1, test2, test3));
    } // end of main method

    /*
     * N: calculateAverage
     * P: find the average of 3 numbers
     * I: 3 numbers (ints)
     * R: the average (double)
     */
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    } // end of calculateAverage method

} // end Average class