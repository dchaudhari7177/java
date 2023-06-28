import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class datainsert {
    static int empno;
    static String ename;
    static double salary;

    static void insert(int empnum, String empnamee, double sal) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            PreparedStatement psmt = con.prepareStatement("insert into emplo(eno,ename,esal) values('" + empnum + "','" + empnamee + "','" + sal + "')");
            psmt.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void delte(int empnum) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            PreparedStatement dsmt = con.prepareStatement("delete from emplo where eno=('" + empnum + "')");
            dsmt.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.insert\n2.delete\n3.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the empno to insert");
                    empno = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the empname to insert");
                    ename = sc.nextLine();
                    System.out.println("Enter the salary to insert");
                    salary = sc.nextDouble();
                    insert(empno, ename, salary);
                    System.out.println("Tumcha data insert xala");
                case 2:
                    System.out.println("Enter the empno to delete");
                    empno = sc.nextInt();
                    delte(empno);
                    System.out.println("tumcha data delete xala");
                case 3:
                    System.out.println("Thank you for using Dipak's software");

                default:
                    System.out.println("bhadwya barobr option tak na lawdya");
            }


        } while (ch != 5);
    }

}

