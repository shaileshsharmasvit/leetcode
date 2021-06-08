package leetcode1;

import java.util.HashMap;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String res=addString("456","77");
	System.out.print(res);
	}
	
	public static String addString(String num1,String num2){
		

		StringBuilder sb=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
		
		while(i>=0 || j>=0){
			       int temp=carry;
			if(i>=0 && j>=0){
				        temp+=Character.getNumericValue(num1.charAt(i--))+Character.getNumericValue(num2.charAt(j--));
			}
			else if(i>=0 && j<0){
			    	   temp+=Character.getNumericValue(num1.charAt(i--));
			       }
			else {
			     temp+=  Character.getNumericValue(num2.charAt(j--));
		}
		carry=temp>9?1:0;
		temp=temp>9?temp%10:temp;
		sb.append(temp);
			       
		}
		      if(carry>0){
			sb.append(carry);
		}
	System.out.println(sb.toString());
	return sb.reverse().toString();	
	}

}
