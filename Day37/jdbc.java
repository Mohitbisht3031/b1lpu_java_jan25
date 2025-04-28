package Day37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
public static void main(String[] args) {
    // class.forName(); to load the driver class required for the prog. this is optional for moreden java apps
    try{
    // Using this we will be making the connection
    Connection con = DriverManager.getConnection("URL of DB server", "username", "password");

    // prepareStatement basic variation
    PreparedStatement ps = con.prepareStatement("SQL query");
    // execute the query and store the result of the query
    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
        System.out.println(rs.getInt("id")+" , "+rs.getString("name"));
    }
    }catch(SQLException ex){
        System.err.println(ex);
    }finally{
        rs.close();
        ps.close();
        con.close();
    }

    // another variation of prep statement
    try{
        // open a connection
        // here
        // another variation of prepare statement
        PreparedStatement stmt = con.prepareStatement("select * from students where id = ?");
        stmt.setInt(1, 5);
        ResultSet rs = stmt.executeQuery();

        // to roll back the commit
        // con.rollback();
    }catch(){

    }finally{

    }

    // batch processing
    try{
        // open a connection
        // here
        // another variation of prepare statement to execute multiple statements all at once
        PreparedStatement stmt = con.prepareStatement("select * from students where id = ?");
        stmt.setInt(1, 5);
        stmt.addBatch();

        stmt.setInt(1,10);
        stmt.addBatch();

        stmt.executeBatch();
    }catch(){

    }finally{

    }

}
}
