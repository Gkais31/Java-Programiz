//Java Program to check whether Number is Positive or Negative

public class PositiveNegative{
    public static void main(String[] args){

        double number =12.3;

        if(number<0.0)
            System.out.println(number+" is a negative number");

        else if(number > 0.0)
            System.out.println(number+ " is a postive number");
        
        else
            System.out.println(number+ "is 0");
    }
}