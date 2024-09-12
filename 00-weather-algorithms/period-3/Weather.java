import java.util.*;
import java.io.*;

public class Weather {
    public static void main(String[] args) {
        // setup arrays to hold temperature data
        int[] temps23 = new int[62];
        int[] humidity23 = new int[62];
        int[] temps24 = new int[62];
        int[] humidity24 = new int[62];

        try {
            // read 2023 tempuratures
            Scanner s = new Scanner(new File("temps2023.txt"));
            int i = 0;
            while(s.hasNext()) {
                temps23[i] = Integer.parseInt(s.next());
                i++;
            } // end while loop
            
            // read 2023 humidity
            s = new Scanner(new File("humidity2023.txt"));
            i = 0;
            while(s.hasNext()) {
                humidity23[i] = Integer.parseInt(s.next());
                i++;
            } // end while loop

            // read 2024 tempuratures
            s = new Scanner(new File("temps2024.txt"));
            i = 0;
            while(s.hasNext()) {
                temps24[i] = Integer.parseInt(s.next());
                i++;
            } // end while loop

            s = new Scanner(new File("humidity2024.txt"));
            i = 0;
            while(s.hasNext()) {
                humidity24[i] = Integer.parseInt(s.next());
                i++;
            } // end while loop

        } catch(Exception e) {
            System.out.println("file not found");
        } // end catch

        // display arrays to see all values
        // System.out.println(Arrays.toString(temps23));
        // System.out.println();
        // System.out.println(Arrays.toString(humidity23));
        // System.out.println();
        // System.out.println(Arrays.toString(temps24));
        // System.out.println();
        // System.out.println(Arrays.toString(humidity24));

        int temp = 90;
        int humidity = 60;
        System.out.println("when the temperature is " + temp + " and the humidity is " + humidity + " the heat index is: " + calculateHeatIndex(temp, humidity));
        
        temp = 80;
        humidity = 40;
        System.out.println("when the temperature is " + temp + " and the humidity is " + humidity + " the heat index is: " + calculateHeatIndex(temp, humidity));
        
        temp = 100;
        humidity = 80;
        System.out.println("when the temperature is " + temp + " and the humidity is " + humidity + " the heat index is: " + calculateHeatIndex(temp, humidity));
        
        // getSum(temps23);
    } // close main method

    public static int getSum(int[] nums) {
        // STEP 1: create variable to remember total
        int total = 0;

        // STEP 2: create a loop to add all numbers in array
        for(int i = 0; i <= 61; i++) {
            // System.out.println(i);
            total = total + nums[i];
        }

        // STEP 3:
        return total;
    }

    // from Kelvin
    public static int calculateHeatIndex(int t, int rh) {
        // declare all variables
        double c1 = -42.379;
        double c2 = 2.04901523;
        double c3 = 10.14333127;
        double c4 = - .22475541;
        double c5 = - .00683783;
        double c6 = - .05481717;
        double c7 = .00122874;
        double c8 = .00085282;
        double c9 = - .00000199;

        double tSquared = Math.pow(t, 2);
        double hSquared = Math.pow(rh, 2);
        // assemble formula
        double result = c1 + c2*t + c3*rh + c4*t*rh + c5*tSquared + 
                        c6*hSquared + c7*tSquared*rh + c8*t*hSquared + 
                        c9*tSquared*hSquared;

        // return result
        return (int)(result + 0.5);
    } // end calculationHeatIndex method


} // close main class