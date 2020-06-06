public class OddSum {
	public static int getOddSum(int input1) {
	    int sum = 0;
		while (input1 != 0) {
			int digit = input1 % 10;
			if (digit % 2 == 1) sum += digit;
			input1 /= 10;
		}
		return sum;
	}
}
