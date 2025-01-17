package words5;

import java.util.Random;

public class Utils {
	
	public static int createIntRandom(int top) {
		// scope #9
		
		Random rand = new Random ();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #9
		// Random rand = new Random();
		// String alphabetChars =
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!�$%&/()=?�?=)()/*-+^*Ǩ_:;;:_+/";
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!�$%&/()=?�?=)()/*-+^*Ǩ_:;;:_+/+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

		return charRandom;

	}

	public static String fromStringToUser(String account) {

		int dash = account.indexOf("-");
		String user = account.substring(0, dash);

		return user;
	}

	public static String fromStringToPassword(String account) {

		int firstDash = account.indexOf("-");
		int secondDash = account.indexOf("-", firstDash + 1);

		String password = account.substring(secondDash + 1, account.length());

		return password;
	}

}
