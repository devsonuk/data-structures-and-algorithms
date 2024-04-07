package Util;

import java.util.Scanner;

public class Array {
    public static int[] input(int size) {
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
