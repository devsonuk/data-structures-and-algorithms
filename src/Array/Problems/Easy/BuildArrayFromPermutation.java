package Array.Problems.Easy;

import Util.Array;

import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/description/
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = Array.input(6);
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
