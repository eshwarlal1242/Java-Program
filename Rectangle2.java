//Question 3: Write a C++ program to input length and width of a rectangle and find area of the given rectangle

import java.util.Scanner;
public class Rectangle2{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);


int length ,width;
System.out.println("Enter length");
length = obj.nextInt();
System.out.println("Enter width");
width = obj.nextInt();
int area = width*length;

System.out.println("Area of Rectangle is = "+area);
}
}