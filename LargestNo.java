//Java Program to find largest among the three numbers

import java.util.Scanner;

public class LargestNo{
    
    public static void main(String args[]){
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter 3 Integer: ");
    float n1 = reader.nextFloat();
    float n2 = reader.nextFloat();
    float n3 = reader.nextFloat();

    if(n1>=n2 && n1>=3)
    System.out.println(n1+ " is the largest Number");
    
    else if( n2>=n1 && n2>=n3)
    System.out.println(n2+ "is the largest Number");

    else
    System.out.println(n3+ " is the largest Number");

    }
}