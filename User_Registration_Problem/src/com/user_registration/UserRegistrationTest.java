package com.user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();
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
	@Test
    public void validateEmail(){
        String testValidString1 = userRegistration.multipleEmailValidation("abc@yahoo.com");
        String testValidString2 = userRegistration.multipleEmailValidation("abc-100@yahoo.com");
        String testValidString3 = userRegistration.multipleEmailValidation("abc.100@yahoo.com");
        String testValidString4 = userRegistration.multipleEmailValidation("abc111@abc.com");
        String testValidString5 = userRegistration.multipleEmailValidation("abc-100@abc.net");
        String testValidString6 = userRegistration.multipleEmailValidation("abc.100@abc.com.au");
        String testValidString7 = userRegistration.multipleEmailValidation("abc@1.com");
        String testValidString8 = userRegistration.multipleEmailValidation("abc@gmail.com.com");
        String testValidString9 = userRegistration.multipleEmailValidation("abc+100@gmail.com");

        String testInvalidString1 = userRegistration.multipleEmailValidation("abc");
        String testInvalidString2 = userRegistration.multipleEmailValidation("abc@.com.my");
        String testInvalidString3 = userRegistration.multipleEmailValidation("abc123@gmail.a");
        String testInvalidString4 = userRegistration.multipleEmailValidation("abc123@.com");
        String testInvalidString5 = userRegistration.multipleEmailValidation("abc123@.com.com");
        String testInvalidString6 = userRegistration.multipleEmailValidation(".abc@abc.com");
        String testInvalidString7 = userRegistration.multipleEmailValidation("abc()*@gmail.com");
        String testInvalidString8 = userRegistration.multipleEmailValidation("abc@%*.com");
        String testInvalidString9 = userRegistration.multipleEmailValidation("abc..2002@gmail.com");
        String testInvalidString10 = userRegistration.multipleEmailValidation("abc.@gmail.com");
        String testInvalidString11 = userRegistration.multipleEmailValidation("abc@abc@gmail.com");
        String testInvalidString12 = userRegistration.multipleEmailValidation("abc@gmail.com.1a");

        Assert.assertEquals("Happy",testValidString1);
        Assert.assertEquals("Happy",testValidString2);
        Assert.assertEquals("Happy",testValidString3);
        Assert.assertEquals("Happy",testValidString4);
        Assert.assertEquals("Happy",testValidString5);
        Assert.assertEquals("Happy",testValidString6);
        Assert.assertEquals("Happy",testValidString7);
        Assert.assertEquals("Happy",testValidString8);
        Assert.assertEquals("Happy",testValidString9);
       


        Assert.assertEquals("Sad",testInvalidString1);
        Assert.assertEquals("Sad",testInvalidString2);
        Assert.assertEquals("Sad",testInvalidString3);
        Assert.assertEquals("Sad",testInvalidString4);
        Assert.assertEquals("Sad",testInvalidString5);
        Assert.assertEquals("Sad",testInvalidString6);
        Assert.assertEquals("Sad",testInvalidString7);
        Assert.assertEquals("Sad",testInvalidString8);
        Assert.assertEquals("Sad",testInvalidString9);
        Assert.assertEquals("Sad",testInvalidString10);
        Assert.assertEquals("Sad",testInvalidString11);
        Assert.assertEquals("Sad",testInvalidString12);
        
    }

    

}

