
public class Solution {
	
	public String convert(String s, int nRows) {
		if (nRows == 1)
			return s;
		if (nRows == 0)
			return null;
		
		StringBuffer[] stringBuffer = new StringBuffer[nRows];
		for (int i = 0; i < stringBuffer.length;i++)
			stringBuffer[i] = new StringBuffer();
		boolean increase = false;
		for (int i=0,p=0; p < s.length(); p++){
			stringBuffer[i].append(s.charAt(p));
			if (i == 0 || i == nRows-1)
				increase = !increase;
			if (increase)
				i ++;
			else {
				i --;
			}
		}
		StringBuffer re = new StringBuffer();
		for (int i = 0; i < stringBuffer.length; i++)
			re.append(stringBuffer[i]);
		return re.toString();
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		Solution solution = new Solution();
		solution.convert(s, 3);
	}

}
