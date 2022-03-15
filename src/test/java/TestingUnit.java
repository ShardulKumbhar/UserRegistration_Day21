
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import userregistration.UserRegistration;


public class TestingUnit {

	
            /*
             * 1.created object of class
             */
	UserRegistration userReg = new UserRegistration();

	/*
	 * common steps
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
	


}
