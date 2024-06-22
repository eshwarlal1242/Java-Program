//Question 8: Write a C++ program to input number of days from user and convert it to years, weeks and
//days.


import java.util.Scanner;
public class Days{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);

int days;
System.out.println("Enter days");
days = obj.nextInt();
int years = days/365;
int weeks = (days-365)/7;
int day = (days-years)%7;
System.out.println(years+"year/s "+weeks+"week/s "+day+"\nday/s");
}
}