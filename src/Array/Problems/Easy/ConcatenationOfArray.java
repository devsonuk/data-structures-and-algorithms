package Array.Problems.Easy;

import Util.Array;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/submissions/1226049498/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = Array.input(4);
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;

        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[(i + n) % n];
        }

        return ans;
    }
}
