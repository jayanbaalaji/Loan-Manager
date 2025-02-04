import java.lang.classfile.instruction.SwitchCase;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Read_Record rr=new Read_Record();
        Update_Records ur=new Update_Records();
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("************* MENU *************");
        System.out.println("** 1 - To See Loan Details    **");
        System.out.println("** 2 - To Update Loan Details **");
        System.out.println("** 3 - To Exit                **");
        System.out.println("********************************");
        System.out.println();
        System.out.println("Enter Your Choice: ");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                rr.readMenu();
                break;
            case 2:
                ur.mainmenu();
                break;
            case 3:
                break;
        }


    }
}