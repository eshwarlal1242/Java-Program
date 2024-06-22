//Question 7: Write a C++ program to input temperature in Centigrade and convert to Fahrenheit. 





import java.util.Scanner;




public class Temp{
public static void main(String args[])
{
Scanner obj  = new Scanner(System.in);

float c ;
System.out.println("Enter temperature in Centigrade");
c = obj.nextFloat();
double f = (c*1.8)+32;

System.out.println("Temperature in Fahrenheit = " + f);
}
}