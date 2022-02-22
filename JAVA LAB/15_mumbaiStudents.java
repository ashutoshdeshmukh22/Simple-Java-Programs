
import java.util.*;

class mumbaiStudents {
    String name, city;
    int roll;

    void setStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = in.next();
        System.out.print("Enter City : ");
        city = in.next();
        System.out.print("Enter roll : ");
        roll = in.nextInt();
        System.out.print("");
    }

    public static void main(String args[]) {
        String mCity = "mumbai";
        String cCity = "Mumbai";
        mumbaiStudents obj[] = new mumbaiStudents[2];
        for (int i = 0; i < 2; i++) {
            obj[i] = new mumbaiStudents();
            obj[i].setStudent();
        }
        for (int i = 0; i < 2; i++) {

            if (obj[i].city.equals(mCity) || obj[i].city.equals(cCity)) {
                System.out.println("Roll no = " + obj[i].roll + " Name = " + obj[i].name + " City = " + obj[i].city);
            } else {
                System.out.println("No Student is From Mumbai");
                break;
            }
        }
    }
}