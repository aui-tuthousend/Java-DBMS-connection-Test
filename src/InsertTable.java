import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ikamers","root","");
            Statement stmt=con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "username VARCHAR(25),"
                    + "password VARCHAR(25),"
                    + "saldo INT"
                    + ")";

            stmt.execute(createTable);
            System.out.println("Berhasil membuat table baru!");

            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
}
