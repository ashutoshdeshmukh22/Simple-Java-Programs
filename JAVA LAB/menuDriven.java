import java.io.DataInputStream;
import java.sql.*;

public class menuDriven {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IICMR", "root", "");
            Statement stmt = con.createStatement();
            int opt;
            do {
                System.out.println("Please Select a option from below : ");
                System.out.println("1. Insert ");
                System.out.println("2. Update ");
                System.out.println("3. Delete ");
                System.out.println("4. Search ");
                System.out.println("5. Display ");
                System.out.println("6. Exit ");
                DataInputStream dis = new DataInputStream(System.in);
                opt = Integer.parseInt(dis.readLine());

                switch (opt) {
                    case 1:
                        System.out.println("You have selected " + opt);
                        System.out.println("Insert Doctor Details : ");
                        System.out.print("Enter Doctor ID :");
                        int drid = Integer.parseInt(dis.readLine());
                        System.out.println("Enter Doctor Name : ");
                        String nm = dis.readLine();
                        System.out.println("Enter Specialization : ");
                        String spec = dis.readLine();
                        String str = "INSERT INTO doctor VALUES (" + drid + ",'" + nm + "','" + spec + "')";
                        int result = stmt.executeUpdate(str);
                        System.out.println("Row Inserted..!!!");
                        break;
                    case 2:
                        System.out.print("Enter the Dr. Id: ");
                        int did = Integer.parseInt(dis.readLine());
                        System.out.print("Enter the Doctor Name : ");
                        nm = dis.readLine();
                        int k = stmt.executeUpdate("update doctor set dr_nm='" + nm + "' where dr_id=" + did);
                        if (k > 0) {
                            System.out.println("Record Updated..!!");
                        } else {
                            System.out.println("Record Not Found : ");
                        }
                        System.out.println("...............................................");
                        break;
                    case 3:
                        System.out.println("Delete : ");
                        String s = "Select * from doctor";
                        ResultSet rs = stmt.executeQuery(s);
                        while (rs.next()) {
                            System.out.println("Doctor ID : " + rs.getInt(1));
                            System.out.println("Doctor Name : " + rs.getString(2));
                            System.out.println("Specialization : " + rs.getString(3));
                            System.out.println("");
                        }

                        System.out.println("Enter the ID of the doctor you want to delete : ");
                        int dl = Integer.parseInt(dis.readLine());
                        String strd = "delete from doctor where dr_id = " + dl + "";
                        int str1 = stmt.executeUpdate(strd);
                        System.out.println("Row Deleted..!!!!");
                        break;
                    case 4:
                        System.out.println("Enter the ID of the doctor you want to search : ");
                        int is = Integer.parseInt(dis.readLine());
                        String sse = "Select * from doctor where dr_id =" + is;
                        ResultSet rs4 = stmt.executeQuery(sse);

                        if (rs4.next()) {
                            System.out.println("Doctor ID : " + rs4.getInt(1));
                            System.out.println("Doctor Name : " + rs4.getString(2));
                            System.out.println("Specialization : " + rs4.getString(3));
                            System.out.println("");
                        }
                        break;
                    case 5:
                        String sd = "Select * from doctor";
                        ResultSet rs1 = stmt.executeQuery(sd);
                        while (rs1.next()) {
                            System.out.println("Doctor ID : " + rs1.getInt(1));
                            System.out.println("Doctor Name : " + rs1.getString(2));
                            System.out.println("Specialization : " + rs1.getString(3));
                            System.out.println("");
                        }
                    case 6:
                        break;
                }
            } while (opt != 6);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }

}