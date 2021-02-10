package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void firstName() {
		System.out.println("Enter first Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if (patternValidity == true) {
			System.out.println(" first name is Valid");	
		}
		else {
			System.out.println("first name is Invalid");
		}
	}
	public static void lastName() {
		
		System.out.println("Enter last Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2}[a-z]*");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
		if (patternValidity == true) {
		
			System.out.println(" last name is Valid");	
		}
		else {
	
			System.out.println("last name is Invalid");
		}
	}
	public static void email() {
		System.out.println("Enter your Email");
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		Pattern pattern = Pattern.compile("^[A-Za-z0-9_][A-Za-z0-9_.]*[@]{1}[a-z]+[.][a-z]{2,6}$");
		Matcher match = pattern.matcher(email); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				
				System.out.println("your Email is Valid");
			}
			else {
				
				System.out.println("Your Email is Invalid");
			}
	}
	public static void mobileNumber() {
		System.out.println("Enter Valid Mobile Number");
		Scanner input = new Scanner(System.in);
		String mobileNumber = input.nextLine();
		Pattern pattern = Pattern.compile("^[1-9]{2}[ ]{1}[1-9]{1}[0-9]{9}$");
		Matcher match = pattern.matcher(mobileNumber); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred Mobile Number is Valid");	
			}
			else {
				System.out.println("Entred Mobile Number is Invalid");
			}
	}
	public static void Password() {
		System.out.println("Enter password it should have atleast one Uppercase, one digit and one special character");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		Pattern pattern = Pattern.compile("^.{8,20}$");
		Matcher match = pattern.matcher(password); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred password is Valid");	
			}
			else {
				System.out.println("Entred passowrd is Invalid");
			}
	}
	public static void validatePassword() {
		System.out.println("Enter password it should have atleast one Uppercase, one digit and one special character");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");
		Matcher match = pattern.matcher(password); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("Entred password is Valid");	
			}
			else {
				System.out.println("Entred passowrd is Invalid");
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