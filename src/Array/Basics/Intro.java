package Array.Basics;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        //Syntax
        int[] rnos = new int[5];

        //Syntax 2
        int[] rnos2 = {10, 20, 30, 40, 50};

        int[] rnos3; //declaration of array
        rnos3 = new int[10]; //actually memory creation here

        //Iteration
        for (int i = 0; i < rnos.length; i++) {
            System.out.print(rnos[i] + ", ");
        }
        System.out.println();

        //ForEach
        for (int num: rnos2) {
            System.out.print(num + ", ");
        }
        System.out.println();

        //Arrays.toString
        System.out.println(Arrays.toString(rnos3));
    }
}
