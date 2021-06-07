package leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class threesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,0,1,2,-1,-4};
		List<List<Integer>> l1= threeSum(a);
		Iterator i=l1.iterator();
		while(i.hasNext()){
			System.out.println("List is "+i.next());
		}
		

	}		
		        public static  List<List<Integer>> threeSum(int[] nums) {
		            if (nums.length < 3) return new ArrayList<>(); // if nums less than 3 element
		            Arrays.sort(nums); // sort array
		            Set<List<Integer>> set = new HashSet<>();
		            for (int i = 0; i < nums.length - 2; i++) {
		                int j = i + 1;
		                int k = nums.length - 1;
		                while (j < k) {
		                    int sum = nums[i] + nums[j] + nums[k];
		                    if (sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
		                    else if (sum > 0) k--;
		                    else if (sum < 0) j++;
		                }

		            }

		            return new ArrayList<>(set);
		        }
		
}
