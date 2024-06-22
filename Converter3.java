import javax.swing.*;
public class Converter3
{
public static void main(String args[])
{
int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount "));
 String note = "";

 note+="5000 = "+amount/5000;
 note+="\n1000 = "+(amount%5000)/1000;
 
 note+="\n500 = "+(((amount%5000)%1000)/500);
 
 note+="\n100 = "+(((amount%5000)%1000)%500)/100;
 
 note+="\n50 = "+(((((amount%5000)%1000)%500)%100)/50);
 
 note+="\n20 = "+(((((amount%5000)%1000)%500)%100)%50)/20;
 
 note+="\n10 = "+((((((amount%5000)%1000)%500)%100)%50)%20)/10;
  note+="\n5 = "+(((((((amount%5000)%1000)%500)%100)%50)%20)&10)/5;
  
   note+="\n2 = "+((((((((amount%5000)%1000)%500)%100)%50)%20)&10)%5)/2;
   
    note+="\n1 = "+(((((((((amount%5000)%1000)%500)%100)%50)%20)&10)%5)%2)/1;
 
 
 JOptionPane.showMessageDialog(null,note);
}
}