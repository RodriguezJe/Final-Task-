/*
 * PasswordSecurity.java
 * 
 * 
 * 
 */


public class PasswordSecurity {
	private final int REQUIREDLENGTH=6;
	
	public boolean character(String password){
		
		if( password.length()<6){
			
			return false;
		}
		
		return true;
	}
	
	public boolean lower(String password){
		
		
		boolean hasLowercase= !password.equals(password.toUpperCase());
		
		return hasLowercase;
		
	}
	
	public boolean upper(String password){
		
		boolean hasUppercase = !password.equals(password.toLowerCase());
		
		return hasUppercase;
		
	}
	
	public boolean digit(String password){
		
		boolean hasDigit;
		//regular expression checks to see if String has digit 
		hasDigit= password.matches(".*\\d+.*");
		
		return hasDigit;
		
	}
	
	public boolean special(String password){
		
		boolean hasSpecialCharacter;
		//regular expression checks to see if string contains numbers
		//letter, or spaces only
		hasSpecialCharacter= !password.matches("[A-Za-z0-9 ]*");
		return hasSpecialCharacter;
		
	
	}

}

