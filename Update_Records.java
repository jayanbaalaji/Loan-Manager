import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Update_Records {
    public static void addToLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        int id;
        String name,ph,Address,dt;
        Float amt,it;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter The New Creditor Id : ");
            String ids = reader.readLine();
            id = Integer.parseInt(ids);
            System.out.println("Enter The New Creditor Name: ");
            name = reader.readLine();
            System.out.println("Enter The new creditor Phone number: ");
            ph = reader.readLine();
            System.out.println("Enter The New Creditor Address: ");
            Address = reader.readLine();
            System.out.println("Enter The Date Of Credit (YYYY-MM-DD): ");
            dt = reader.readLine();
            System.out.println("Enter The Amount: ");
            String amts = reader.readLine();
            amt = Float.parseFloat(amts);
            System.out.println("Enter The Interest:  ");
            String its = reader.readLine();
            it = Float.parseFloat(its);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = sdf.parse(dt);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            String query = "Insert into loan_details values(?,?,?,?,?,?,?);";
            Connection con = DriverManager.getConnection(url, uname, pword);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, ph);
            pst.setString(4, Address);
            pst.setFloat(5, amt);
            pst.setString(6, dt);
            pst.setFloat(7, it);

            int row = pst.executeUpdate();
            if(row>0){
            System.out.println("Successfully Added....!");
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void truncateLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String query="TRUNCATE TABLE LOAN_DETAILS;";
        Connection con=DriverManager.getConnection(url,uname,pword);
        Statement st= con.createStatement();
        st.execute(query);
        con.close();

    }
    public static void deleteFromLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String query="DELETE FROM LOAN.LOAN_DETAILS WHERE LOAN_ID=?";
        int ID;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id To Delete: ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Deleted......!");
        }
        con.close();

    }
    public static void updateNameInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Creditor_Name=? WHERE LOAN_ID=?";

        int ID;
        String nam;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Name of Creditor: ");
        nam=reader.readLine();
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setString(1,nam);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Updated......!");
        }
        con.close();


    }
    public static void updatePhInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Phone=? WHERE LOAN_ID=?";

        int ID;
        String nam;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Phone Number of Creditor: ");
        nam=reader.readLine();
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setString(1,nam);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Updated......!");
        }
        con.close();


    }
    public static void updateAmountInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Amount=? WHERE LOAN_ID=?";

        int ID;
        Float amt;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Principle Amount issued to Creditor: ");
        String mts=reader.readLine();
        amt=Float.parseFloat(mts);
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setFloat(1,amt);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Updated......!");
        }

        con.close();


    }
    public static void updateAddressInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Address=? WHERE LOAN_ID=?";

        int ID;
        String nam;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Address of Creditor: ");
        nam=reader.readLine();
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setString(1,nam);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Updated......!");
        }
        con.close();


    }
    public static void updateDateInLoan() throws Exception{

        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Date_Of_Credit=? WHERE LOAN_ID=?";

        int ID;
        String dt;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Date of Issue to Creditor (YYYY-MM-DD): ");
        dt=reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = sdf.parse(dt);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setString(1,dt);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("Successfully Updated As "+ dt);
        }
        con.close();


    }
    public static void updateInterestInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.LOAN_DETAILS SET Interest_Amount=? WHERE LOAN_ID=?";

        int ID;
        Float it;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Interest Amount of Creditor: ");
        String mts=reader.readLine();
        it=Float.parseFloat(mts);
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setFloat(1,it);
        pst.setInt(2,ID);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Updated......!");
        }

        con.close();


    }
    public static void updateAllInLoan() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        int id;
        String name,ph,Address,dt;
        Float amt,it;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter The Loan Id : ");
            String ids = reader.readLine();
            id = Integer.parseInt(ids);

            System.out.println("Enter The Creditor Name: ");
            name = reader.readLine();
            System.out.println("Enter The  Creditor Phone number: ");
            ph = reader.readLine();
            System.out.println("Enter The  Creditor Address: ");
            Address = reader.readLine();
            System.out.println("Enter The Date Of Credit (YYYY-MM-DD): ");
            dt = reader.readLine();
            System.out.println("Enter The Amount: ");
            String amts = reader.readLine();
            amt = Float.parseFloat(amts);
            System.out.println("Enter The Interest:  ");
            String its = reader.readLine();
            it = Float.parseFloat(its);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = sdf.parse(dt);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            String query = "UPDATE LOAN.LOAN_DETAILS SET Creditor_Name=?,Phone=?,Address=?,Amount=?,Date_Of_Credit=?,Interest_Amount=? WHERE LOAN_ID=?;";
            Connection con = DriverManager.getConnection(url, uname, pword);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(7, id);
            pst.setString(1, name);
            pst.setString(2, ph);
            pst.setString(3, Address);
            pst.setFloat(4, amt);
            pst.setString(5, dt);
            pst.setFloat(6, it);

            int row = pst.executeUpdate();
            if(row>0){
                System.out.println("Successfully Updated....!");
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public  static void menuOption() throws Exception{
        Scanner sc=new Scanner(System.in);
        Update_Records ur=new Update_Records();
        int choice;
        System.out.println("** ************************* OPTIONS ***************************** **");
        System.out.println("** ******* 0 - To Add details of New Creditor.             ******* **");
        System.out.println("** ******* 1 - Delete Entire details of Creditor.          ******* **");
        System.out.println("** ******* 2 - To Change The Name of Creditor.             ******* **");
        System.out.println("** ******* 3 - To Change The Phone Number of Creditor.     ******* **");
        System.out.println("** ******* 4 - To Change The Address of Creditor.          ******* **");
        System.out.println("** ******* 5 - To Change The Principle Amount of Creditor. ******* **");
        System.out.println("** ******* 6 - To Change The Date of Issue to Creditor.    ******* **");
        System.out.println("** ******* 7 - To Change The Interest of Creditor.         ******* **");
        System.out.println("** ******* 8 - To Change The Entire records of Creditor.   ******* **");
        System.out.println("** ******* 9 - To Exit                                     ******* **");
        System.out.println("** ************************* OPTIONS ***************************** **");
        System.out.println();
        System.out.println("Enter Your Choice:  ");
        choice= sc.nextInt();



              switch (choice) {

                  case 0:
                      ur.addToLoan();
                      break;
                  case 1:
                      ur.deleteFromLoan();
                      break;

                  case 2:
                      ur.updateNameInLoan();
                      break;
                  case 3:
                      ur.updatePhInLoan();
                      break;
                  case 4:
                      ur.updateAddressInLoan();
                      break;
                  case 5:
                      ur.updateAmountInLoan();
                      break;
                  case 6:
                      ur.updateDateInLoan();
                      break;
                  case 7:
                      ur.updateInterestInLoan();
                      break;
                  case 8:
                      ur.updateAllInLoan();
                      break;
                  case 9:
                      break;

                  default:
                      System.out.println("Invalid Input");


              }


          sc.close();


    }

    public static void addInterestInInterest() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="INSERT INTO LOAN.INTEREST_DETAILS(Loan_ID,Interest_Amount,Date_of_pay) VALUES (?,?,?);";
        int ID;

        Float it;
        String dt;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Interest Amount Paid By Creditor: ");
        String mts=reader.readLine();
        it=Float.parseFloat(mts);
        System.out.println("Enter the Date of Pay(YYYY-MM-DD): ");
        dt=reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = sdf.parse(dt);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setInt(1,ID);
        pst.setFloat(2,it);
        pst.setString(3,dt);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Added......!");
        }

        con.close();


    }
    public static void updateInterestAmountInInterest() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.INTEREST_DETAILS SET INTEREST_AMOUNT=? WHERE LOAN_ID=?;";
        int ID;

        Float it;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Interest Amount to Update: ");
        String mts=reader.readLine();
        it=Float.parseFloat(mts);
        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setInt(2,ID);
        pst.setFloat(1,it);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Interest Amount Updated......!");
        }

        con.close();


    }

    public static void updateInterestDateInInterest() throws Exception{
        String url="jdbc:mysql://localhost:3306/loan";
        String uname="root";
        String pword="admin@123";
        String q1="UPDATE LOAN.INTEREST_DETAILS SET DATE_OF_PAY=? WHERE LOAN_ID=?;";
        int ID;
        String dt;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Loan Id : ");
        String ids=reader.readLine();
        ID=Integer.parseInt(ids);
        System.out.println("Enter the Date Of Pay(YYYY-MM-DD) to Update: ");
        dt=reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = sdf.parse(dt);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        Connection con=DriverManager.getConnection(url,uname,pword);
        PreparedStatement pst=con.prepareStatement(q1);
        pst.setInt(2,ID);
        pst.setString(1,dt);
        int row=pst.executeUpdate();
        if(row>0) {
            System.out.println("SuccessFully Date Updated......!");
        }

        con.close();


    }

    public static void updateInterestMenu() throws Exception{
        Update_Records ur=new Update_Records();
        Scanner Sc=new Scanner(System.in);
        int ch;

        System.out.println("************** OPTIONS **************");
        System.out.println("** 1 - To Add New Interest Details **");
        System.out.println("** 2 - To Update Interest Amount   **");
        System.out.println("** 3 - To Update Date Of Pay       **");
        System.out.println("** 4 - To Exit                     **");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Enter Your Choice: ");
        ch=Sc.nextInt();
        switch (ch){
            case 1:
                ur.addInterestInInterest();
                break;
            case 2:
                ur.updateInterestAmountInInterest();
                break;
            case 3:
                ur.updateInterestDateInInterest();
                break;
            case 4:
                break;


        }
    }

public static void mainmenu() throws Exception{
        Scanner sc=new Scanner(System.in);
        Update_Records ur=new Update_Records();
        int ch;
        System.out.println("*************** MENU ***************");
        System.out.println("** 1 - To Update Loan Details     **");
        System.out.println("** 2 - To Update Interest Details **");
        System.out.println("** 3 - To Update Details Again    **");
        System.out.println("** 4 - To Exit                    **");
        System.out.println("************************************");
        System.out.println();
        System.out.println("Enter Your Choice:  ");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                ur.menuOption();
                break;
            case 2:
                ur.updateInterestMenu();
                break;
            case 3:
                ur.mainmenu();
                break;
            case 4:
                break;

        }

}


}
