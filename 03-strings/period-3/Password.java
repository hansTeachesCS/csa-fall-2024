import java.util.*;

public class Password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String oldPassword = "password";
        System.out.print("enter your new super secure password: ");
        String newPassword = s.nextLine(); 

        // test #1: length at least 8 characters
        boolean longEnough = newPassword.length() >= 8;
        System.out.println(longEnough);

        // test #2: is the new password the same as the old?
        boolean samePassword = newPassword.equals(oldPassword);
        boolean samePasswordV2 = newPassword == oldPassword;

        System.out.println(samePassword);
        System.out.println(samePasswordV2);
        System.out.println(System.identityHashCode(oldPassword) + " " + System.identityHashCode(oldPassword));

        String password2 = "123456789";
        System.out.println(oldPassword.equals(password2)); // true
        System.out.println(oldPassword == password2); // false
        System.out.println(System.identityHashCode(password2) + " " + System.identityHashCode(oldPassword));

        // test #3: did the user add a number to the end?
        boolean sameStart = newPassword.indexOf(oldPassword) == 0;
        System.out.println(sameStart);
        
        s.close();
    }
    
}