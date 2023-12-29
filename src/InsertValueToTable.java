import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValueToTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ikamers","root","");
            Statement stmt=con.createStatement();

            String query = "INSERT INTO users " + "VALUES (1, 'Jamal', 'crawford', 20)";

            stmt.execute(query);
            System.out.println("Berhasil menginsert!");

            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
}
