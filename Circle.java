//Question 4: Write a C++ program to input radius of a circle from user and find diameter, circumference and
//area of the circle


import java.util.Scanner;
public class Circle{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
double radius;
System.out.println("Enter Radius");
radius = obj.nextDouble();

double diameter = 2*radius;

double circumference = 2*3.14*radius;

double area = 3.14*radius*radius;

System.out.println("Diameter of Circle is = "+diameter);
System.out.println("Circumference of Circle is = "+circumference);
System.out.println("Area of Circle is = "+area);
}
}
