package util;

public class Utils {
	public static boolean validateString(String input) {
		if(input == null || "".equals(input.trim()))
			return false;
		return true;
	}
}
