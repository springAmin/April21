package com.homework.week1.project;

import java.util.ArrayList;


public class Recursion {

    /**
     * Determines whether target value can be reached after grouping
     * consecutive integers
     * @param start - Requires that calls begin with 0
     * @param nums - ArrayList of Ints
     * @param target - Target value
     * @return boolean
     */
    public static boolean groupSumClump(int start, ArrayList<Integer> nums, int target) {

        if (target == 0) return true;
        if (start == nums.size()) return false;

        // One For Loop to Consolidate
        if (start == 0) {
            ArrayList<Integer> minNums = new ArrayList<>();
            minNums.add(nums.get(0));
            for(int i = 1, j = 0; i < nums.size(); i++) {
                if (nums.get(i-1) == nums.get(i)){
                    minNums.set(j, minNums.get(j) + nums.get(i));
                } else {
                    minNums.add(nums.get(i));
                    j++;
                }
            }
            return (groupSumClump(start + 1, minNums, target - minNums.get(start)) ||
                    groupSumClump(start + 1, minNums, target));
        }
        return (groupSumClump(start + 1, nums, target - nums.get(start)) ||
                    groupSumClump(start + 1, nums, target));
    }
}
