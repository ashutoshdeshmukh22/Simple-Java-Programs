import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class 23 {

	public static void main(String[] args) throws Exception {
		DataInputStream dis= new DataInputStream(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
		Statement smt = con.createStatement();
		
		System.out.println("Enter the name of the book you want to search : ");
		String nm = dis.readLine();
		
		String s="select * from book where bk_nm = '"+nm+"'";
		ResultSet rs = smt.executeQuery(s);
		
		if(rs.next()==true)
		{
			System.out.println("Do you want to delete the book record : ");
			String ans=dis.readLine();
			if(ans.equals("yes"))
			{
			String s1="DELETE FROM `book` WHERE `bk_nm`='I too had a Love Story'";
			int i= smt.executeUpdate(s1);
			if(i>0)
			{
				System.out.println(i+" Record Deleted. ");
			}
			}

		}
	}

}