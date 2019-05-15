/*
 * InputPassword.java
 * 
 * 
 */

import java.util.Scanner;

public class InputPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PasswordSecurity x = new PasswordSecurity();

        boolean isPasswordGood = false;
        
        while (!isPasswordGood) {
            System.out.print("\n\nEnter your password: ");
            String password = input.nextLine();
            System.out.println("");
            
            if (!x.character(password)) {
				System.out.println("Your password is too short! Your password should be at least 6 character long");
            }
            else if (!x.lower(password)) {
				System.out.println("The password needs to include at least one lowercase letter");
            }
            else if (!x.upper(password)) {
				System.out.println("The password needs to include at least one uppercase letter");
            }
            else if (!x.digit(password)) {
				System.out.println("The password must contain at least one digit");
            }
            
            else if (!x.special(password)) {
				System.out.println("The password should contain at least one special character");
            }
            else {
				isPasswordGood = true;
			}
        }
        
        System.out.println("Yep, that's a good password!");
    }
}
