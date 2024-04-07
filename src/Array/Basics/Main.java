package Array.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // introduction();
        // int[] list = input(5);
        // print(list);
        // System.out.println(findMax(list));
        // System.out.println(findMax(list, 2, 5));
        // reverse(list);
        // System.out.println(Arrays.toString(list));

        //2D Array
        //introduction2D();

        //Dynamic Array
        dynamicArray();
    }

    //Dynamic Array
    private static void dynamicArray() {
        //Here we don't need to provide size, it will be auto adjusted at run time
        //Always use wrapper class for type
        ArrayList<Integer> dynamicList = new ArrayList<>();

        //Input
        Scanner sc = new Scanner(System.in);
        int requiredSize = 5;
        for (int i = 0; i < requiredSize; i++) {
            dynamicList.add(sc.nextInt());
        }

        //Output
        for (int i = 0; i < dynamicList.size(); i++) {
            System.out.print(dynamicList.get(i) + ", ");
        }
        System.out.println();
    }

    //2D Array
    private static void introduction2D() {
        //Syntax
        //dataType[][][]...[d times] name = new dataTypes[][][]...[d times] where d is dimension
        //2D
        int[][] list2D = new int[2][3]; //here size for col is optional

        Scanner sc = new Scanner(System.in);
        //input
        //simply loop like single dimension
        for (int i = 0; i < list2D.length; i++) {
            for (int j = 0; j < list2D[i].length; j++) {
                list2D[i][j] = sc.nextInt();
            }
        }

        //print
        //Simply loop
        for (int i = 0; i < list2D.length; i++) {
            for (int j = 0; j < list2D[i].length; j++) {
                System.out.print(list2D[i][j] + ", ");
            }
            System.out.println();
        }

        //Method 2
        for (int[] list : list2D) {
            System.out.println(Arrays.toString(list));
        }
    }

    //Single Dimension
    private static void reverse(int[] list) {
        //Simply swap the ith element with (n-i)th for n/2 times
        int n = list.length;
        for (int i = 0; i < n / 2; i++) {
            //Swap
            int temp = list[i];
            list[i] = list[n - i - 1];
            list[n - i - 1] = temp;
        }
    }

    private static int findMax(int[] list, int start, int end) {
        //Edges cases
        if (list == null) return -1;
        if (start < 0 || end > list.length) return -1;

        int max = list[start];

        for (int i = start + 1; i < end; i++) {
            max = Math.max(max, list[i]);
        }

        return max;
    }

    private static int findMax(int[] list) {
        int max = list[0]; //Assume first number is the max number
        for (int i = 1; i < list.length; i++) {
            max = Math.max(max, list[i]);
        }
        return max;
    }

    private static void print(int[] list) {
        //Method 1: Loop
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();

        //Method 2:
        System.out.println(Arrays.toString(list));
    }

    private static void introduction() {
        //Syntax
        // dataType[] name = new dataType[size]
        // dataType[] name = {value1, value2, value3}
        int[] rnos = new int[5];
        int[] rnos2 = {1, 2, 3, 4, 5};

        //Iterator
        //Simple loop
        for (int i = 0; i < rnos2.length; i++) {
            System.out.print(rnos2[i]);
        }
        System.out.println();

        //Advance for loop
        for (int rno : rnos) {
            System.out.print(rno + ", ");
        }

        System.out.println();
    }

    private static int[] input(int size) {
        //input
        Scanner sc = new Scanner(System.in);
        int[] list = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        return list;
    }
}
