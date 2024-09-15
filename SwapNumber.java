//Java Program to swap two variable using temporary variable

public class SwapNumber{
    public static void main(String args[]){
        float first =1.20f, second = 2.45f;

        System.out.println("--Before swap--");

        System.out.println("First Number: "+first);
        System.out.println("Second Number: "+second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First Number: "+first);
        System.out.println("Second Number: "+second);
    }
}