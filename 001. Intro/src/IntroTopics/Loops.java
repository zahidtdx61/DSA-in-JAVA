package IntroTopics;

import  java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for loop
        for(int i=0; i<100; i++){
            System.out.println("Hello " + i);
        }

//        while loop
        int i = 0;
        while (i <100){
            System.out.println("Hello " + i);
            i++;
        }


//        print all digit one by one
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = input.nextInt();
        while (num > 0){
            System.out.println(num%10);
            num /= 10;
        }


//        do - while loop
        int n = 5;
        do{
            System.out.println("You are stupid");
            n--;
        }while (n > 0);
    }
}
