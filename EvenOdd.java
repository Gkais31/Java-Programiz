//Java Program to check whether the Number is even or odd

import java.util.Scanner;

public class EvenOdd{
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        if(num%2==0)
        System.out.println(num+ " is even");
        else
        System.out.println(num+ " is odd");
    }
}