import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class data {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");

            Statement smt = con.createStatement();
            smt.executeUpdate("create table emplo(eno int,ename varchar(12),esal int)");
            System.out.println("table created successfully....");
            con.close();
        }
        catch (Exception e)

        {
            System.out.println(e);
        }

    }
}
