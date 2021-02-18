package com.user_registration;

public class UserRegistrationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum ExceptionType
	{
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD, GIVEN_NULL, GIVEN_EMPTY ;
	}
	
	ExceptionType type;
	
	public UserRegistrationException(ExceptionType type, String string) {
		super(string);
		this.type = type;
	}

}
