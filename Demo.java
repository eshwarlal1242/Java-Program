import javax.swing.*;




public class Demo{

public static void main(String args[])
{
//System.out.println("Hello Everyone I am Eshwar Lal");
//System.out.println("Hello Sinddh University M.A English Deparment");
//JOptionPane.showMessageDialog(null,"Hello Dear");

String name = JOptionPane.showInputDialog("Enter your name");
String fname = JOptionPane.showInputDialog("Enter your father name");
String cast = JOptionPane.showInputDialog("Enter your cast");
Double cms = JOptionPane.showInputDialog("Enter your CMD ID");
String Deparment = JOptionPane.showInputDialog("Enter you Deparment");

JOptionPane.showMessageDialog(null,"My name" +name+"\n Father name"+fname+"My cast is "+cast+"My Cms Id is"+cms+"My deparment is deparment");
//JOptionPane.showMessageDialog(null,"Father name" +fname);

}}