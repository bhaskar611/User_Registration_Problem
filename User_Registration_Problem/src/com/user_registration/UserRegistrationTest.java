package com.user_registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;



class UserRegistrationTest {
	public static Scanner sc = new Scanner(System.in);
	UserRegistration userRegistration = new UserRegistration();
	
	@Test
	public void First_Name_Null_Test()throws UserRegistrationException { 
		try {
			boolean result = userRegistration.validateFirstName.checkIfValidate(null);
		} catch(UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}

	@Test
	public void First_Name_Invalid_Input_Test() throws UserRegistrationException {
		try {
			boolean result = userRegistration.validateFirstName.checkIfValidate("");
		}catch(UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}

	@Test
	public void First_Name_Test() throws UserRegistrationException {
		boolean result;
		System.out.println("Enter First Name");
		String fName = sc.next();
			result = userRegistration.validateFirstName.checkIfValidate(fName);
			Assert.assertEquals( true, result );
	}

	@Test
	public void Last_Name_Test() throws UserRegistrationException {
		boolean result ;
		System.out.println("Enter Last Name");
		String lName = sc.next();
			result =userRegistration.validateLastName.checkIfValidate(lName);
			Assert.assertEquals(true, result );
	}

	@Test
	public void Email_Empty_Test() throws UserRegistrationException{
		try {
			boolean result = userRegistration.validateEmail.checkIfValidate("");
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY , e.type );
		}
	}

	@Test
	public void Email_Null_Test() throws UserRegistrationException{
		try {
			boolean result = userRegistration.validateEmail.checkIfValidate(null);
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL , e.type );
		}
	}

	@Test
	public void Email_Test() throws UserRegistrationException {
		System.out.println("Enter Email");
		String email = sc.next();
		boolean result = userRegistration.validateEmail.checkIfValidate(email);
		Assert.assertEquals( true, result);
	}

	@Test
	public void Mobile_Null_Test() throws UserRegistrationException
	{
		try {
			boolean result =  userRegistration.validateMobileNumber.checkIfValidate(null);
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL, e.type );
		}
	}

	@Test
	public void  Mobile_Empty_Test() throws UserRegistrationException
	{
		try {
			boolean result =  userRegistration.validateMobileNumber.checkIfValidate("");
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY, e.type );
		}
	}

	@Test
	public void Mobile_Number_TEST() throws UserRegistrationException
	{
		
		
		boolean result = userRegistration.validateMobileNumber.checkIfValidate("91 8008520597" );
		Assert.assertEquals(true, result );

	}

	@Test
	public void Password_NULL_Test() throws UserRegistrationException
	{
		
		try {
			boolean result = userRegistration.validatePassword.checkIfValidate(null);
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL, e.type );
		}

	}

	@Test
	public void Password_Empty_Test() throws UserRegistrationException
	{
		try {
			boolean result = userRegistration.validatePassword.checkIfValidate("");
		} catch (UserRegistrationException e) {
			System.out.println(e.type+" will give message  "+ e.getMessage());
			Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY, e.type );
		}


	}

	@Test
	public void PasswordTest() throws UserRegistrationException
	{
		System.out.println("Enter password Number");
		String password = sc.next();
		boolean result = userRegistration.validatePassword.checkIfValidate(password);
		Assert.assertEquals( true, result);
	}
    

	
}	
	

	
	
	

	
	

	
	
	



