*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;


/**
 *
 * @author Lab PC-15
 */
public class Update {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
       
          try{
             
             
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   
    Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D:\\BioData.accdb");
   
    System.out.println("Connectionn Successfully");
   
   PreparedStatement preparedStatement = connection.prepareStatement("delete from BioData where Name=?");
   
   preparedStatement.setString(1,"Moti");
   preparedStatement.executeUpdate();
   
   
   
  //  PreparedStatement preparedStatement = connection.prepareStatement("update BioData set Name=? where Surname=?");
   //        preparedStatement.setString(1,"Eshwar");
    //       preparedStatement.setString(2,"Ratnani" );
   //        preparedStatement.executeUpdate();
           
           System.out.println("Delete updated successfully");
                   
           
           
           
    }
   
    catch(Exception e)
    {
        System.out.println("Error in connection");
}

}
    }


