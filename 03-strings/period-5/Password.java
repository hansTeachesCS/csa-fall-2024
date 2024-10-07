import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String oldPassword = "password";
        
        Scanner s = new Scanner(System.in);

        System.out.print("enter a new super secure password: ");
        String newPassword = s.nextLine();

        // test #1: is the password long enough? at least 8 characters
        boolean longEnough = newPassword.length() >= 8;
        System.out.println("length: " + longEnough);

        // test #2: are the passwords the same?
        boolean samePassword = newPassword.equals(oldPassword);
        System.out.println(".equals(): " + samePassword);

        boolean samePasswordV2 = newPassword == oldPassword;
        System.out.println("==: " + samePasswordV2);

        System.out.println(System.identityHashCode(oldPassword) + " " +System.identityHashCode(newPassword));
        
        String pw = "123456789";
        System.out.println(".equals(): " + pw.equals(oldPassword));
        System.out.println("==: " + (pw == oldPassword));
        System.out.println(System.identityHashCode(oldPassword) + " " +System.identityHashCode(pw));
        

        // test #3: is the new password simply the old with a number added at the end?
        boolean sameStart = newPassword.indexOf(oldPassword) == 0;
        System.out.println(sameStart);
    }
}