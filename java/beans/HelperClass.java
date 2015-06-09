package beans;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class HelperClass {

	public static String genString(){
		SecureRandom random = new SecureRandom();
		return new BigInteger(50, random).toString(32);
	}
	
	public static String generateRandom(int length) {
	    Random random = new Random();
	    char[] digits = new char[length];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    return String.valueOf(Long.parseLong(new String(digits)));
	}
	
	
}
