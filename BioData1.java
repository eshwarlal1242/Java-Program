import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class BioData1{

public static void main(String String[])
{

Scanner obj = new Scanner(System.in);
try {
System.out.println("Enter your Name");

String name = obj.nextLine();

System.out.println("Enter your Father Name");

String fName = obj.nextLine();

System.out.println("Enter Your Surname");

String sName = obj.nextLine();

System.out.println("Enter your CNIC Number");

String cnic = obj.nextLine();

System.out.println("Enter your date of birth");

String dOB = obj.nextLine();

System.out.println("Enter your Phone number");

String number = obj.nextLine();

System.out.println("Enter your Address");

String address = obj.nextLine();


 FileWriter myWriter1 = new FileWriter(cnic+".txt");
 
 
 File obj12 = new File(cnic+".txt");
 
// Scanner MyReadert = new Scanner(obj12);

String store ="";

store="Father name"+name+"Father name"+fName+"Surname "+sName+"Date of Birth " +dOB+"Phone Number  " +number+"Address" +address;
store = store + myWriter1.write(("Father name"+name+"Father name"+fName+"Surname "+sName+"Date of Birth " +dOB+"Phone Number  " +number+"Address" +address));
 //store="Father name"+name+"Father name"+fName+"Surname "+sName+"Date of Birth " +dOB+"Phone Number  " +number+"Address" +address+(MyReadert.nextLine();




//myWriter1.write("Father Name  " +fName);

//myWriter1.write("SurName  " +sName);

//myWriter1.write("nCNIC " +cnic);

//myWriter1.write("Date of Birth " +dOB);

//myWriter1.write("Phone Number  " +number);

//myWriter1.write("Address  " +address);


myWriter1.close();

System.out.println("Successfully wrote to the file.");
}

catch(Exception e)
{
}

}
}
