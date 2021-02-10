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
		
	public static void main(String args[]) {
		firstName();
		lastName();
		}
}