import java.util.Scanner;

public class RandomGroups {
    public static void main(String [] args) {
        System.out.print("press enter: ");
        Scanner s = new Scanner(System.in);
        String groupsCalled = "";
        
        for(int i = 0; i < 8; i++) {
            String input = s.nextLine();
            int group = (int)(Math.random() * 8 + 1);
            String g = "" + group;

            while (groupsCalled.indexOf(g) != -1) {
                group = (int)(Math.random() * 8 + 1);
                g = "" + group;
            }
            groupsCalled += g;
            System.out.println(group);
        }
        
    }
}
