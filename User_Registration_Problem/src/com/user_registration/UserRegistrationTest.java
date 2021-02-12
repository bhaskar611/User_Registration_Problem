package com.user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class UserRegistrationTest {

	
	@Test
	public void test() {
		boolean result = UserRegistration.firstName();
		assertEquals(true, result);
		
	}
	@Test
	public void test1() {
		boolean result = UserRegistration.lastName();
		assertEquals(true, result);
		
	}
	@Test
	public void test2() {
		boolean result = UserRegistration.email();
		assertEquals(true, result);
		
	}
	@Test
	public void test3() {
		boolean result = UserRegistration.mobileNumber();
		assertEquals(true, result);
		
	}
	@Test
	public void test4() {
		boolean result = UserRegistration.validatePassword();
		assertEquals(true, result);
		
	}

}
