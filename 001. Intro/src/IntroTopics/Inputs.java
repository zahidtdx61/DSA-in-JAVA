package IntroTopics;

import java.util.Scanner;

public class Inputs {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int i = input.nextInt();
        System.out.println("took: " + i);

        String s = input.next();
        System.out.println("got: " + s);
    }

}
