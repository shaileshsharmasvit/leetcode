package leetcode1;

public class addString415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String res=addString("456","77");
	System.out.print(res);
	}

	public static String addString(String num1,String num2){
		  StringBuilder sb = new StringBuilder();
		    int idx1 = num1.length() - 1;
		    int idx2 = num2.length() - 1;
		    int carry = 0;
		    while (idx1 >= 0 || idx2 >= 0) {
		      int temp = carry;
		      if (idx1 >= 0 && idx2 >= 0) {
		        temp += Character.getNumericValue(num1.charAt(idx1--)) + Character.getNumericValue(num2.charAt(idx2--));
		      }
		      else if (idx1 >= 0 && idx2 < 0) {
		        temp += Character.getNumericValue(num1.charAt(idx1--));
		      }
		      else {
		        temp += Character.getNumericValue(num2.charAt(idx2--));
		      }
		      carry = temp > 9 ? 1 : 0;
		      temp = temp > 9 ? temp % 10 : temp;
		      sb.append(temp);
		    }
		    if (carry > 0) {
		      sb.append(carry);
		    }
		    return sb.reverse().toString();
		  
	}
}
//O(m+n)  space complexity is maximum between m and n