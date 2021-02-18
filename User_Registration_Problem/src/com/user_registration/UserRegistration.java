package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface checkIfValidate {
    public boolean checkIfValidate(String input)throws UserRegistrationException;
}
public class UserRegistration {
	
	
	public void IsEmptyorNullString(String input) throws UserRegistrationException {
		try {
			if (input.length() == 0) {
				throw new UserRegistrationException( UserRegistrationException.ExceptionType.GIVEN_EMPTY, " Empty input not Allowed please Enter again");
			}
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException( UserRegistrationException.ExceptionType.GIVEN_NULL, "Null not allowed please Enter again ");

		}
	}

	checkIfValidate validateFirstName = (String firstName)-> {
		IsEmptyorNullString(firstName);
		boolean  matcher = firstName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			return matcher;
		} 
		return matcher;
	};

	checkIfValidate validateLastName = (String lastName) -> {
		IsEmptyorNullString(lastName);
		boolean matcher = lastName.matches("([A-Z][a-z]{2,})");
		if(matcher == true) {
			return matcher;
		}
		return matcher;

	};

	checkIfValidate validateEmail = (String email) -> {
		IsEmptyorNullString(email);
		boolean matcher = email.matches( "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$");
		if(matcher == true) {
			return matcher;
		}
		else 
			return matcher;
	};

	checkIfValidate validateMobileNumber = (String phoneNumber) -> {
		IsEmptyorNullString(phoneNumber);
		boolean matcher = phoneNumber.matches("^[1-9]{2}[ ]{1}[1-9]{1}[0-9]{9}$");
		
		if(matcher == true) {
			System.out.println("Valid Mobile Number");
			return matcher;
		}
		return matcher;
		
	};

	checkIfValidate validatePassword = (String password) -> {
		IsEmptyorNullString(password);
		boolean matcher = password.matches("(^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*[@*&^%#-*+!]{1}).{8,}$");

		if(matcher == true) {
			System.out.println("Valid Password");
			return matcher;
		}
		return matcher;

	};
}