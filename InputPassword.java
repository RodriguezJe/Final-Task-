/*
 * InputPassword.java
 * 
 * 
 */

import java.util.Scanner;
public class InputPassword {
	
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		PasswordSecurity x= new PasswordSecurity();
		
		System.out.print("What is your password? ");
		String password= input.nextLine();
		
		if (x.character(password)){
			
			System.out.println("Your password is the correct length");
			
		}else{
			
			System.out.println("Your password is to short");
			
		}
		
		if (x.lower(password)){
			
			System.out.println("The password includes at least one lowercase letter");
			
			
		}else{
			
			System.out.println("The password needs to include at least one lowercase letter");
			
			
		}
		
		if (x.upper(password)){
			
			System.out.println("The password includes at least one uppercase letter");
			
		}else{
			
			System.out.println("The password needs to include at least one uppercase letter");
			
			
		}
		
		if(x.digit(password)){
			
			System.out.println("The password contains at least one digit");
			
		}else{
			
			System.out.println("The password must contain at least one digit");
			
		}
		
		if (x.special(password)){
			
			System.out.println("The password contains at least one special character");
			
		}else{
			
			System.out.println("The password should contain at least one special character");
			
			
		}
		
	}
}

