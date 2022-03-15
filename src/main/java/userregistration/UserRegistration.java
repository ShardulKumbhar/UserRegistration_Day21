package userregistration;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private String message;
	/*
	 * created counstrutor
	 */
	public UserRegistration(String message) {
		super();
		this.message = message;
	}

	/*
	 * creating setter and getters
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * PROCEDURE
	 * ==============================================
	 * 1.created varous patterns to match
	 * 2.created method to check first name
	 * 3.created method to check last name
	 * 4. created method to check email
	 * 5.created method to check phone number
	 * 6. created method to check password
	 * ================================================
	 */

	/*
	 * 1.created varous patterns to match
	 */
	private static final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String emailPattern = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
	private static final String phonePattern = "^[0-9]{2}[ ]?[6-9]{1}[0-9]{9}$";
	private static final String passwordPattern = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

	/*
	 * 2.created method to check first name
	 */

	public boolean validateFirstName() throws UserRegistrationException  {

		Pattern pattern = Pattern.compile(message);

		if (pattern.matches(namePattern, message) == true)

			return pattern.matches(namePattern, message);
		else {
			throw new UserRegistrationException("Invalid .....Enter proper first name");
		}

	}

	/*
	 * 3.created method to check last name
	 */
	public boolean validateLastName() throws UserRegistrationException {
		Pattern pattern = Pattern.compile(namePattern);
		if (pattern.matches(namePattern, message) == true)

			return pattern.matches(namePattern, message);
		else {
			throw new UserRegistrationException("Invalid .....Enter proper last name");
		}

	}

	/*
	 * 4. created method to check email
	 */
	public boolean validateEmail() throws UserRegistrationException {
		Pattern pattern = Pattern.compile(emailPattern);
		if (pattern.matches(emailPattern, message) == true)
			return pattern.matches(emailPattern, message);
		else {
			throw new UserRegistrationException("Invalid .....Enter proper email address");
		}

	}

	/*
	 * 5.created method to check phone number
	 */
	public boolean validatePhoneNumber() throws UserRegistrationException {

		Pattern pattern = Pattern.compile(phonePattern);
		if (pattern.matches(phonePattern, message) == true)
			return pattern.matches(phonePattern, message);
		else {
			throw new UserRegistrationException("Invalid .....Enter proper phone number");
		}

	}

	/*
	 * 6. created method to check password
	 */
	public boolean validatePassword() throws UserRegistrationException {
		Pattern pattern = Pattern.compile(passwordPattern);
		if (pattern.matches(passwordPattern, message) == true)
			return pattern.matches(passwordPattern, message);
		else {
			throw new UserRegistrationException("Invalid .....Enter proper passward");
		}

	}
}
