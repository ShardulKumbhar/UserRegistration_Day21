
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import userregistration.UserRegistration;


public class TestingUnit {
	/**
	 * STEPS
	 * ==============================================
	 * 1.created object of class
	 * 2.takeng sample email to test
	 * 3.common steps to tests
	 * 4. testing all valid email by applying loop
	 * 5.testing all unvalidemail by applying loop
	 * ================================================
	 */

	
            /*
             * 1.created object of class
             */
	UserRegistration userReg = new UserRegistration();

	
	/*
	 * 2.takeng sample email to test
	 * storing in String valid / unvalid emails
	 */
	
	public String[] validemail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com" };

	public String[] unvalidemail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
			"..abc@abc.com", ".abc()@gmail.com", "abc@%.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
			"abc@gmail.com.aa.au" };




	/*
	 * 3.common steps to tests
	 * ====================================================
	 * testing first name
	 * taking boolean output
	 * calling method to check pattern and matcher
	 * comparing output with assertequals 
	 * ====================================================
	 */
	@Test
	public void firstName() {
		boolean result = userReg.validateFirstName("Shardul");
		assertEquals(true, result);
	}

	@Test
	public void lastName() {
		boolean result = userReg.validateLastName("Kumbhar");
		assertEquals(true, result);
	}

	@Test
	public void phoneNumber() {
		boolean result = userReg.validatePhoneNumber("91 7709125030");
		assertEquals(true, result);
	}

	@Test
	public void password() {
		boolean result = userReg.validatePassword("Kumbhar@123");
		assertEquals(true, result);
	}

	@Test
	public void email() {
		boolean result = userReg.validateEmail("yahhoo@123.com");
		assertEquals(true, result);
	}
	
	
	/*
	 *4. testing all valid email by applying loop
	 */
	@Test
	public void validEmailTest() {
		for (String sample : validemail) {

			String checker1 = sample;

			Boolean email = userReg.validateEmail(checker1);
			assertEquals(true, email);
		}

	}

	/*
	 * 5.testing all unvalidemail by applying loop
	 */
	@Test
	public void unvalidEmailTest() {

		for (String sample : unvalidemail) {
			String checker1 = sample;

			Boolean email = userReg.validateEmail(checker1);
			assertEquals(false, email);
		}
	}

}
