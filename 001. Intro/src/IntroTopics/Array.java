package IntroTopics;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int [10];
        Scanner input = new Scanner(System.in);

//        initialize during declaration
        int [] arr1 = {12, 16, 0, 45};
        int [] arr2 = {5, 5, 7, 8};

        swap(arr1, arr2);

//        System.out.print("Arr1: ");
        for(int i : arr1){
//            System.out.print(i + " ");
        }

        System.out.print("Arr2: ");
        for(int i : arr2){
            System.out.print(i + " ");
        }

        Reverse(arr2);

        System.out.print("Arr2: ");
        for(int i : arr2){
            System.out.print(i + " ");
        }
    }

    public static void swap(int [] arr1, int [] arr2){
//        this will not actually swap these array. Because 1st arr is referencing arr1 and another arr2.
//        after completion of the function these arr1, arr2, temp will be destroyed. So, at the end main array will be reamsin same as before

        int [] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }

    public static void Reverse(int [] arr){
        int l=0, h=arr.length-1;
        while (l<h){
            arr[l] = arr[l] ^ arr[h];
            arr[h] = arr[h] ^ arr[l];
            arr[l] = arr[l] ^ arr[h];
            l++; h--;
        }
    }
}
