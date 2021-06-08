package leetcode1;

public class thirdMaximum414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                    int []nums = {3,2,1};
		                    int result=thirdMax(nums);
		                    System.out.print(result);
		                    
		
	}

	 public static  int thirdMax(int[] nums) {
		               Integer max=null; 
		               Integer second=null;
		               Integer third=null;

		               
		               for(Integer num:nums){
		            	
		            	   if(num.equals(max)|| num.equals(second)|| num.equals(third))
		            	   {
		            		   continue;
		            	   }
		            	   
		            	   if(max==null || num>max){
		            		   third=second;
		            		   second=max;
		            		   max=num;
		            	   }
		            	   else   if(second==null || num>second){
		            		   third=second;
		            		   second=num;
		            	   }
		            	   else if(third==null || num>third){
		            		   third=num;
		            	   }
		            	   
		               }
if(third==null){
	return max;
}
		               return third;
	    }
	
}
