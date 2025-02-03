package dataStructures.array.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int [] arr = input(5);
//        print(arr);

        // 2D Array
//        multiDimension();

        // ArrayList
//        arrayList();


        // reverse the array
        int[] arr = input(5);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        if (arr.length <= 1) return;

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void basic(String[] args) {

        // Syntax
        // datatype [] variableName = new datatype[size];
        int[] rollNos = new int[5];

        // or initialize directly
        int[] rnos = {10, 11, 12, 13, 15};

        // access
        int rno1 = rnos[0];

        // update
        rnos[0] = 100;

        //loops
        for (int i = 0; i < rnos.length; i++) {
            System.out.println(rnos[i]);
        }

        // Advance iterator
        for (int rno: rnos) {
            System.out.println(rno);
        }
    }

    public static int[] input(int size) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public  static  void  print(int[] arr) {
        // naive
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // inbuilt method
        System.out.println(Arrays.toString(arr));
    }

    public static void multiDimension(){
        Scanner sc = new Scanner(System.in);

        // Syntax
        /*
        * 1 2 3
        * 4 5 6
        * */

        //datatype[][] variable_name = new datatype[row][col], here row is mandatory, but col is optional
        int[][] arr = new int[2][3];
        int[][] arr2 = {
                {1, 2,3},
                {4, 5, 6}
        };


        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // print
        for (int[] row: arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public  static  void arrayList() {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(2);

        // add item
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        // Print
        System.out.println(list);

        list.set(2, 100);

        list.remove(1);

        System.out.println(list);
    }
}
