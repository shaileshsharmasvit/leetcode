package leetcode1;

import java.util.HashMap;


	
	
	public class twoSum {

		public static void main(String[] a){
			int nums[]={2, 7, 11, 15};
			int target=18;
			int ar[]=twoSum(nums,target);
			System.out.println(ar[0]+"      "+ar[1]);
			
		}
		
		public static int[] twoSum(int[] nums, int target) {
	    	int[] rst = new int[2];
	        if (nums == null || nums.length <= 1)  {
	        	return rst;
	        }
	        HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
	        for (int i = 0; i < nums.length; i++) {
	        	int remaining = target - nums[i];
	        	if (!map.containsKey(remaining)) {
	        		map.put(nums[i], i);
	        	} else {
	        		rst[0] = map.get(remaining) + 1;
	        		rst[1] = i + 1;
	        		break;
	        	}
	        }
	        return rst;
	    }
	}
	
	

