package leetcode1;

import java.util.HashMap;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]={2, 7, 11, 15};
		int target=18;
		int ar[]=twoSum(nums,target);
		System.out.println(ar[0]+"      "+ar[1]);
	}
	
	public static  int[] twoSum(int nums[],int target)  {
		int rst[]=new int[2] ;
				if(nums==null || nums.length<=1){
					return rst;
				}
	
				HashMap<Integer,Integer> hm=new HashMap<Integer ,Integer>();
				for(int i=0;i<nums.length;i++){
					int remaining=target-nums[i];
				if(!hm.containsKey(remaining))
				{
					hm.put(nums[i],i);
				}
				else {
					rst[0]=hm.get(remaining)+1;
					rst[1]=i+1;
					break;
					
				}
				}
				
	return rst;
	}

}
