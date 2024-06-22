//Question 10: Write a C++ program to input base and height of a triangle and find area of the given triangle. 

import java.util.Scanner;

public class Triangle{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);

int base,height;
System.out.println("Enter base of Triangle");
base = obj.nextInt();
System.out.println("Enter Height of Triangle");
height = obj.nextInt();

float area = (base*height)/2;

System.out.println("Area of Triangle is = "+area);
}
}