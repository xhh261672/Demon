
public class Solution {
	 public int titleToNumber(String s) {
		 if (s == null)
			 return 0;
		 int result = 0;
		 int len = s.length();
		 for (int i = 0; i < len; i ++){
			 result += (s.charAt(i) - 'A' + 1) * java.lang.Math.pow(26.0, len-i-1);
		 }
		 return result;
	 }
	 
	 public static void main(String []args){
		 Solution solution = new Solution();
		 System.out.print(solution.titleToNumber("AA"));
	 }
}
