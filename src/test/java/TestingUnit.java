
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import userregistration.UserRegistration;
import userregistration.UserRegistrationException;


public class TestingUnit {
	/**
	 * STEPS
	 * ======================================================
	 * 1.checking wether first name is valid or invalid
	 * 2.checking weather last name is valid or invalid
	 * 3.checking wether phone number is valid or invalid
	 * 4.checking wether password is valid or invalid
	 * 5. checking wether email is valid or invalid
	 * ======================================================
	 */
	
	/*
	 * 1.checking wether name is valid or invalid
	 */

	@Test
	public void firstNames() {

		UserRegistration userReg = new UserRegistration("Shardul");

		try {
			boolean result = userReg.validateFirstName();
		} catch (UserRegistrationException e) {

			System.out.println(e);
		}

	}

	/*
	 * 2.checking weather  last name is valid or invalid
	 */

	@Test
	public void lastName() {
		UserRegistration userReg = new UserRegistration("Kumbhar");
		try {
			boolean result = userReg.validateLastName();
		} catch (UserRegistrationException e) {

			// e.printStackTrace();

			System.out.println(e);
		}
	}

	/*
	 * 3.checking wether phone number is valid or invalid
	 */
	@Test
	public void phoneNumber() {
		UserRegistration userReg = new UserRegistration("91 7709125030");
		try {
			boolean result = userReg.validatePhoneNumber();
		} catch (UserRegistrationException e) {

			// e.printStackTrace();

			System.out.println(e);
		}
	}

	/*
	 * 4.checking wether password is valid or invalid
	 */
	@Test
	public void password() {
		UserRegistration userReg = new UserRegistration("Shar%123");
		try {
			boolean result = userReg.validatePassword();
		} catch (UserRegistrationException e) {

			// e.printStackTrace();

			System.out.println(e);
		}
	}

	/*
	 *5. checking wether email is valid or invalid
	 */
	@Test
	public void email() {
		UserRegistration userReg = new UserRegistration("shardul22@111gmail.com");
		try {
			boolean result = userReg.validateEmail();
		} catch (UserRegistrationException e) {

			// e.printStackTrace();

			System.out.println(e);
		}
	}

}