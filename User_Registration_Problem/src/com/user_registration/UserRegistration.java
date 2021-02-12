package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	
		public static boolean firstName() {	
		System.out.println("Enter first Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if(patternValidity == true) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		return patternValidity;	
}		
	
		public static boolean lastName() {		
		System.out.println("Enter last Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if(patternValidity == true) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		return patternValidity;	
}		
	
		public static boolean email() {
		System.out.println("Enter your Email");
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		                                   
		Matcher match = pattern.matcher(email); 
		boolean patternValidity = match.matches();
		if(patternValidity == true) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		return patternValidity;		
		
}
	
		public static boolean mobileNumber() {		
		System.out.println("Enter Valid Mobile Number");
		Scanner input = new Scanner(System.in);
		String mobileNumber = input.nextLine();
		Pattern pattern = Pattern.compile("^[1-9]{2}[ ]{1}[1-9]{1}[0-9]{9}$");
		Matcher match = pattern.matcher(mobileNumber); 
		boolean patternValidity = match.matches();
		if(patternValidity == true) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		return patternValidity;	
}		
	
	
		public static boolean validatePassword() {	
		System.out.println("Enter password it should have atleast one Uppercase, one digit and one special character");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");
		Matcher match = pattern.matcher(password); 
		boolean patternValidity = match.matches();
		if(patternValidity == true) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		return patternValidity;	
		
}	
		public String multipleEmailValidation(String name) {
	        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
	        if (Pattern.matches(regex, name)) {
	            System.out.println("Happy");
	            return "Happy";
	        } else {
	            System.out.println("Sad");
	            return "Sad";
	        }
	    }
	public static void main(String args[]) {
		
		firstName();
		lastName();
		email();
		mobileNumber();
		validatePassword();
		}
}