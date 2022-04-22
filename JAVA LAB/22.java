import java.sql.*;
import java.io.*;
public class 22
{
    public static void main(String arg[])
    {
        int id,phno;
        String nm,add;
        try        {
            DataInputStream din=new DataInputStream(System.in);
            System.out.println("Enter information of Customer.");
            System.out.println("Enter ID of Customer.");
            id=Integer.parseInt(din.readLine());
            System.out.println("Enter Name of Customer.");
            nm=din.readLine();
            System.out.println("Enter Address of Customer.");
            add=din.readLine();
            System.out.println("Enter Contact_No of Customer.");
            phno=Integer.parseInt(din.readLine());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/IICMR","root","");
            PreparedStatement pst=con.prepareStatement("insert into Customervalues values(?,?,?,?)");
            
            pst.setInt(1,id);
            pst.setString(2,nm);
            pst.setString(3,add);
            pst.setInt(4,phno);
            
            int n=pst.executeUpdate();
            if(n>0)
            {
                 System.out.println("Record is Inserted...!!!");
            }
            else            
            {
                System.out.println("Error...!!!");
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}