package leetcode1;

public class AddDigits258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=38;
int result=addDigits(num);
System.out.println(result);
		
		
	}
	
	public static int 	 addDigits(int num) {
		while(String.valueOf(num).length()>1){
			num =getDigitSum(num);
		}
	return num;
	}
	
	private static int getDigitSum(int num){
		int newNum=0;
		while(num>0){
			newNum+=num%10;
			num/=10;
		}
		return newNum;
	}
}
