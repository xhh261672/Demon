
public class Solution {
	public int atoi(String str) {
		str = str.replace(" ", "");
		int op = 1;
		int i = 0;
		if (str.length() != 0){
			if (str.charAt(0) == '-')
			{op = -1; i++;}
		if (str.charAt(0) == '+')
			{i++;}
		
		int len= str.length();
		char[] digits = new char[len];
		for (; i < len; i++){
			char c = str.charAt(i);
			if (Character.isDigit(c))
				{digits[i] = c;}
			else
				break;
		}
		int result = 0;
		if (digits.length != 0){
			int high = digits.length - 1;
			
			for (int j = 0; j < digits.length; j++){
				result = result + ((int)(digits[j]) - (int)('0')) * (int)java.lang.Math.pow(10.0, high);
				high --;
			}
			return result * op;
		}
		}
		
//		System.out.println(result);
        return 0;
    }
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.print(solution.atoi("+1"));
	}
}
