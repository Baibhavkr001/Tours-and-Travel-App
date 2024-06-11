package travel.management.system;

import java.sql.*;

public class connect {
    
    Connection c;
    Statement s;
    connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystems","root","choudhary");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
