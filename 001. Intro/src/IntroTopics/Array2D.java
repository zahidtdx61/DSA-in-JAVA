package IntroTopics;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
