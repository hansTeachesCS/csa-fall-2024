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
        System.out.println(Arrays.toString(temps23));
        System.out.println();
        System.out.println(Arrays.toString(humidity23));
        System.out.println();
        System.out.println(Arrays.toString(temps24));
        System.out.println();
        System.out.println(Arrays.toString(humidity24));

    } // close main method

} // close main class