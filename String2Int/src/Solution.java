public class Solution {
	public int atoi(String str) {
		str = str.replace(" ", "");
		int op = 1;
		int i = 0;
		if (str.length() != 0) {
			if (str.charAt(0) == '-') {
				op = -1;
				i++;
			}
			if (str.charAt(0) == '+') {
				i++;
			}

			int len = str.length();
			char[] digits = new char[len];
			int j = 0;
			for (; i < len; i++, j++) {
				char c = str.charAt(i);
				if (Character.isDigit(c)) {
					digits[j] = c;
					// System.out.println(digits[j]);
				} else
					break;
			}
			int result = 0;
			if (digits.length != 0) {
				int high = j - 1;
				for (int k = 0; k < j; k++) {
					int digit = digits[k] - '0';
					//System.out.println(digits[k]);
					result = result + digit
							* ((int) java.lang.Math.pow(10.0, high));
					high--;
				}
				return result * op;
			}
		}

		// System.out.println(result);
		return 0;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.print(solution.atoi("+1"));
	}
}
