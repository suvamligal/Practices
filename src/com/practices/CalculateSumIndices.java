package com.practices;

import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
public class CalculateSumIndices {

	
	    public static int[] twoSum(int[] nums, int target) {
	    	
	        // Create a hash map to store elements and their indices
	        HashMap<Integer, Integer> map = new HashMap<>();

	        // Iterate through the array
	        for (int i = 0; i < nums.length; i++) {
	            int result = target - nums[i];

	            // Check if the complement is already in the map
	            if (map.containsKey(result)) {
	                // Return the indices of the two numbers
	                return new int[]{map.get(result), i};
	            }

	            // Put the current number and its index into the map
	            map.put(nums[i], i);
	        }

	        // If no solution is found, return an empty array
	        return new int[]{};
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 3,  5, 6, 7, 11, 15};
	        int target = 9;

	        int[] finalResult = twoSum(nums, target);

	        // Print the result
	        System.out.println("Indices of the two numbers: [" + finalResult[0] + ", " + finalResult[1] + "]");
	    }
	
}


