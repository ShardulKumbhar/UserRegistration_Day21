package lambda.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
	/*
	 * created Interface for lambda 
	 */
	@FunctionalInterface
	interface DataValidate {
		/*
		 * created abstract method
		 */
		void Validator();
	}

	public static void main(String[] args) {
		
		/**
		 * PROCEDURE
		 * ===========================================================
		 * COMMON STEPS
		 * ---------------------------------
		 * 1.Created a Pattern
		 * 2.Taking User input 
		 * 3.defining Pattern and Matcher 
		 * 4.Checking valid or not
		 * ---------------------------------
		 * 1.Validating first name with use of lambda and regex
		 * 2.Validating last name with use of lambda and regex
		 * 3.Validating email with use of lambda and regex
		 * 4.Validating mobile number with use of lambda and regex
		 * 5.Validating Password with use of lambda and regex
		 * =================================================================
		 */
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 1.Validating first name with use of lambda and regex
		 */

		/*
		 * COMMON STEPS 
		 * ---------------------------------
		 * created reference for interface and used lambda expression
		 * 1.Created a Pattern
		 * 2.Taking User input 
		 * 3.defining Pattern and Matcher 
		 * 4.Checking valid or not
		 * 5. validiting with interface
		 * ---------------------------------
		 */
 
		DataValidate firstName = () -> {

			String regex = "^[A-Z]{1}[a-z]{2,}$";

			System.out.println("\nEnter your First name");
			String name = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);

			if (matcher.matches()) {
				System.out.println(".....valid.....");
			} else {
				System.out.println("....InValid Name.....");
			}
		};

		
		firstName.Validator();

				/*
				 * 2.Validating last name with use of lambda and regex
				 */
		DataValidate lastName = () -> {

			String regex = "^[A-Z]{1}[a-z]{2,}$";

			System.out.println("\nEnter your last name");
			String name = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			if (matcher.matches()) {
				System.out.println(".....valid.....");
			} else {
				System.out.println("....InValid Name.....");
			}
		};

		/*
		 * 
		 */
		lastName.Validator();

		/*
		 * 3.Validating email with use of lambda and regex
		 */
		DataValidate eMail = () -> {

			System.out.println("\nEnter your Email id");
			String email = sc.next();

			Pattern pattern = Pattern
					.compile("^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$");
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(".....valid.....");
			} else {
				System.out.println("....InValid Gmail...");
			}
		};

		eMail.Validator();

		/*
		 * 4.Validating mobile number with use of lambda and regex
		 */
		DataValidate Mobile = () -> {

			System.out.println("\nEnter your Mobile number");
			String mobile = sc.nextLine();

			Pattern pattern = Pattern.compile("^[0-9]{2}[ ]?[6-9]{1}[0-9]{9}$");
			Matcher matcher = pattern.matcher(mobile);
			if (matcher.matches()) {
				System.out.println(".....valid.....");
			} else {
				System.out.println(" ....InValid Gmail...");
			}
		};

		Mobile.Validator();

		/*
		 * 5.Validating Password with use of lambda and regex
		 */
		DataValidate Password = () -> {

			System.out.println("\nEnter your Password");
			String password = sc.next();

			Pattern pattern = Pattern.compile("^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$");
			Matcher matcher = pattern.matcher(password);
			if (matcher.matches()) {
				System.out.println("....Valid.....");
			} else {
				System.out.println("....InValid Gmail...");
			}
		};
		Password.Validator();

	}

}