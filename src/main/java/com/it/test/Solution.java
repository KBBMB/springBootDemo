package com.it.test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();  
        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[]{i, map.get(val)};
            }
            map.put(nums[i], i);
        }
		return null;
    }
	
	public static void main(String[] args) {
		int[] arr = {2,7,11,15,6,3,6,6,3,6,8,1};
		int[] twoSum = new Solution().twoSum(arr,9);
		for(int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}
}
