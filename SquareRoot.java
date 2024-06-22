//Question 6: Write a C++ program to input a number and find square root of the given number.



import java.util.Scanner;

public class SquareRoot{
public static void main(String args[])
{

Scanner obj = new Scanner(System.in);
System.out.println("Enter value");
double value = obj.nextDouble();
double root = Math.sqrt(value);



System.out.println("Square root is =" +root);
}
}
