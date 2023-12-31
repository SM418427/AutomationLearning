package src;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int x= sc.nextInt();
        System.out.println("Enter first number:");
        int y= sc.nextInt();
        System.out.println("Before swapping \nx: "+x+"\ny: "+y);
        swap(x,y);


    }

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping \nx: "+a+"\ny: "+b);




    }
}
