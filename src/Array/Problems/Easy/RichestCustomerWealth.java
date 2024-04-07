package Array.Problems.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        //As 1 <= m, n <= 50, can use nested loop
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, totalWealth);
        }

        return maxWealth;
    }
}
