import java.sql.*;
import java.util.Scanner;

public class Read_Record {

    public static void readLoan() throws Exception {
        String url = "jdbc:mysql://localhost:3306/loan";
        String uname = "root";
        String pword = "admin@123";
        String query = "Select*from loan_details";
        Connection con = DriverManager.getConnection(url, uname, pword);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {

            System.out.println("**********************************");
            System.out.println("* ID          : " + rs.getInt(1));
            System.out.println("* Name        : " + rs.getString(2));
            System.out.println("* Phone Number: " + rs.getString(3));
            System.out.println("* Address     : " + rs.getString(4));
            System.out.println("* Amount      : " + rs.getFloat(5));
            System.out.println("* Date        : " + rs.getDate(6));
            System.out.println("* Interest    : " + rs.getFloat(7));


        }
        con.close();
        System.out.println("**********************************");


    }

    public static void readInterest() throws Exception {
        String url = "jdbc:mysql://localhost:3306/loan";
        String uname = "root";
        String pword = "admin@123";
        String query = "SELECT * FROM loan.interest_details;";
        Connection con = DriverManager.getConnection(url, uname, pword);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println("******************************");
            System.out.println("** ID: " + rs.getInt(1));
            System.out.println("** Interest Amount: " + rs.getFloat(2));
            System.out.println("** Date of Pay(YYYY-MM-DD): " + rs.getString(3));

        }
        con.close();
        System.out.println("******************************");

    }
    public void readMenu() throws Exception{
        Read_Record rr=new Read_Record();
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("*************** OPTIONS ***************");
        System.out.println("** 1 - To See Creditors Details      **");
        System.out.println("** 2 - To See Interest Details       **");
        System.out.println("** 3 - To See Loan Details Again     **");
        System.out.println("** 4 - Exit                          **");
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Enter Your Choice: ");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                rr.readLoan();
                break;
            case 2:
                rr.readInterest();
                break;
            case 3:
                 rr.readMenu();
                break;
            case 4:
                break;

        }

    }

}
