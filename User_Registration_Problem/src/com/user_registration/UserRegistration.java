package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void firstName() {
		while(true)
	{
		System.out.println("Enter first Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if (patternValidity == true) {
			System.out.println(" first name is Valid");	
			break;
		}
		else {
			
			System.out.println("please enter a valid first name");
			
		}
	}
}		
	public static void lastName() {
		while(true)
	{		
		System.out.println("Enter last Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if (patternValidity == true) {
		
			System.out.println(" last name is Valid");	
			break;
		}
		else {
	
			
			System.out.println("please enter a valid last name");
		}
	}
}		
	public static void email() {
		while(true)
	{		
		System.out.println("Enter your Email");
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		                                   
		Matcher match = pattern.matcher(email); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				
				System.out.println("your Email is Valid");
				break;
			}
			else {
				
				
				System.out.println("please enter a valid email id");
			}
	}
		
}
	public static void mobileNumber() {
		while(true)
	{		
		System.out.println("Enter Valid Mobile Number");
		Scanner input = new Scanner(System.in);
		String mobileNumber = input.nextLine();
		Pattern pattern = Pattern.compile("^[1-9]{2}[ ]{1}[1-9]{1}[0-9]{9}$");
		Matcher match = pattern.matcher(mobileNumber); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred Mobile Number is Valid");
				break;
			}
			else {
				
				System.out.println("please enter a valid mobile number");
			}
			
	}
}		
	
	public static void validatePassword() {
		while(true)
	{		
		System.out.println("Enter password it should have atleast one Uppercase, one digit and one special character");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");
		Matcher match = pattern.matcher(password); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred password is Valid");	
				break;
			}
			else {
			
				System.out.println("please enter a valid password");
			}
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