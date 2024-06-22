import java.util.Scanner;
public class Arthimatic{
public static void main(String args[]){

Scanner obj = new Scanner(System.in);

int a;
System.out.println("Enter first value");
a=obj.nextInt();
int b;
System.out.println("Enter Second value");
b=obj.nextInt();
int sum = a+b;
int substract = a-b;
int multi = a*b;
double div = a/b;
int mod = a%b;

System.out.println("sum of two number is = "+sum);
System.out.println("Substraction of two number is = "+substract);
System.out.println("Multiplication of two number is = "+multi);
System.out.println("Division of two number is = "+div);
System.out.println("Module of two number is = "+mod);
}
}