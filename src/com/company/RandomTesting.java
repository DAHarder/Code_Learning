package com.company;

import java.util.*;

public class RandomTesting {


//Brute force
//    int[] indices = {0,0};
//    for (int i = 0; i < nums.length; i++) {
//        for (int j = i+1; j < nums.length; j++) {
//            if (nums[i] + nums[j] == target) {
//                indices[0] = i;
//                indices[1] = j;
//                return indices;
//            }
//
//        }
//    }
//    throw new IllegalArgumentException("No two sum solution");

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainder = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (remainder.containsKey(nums[i])){
                return new int[] {remainder.get(nums[i]), i};
            }
            remainder.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            String s = String.valueOf(n);
            System.out.println(s.length());
                if(s.length() % 2 == 0)
                    count = count + 1;
        }
        return count;
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}

