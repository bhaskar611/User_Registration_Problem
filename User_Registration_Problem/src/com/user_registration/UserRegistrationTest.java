package com.user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();
	@Test
	
	public void test() throws UserRegistrationException {
		try {
		boolean result = UserRegistration.firstName();
		assertEquals(true, result);
	}
	
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	
}	
	@Test
	public void test1() throws UserRegistrationException {
		try {
		boolean result = UserRegistration.lastName();
		assertEquals(true, result);
		}
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test2() throws UserRegistrationException {
		try {
		boolean result = UserRegistration.email();
		assertEquals(true, result);
		
		}
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test3() throws UserRegistrationException {
		try {
		boolean result = UserRegistration.mobileNumber();
		assertEquals(true, result);
		}
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test4() throws UserRegistrationException {
		try {
		boolean result = UserRegistration.validatePassword();
		assertEquals(true, result);
		}
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	

    

}

