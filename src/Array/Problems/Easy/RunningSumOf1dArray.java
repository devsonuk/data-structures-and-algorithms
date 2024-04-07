package Array.Problems.Easy;

import Util.Array;
import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/submissions/1226056672/
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = Array.input(4);
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        //Naive approach, nested loop
        //Better way to see it that we have already calculated the sum till n-1 for nth items
        //So for nth it will be sum till (n-1)th + currentElement
        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i-1] + nums[i];
        }

        return  ans;
    }

}
