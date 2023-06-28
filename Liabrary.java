import java.util.Scanner;
import java.sql.*;


public class Liabrary {


    static int stdid;
    static String std_name;
    static String address;
    static int price;
    static String book_name;
    static String author_name;


    static void newbook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student id number");
        stdid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        std_name = sc.nextLine();
        System.out.println("Enter your address");
        address = sc.nextLine();
        System.out.println("Enter the Book name");
        book_name = sc.nextLine();
        System.out.println("Enter the Author name");
        author_name = sc.nextLine();
        System.out.println("Enter the Book Book Price");
        price = sc.nextInt();
        System.out.println("Data Entered Succesfully!!!");


        detailsD(stdid, std_name, address, book_name, author_name, price);


    }

    static void detailsD(int id, String name, String Add, String Bname, String Aname, int Price) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            PreparedStatement psmt = con.prepareStatement("insert into Library " + "(Std_id,Std_name,Address,BookName,AuthorName,Price) values('" + id + "','" + name + "','" + Add + "','" + Bname + "','" + Aname + "','" + Price + "')");
            psmt.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void SearchBook(int ch) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery("select * from Library where Std_id=" + ch);
            while (rs.next()) {
                int s1 = rs.getInt("Std_Id");
                String name = rs.getString("Std_name");
                String Address = rs.getString("Address");
                String BookName = rs.getString("BookName");
                String author = rs.getString("AuthorName");
                int price = rs.getInt("Price");

                System.out.println("Student ID: " + s1);
                System.out.println("Student Name: " + name);
                System.out.println("Address: " + Address);
                System.out.println("Book Name: " + BookName);
                System.out.println("Author Name: " + author);
                System.out.println("Price: " + price);


            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void Details() {
        System.out.println("Student ID: "+stdid);
        System.out.println("Student Name: "+std_name);
        System.out.println("Address: "+address);
        System.out.println("Book Name: "+book_name);
        System.out.println("Author Name: "+author_name);
        System.out.println("Price: "+price);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("************************* WELCOME TO JAVA LIABRARY ***********************");

            System.out.println("1.Register\n2.Search\n3.Details\n4.Exit");
            System.out.println("Enter your choice:");
            ch = in.nextInt();

            switch (ch) {
                case 1:

                    newbook();

                    break;
                case 2:
                    System.out.println("Enter the Student Id to search for Book : ");
                    int id = in.nextInt();
                    SearchBook(id);
                    break;
                case 3:


                    Details();

                    break;
                case 4:
                    System.out.println("Thanks for using our software!!!!VISIT AGAIN.....");
                    break;
                default:
                    System.out.println("Invalid choice...");
            }


        } while (ch != 5);
    }
}

