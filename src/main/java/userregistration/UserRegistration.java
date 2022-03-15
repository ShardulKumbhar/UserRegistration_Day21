package userregistration;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration {
	
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
    public boolean validateFirstName(String fname){
        Pattern pattern = Pattern.compile(namePattern);
 
        return pattern.matches(namePattern,fname);
       
    }

    /*
     * 3.created method to check last name
     */
    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(namePattern);
        
        return pattern.matches(namePattern,lName);
        
    }
    /*
     *4. created method to check email
     */
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matches(emailPattern,email);
    }

    /*
     * 5.created method to check phone number
     */
    public boolean validatePhoneNumber(String phNumber) {
    	
        Pattern pattern = Pattern.compile(phonePattern);
        return pattern.matches(phonePattern,phNumber);
    }

    /*
     *6. created method to check password
     */
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(passwordPattern);
        return pattern.matches(passwordPattern,password);
    
    }
}

