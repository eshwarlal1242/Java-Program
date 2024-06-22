//Question 9: Write a C++ Program to input two angles from user and find third angle of the triangle. 
import java.util.Scanner;
public class Angle
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int a1,a2;
System.out.println("Enter one Angle");

a1 = obj.nextInt();

System.out.println("Enter second Angle");
a2 = obj.nextInt();

int a3 = 180-(a1+a2);

System.out.println("third angle of Triangle is  = "+a3);
}
}