//Question 5: Write a C++ program to input length in centimeter and convert it to meter and kilometer.




import java.util.Scanner;

public class Converter1{
public static void main(String args [])
{
Scanner obj = new Scanner(System.in);

double centi;
System.out.println("Enter Lengthin Centimeter:");
centi = obj.nextDouble();
double meter = centi/10;

double kilometer = centi/10000;

System.out.println("Length in Meter is = " +meter+"m");

System.out.println("Length in Meter is = " +kilometer+"km");
}
}