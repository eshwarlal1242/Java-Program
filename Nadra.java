

package com.mycompany.nadra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Nadra{

    public static void main(String[] args) {

        

        String databaseURL = "jdbc:ucanaccess://D://Nadra.accdb//";
       

        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            
            String query = "SELECT * FROM NADRA ";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            
            while(rs.next()){
                
                //System.out.println(rs.getInt("Name"));
            
            System.out.print(rs.getString("Name")+" ");
            System.out.print(rs.getString("FatherName")+" ");
            System.out.print(rs.getString("CNIC"));
            System.out.print(rs.getString("DateOfBirth")+" ");
            
            System.out.print(rs.getString("phoneNumber")+" ");
            System.out.println(rs.getString("Address")+" ");
            }
        }
            catch (SQLException ex) {

            ex.printStackTrace();

}
            
            
            
        }
    }

    /*                
Scanner obj = new Scanner(System.in);
            String sql = "INSERT INTO Nadra (Name, FatherName, CNIC, DateOfBirth,phoneNumber,Address) VALUES (?, ?, ?, ?, ?, ?)";

            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            System.out.println("Enter Your Name");
            
            String name = obj.nextLine();
            
            
            System.out.println("Enter your  Father Name");
            
            String fName = obj.nextLine();
            
            System.out.println("Enter your CNIC Number");
            
            String cnic = obj.nextLine();
            
            System.out.println("Enter Your Date of Birth");
            
            
            
            String dateOfBirth = obj.nextLine();
             System.out.println("Enter Your Phone Number");
             
             String num = obj.nextLine();
             
              System.out.println("Enter Your Address");
            
              String address = obj.nextLine();
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, fName);            
            preparedStatement.setString(3, cnic);          
            preparedStatement.setString(4, dateOfBirth);
            preparedStatement.setString(5,num);
            preparedStatement.setString(6, address);
        

            int row = preparedStatement.executeUpdate();
            
            if (row > 0) {
                System.out.println("A row has been inserted successfully.");

            }           

        } catch (SQLException ex) {

            ex.printStackTrace();

}
}
}
*/
    