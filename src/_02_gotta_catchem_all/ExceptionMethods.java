package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double num1, double num2) throws IllegalArgumentException {
		double numSum = num1 / num2;
		if (num2 == 0.0) {
			throw new IllegalArgumentException();
		}
		return numSum;
	}

	public String reverseString(String string) throws IllegalArgumentException {
		String gnirts = "";
		for (int i = string.length(); i > 0; i--) {
			gnirts = gnirts + string.charAt(i);
		}
		if (string.equals("")) {
			throw new IllegalArgumentException();
		}
		return gnirts;
	}
}