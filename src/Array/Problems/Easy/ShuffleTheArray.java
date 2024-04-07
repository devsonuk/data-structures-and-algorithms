package Array.Problems.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/description/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        //logic: run the loop till n/2 and make pair of nums[i], nums[ i+ n]
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            ans[j + 1] = nums[n + i];
            j += 2;
        }

        return ans;
    }
}
