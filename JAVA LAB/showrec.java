import java.sql.DriverManager;
import java.sql.*;
import java.io.*;

public class showrec {
public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doners","root",""); 
			Statement stmt = con.createStatement();
			System.out.println("Enter The Blood Groud You Want To Search ");
			DataInputStream dis = new DataInputStream(System.in);
			String bgroup = dis.readLine();
			String s = "select * from doners_details where bloodgroup='"+bgroup+"'";
			ResultSet rs = stmt.executeQuery(s);
			while(rs.next())
			{
				System.out.print(" donerid - " +rs.getInt("donerid"));
				System.out.print(" Name - " +rs.getString(2));
				System.out.print(" bloodgroup - " +rs.getString(3));
				System.out.println();
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}