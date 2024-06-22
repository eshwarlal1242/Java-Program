//Question 2: Write a C++ program to input length and width of a rectangle and calculate perimeter of the
//rectangle. 


import java.util.Scanner;
public class Rectangle{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);


int length ,width;
System.out.println("Enter length");
length = obj.nextInt();
System.out.println("Enter width");
width = obj.nextInt();
int perimeter = 2*(width+length);

System.out.println("Perimeter of Rectangle is = "+perimeter);
}
}
