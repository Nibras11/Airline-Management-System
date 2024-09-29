package airlinemanagement;

import java.sql.*;

public class Connect 
{
    Connection c;
    Statement s;
    public Connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  //registering the driver
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem","root","nibras2#0");
            s=c.createStatement();
        } catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
}