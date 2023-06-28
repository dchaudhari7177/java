import java.util.Scanner;
import java.sql.*;


public class micro {

    static final int IFSC = 123456;
     static long accamount;
     static int acc_no;
    static String acch_name;
    static String address;
    static int loanamt;
    static int loantime;
    static String nominee;
    static String acctype;

    static int loanreamt;

    static void newaccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number");
            acc_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        acch_name = sc.nextLine();
        System.out.println("Enter your address");
        address = sc.nextLine();
        System.out.println("Enter the account type(saving/current)");
        acctype=sc.nextLine();


        detailsD(acc_no,acch_name,acctype,address);



    }
static void detailsD(int acno,String name,String accty,String address){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        PreparedStatement psmt = con.prepareStatement("insert into account(accno ,accname ,acctype ,address ) values('" + acno + "','" + name + "','" + accty + "','"+address +"')");
        psmt.execute();

    } catch (Exception e) {
        System.out.println(e);
    }
}

    static void loanD(int ch,int loamt,int lotime,int loreamt,String nomine){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            Statement smt= con.createStatement();

            ResultSet rs= smt.executeQuery("select accno from account");
            while (rs.next()){
                int s1=rs.getInt("accno");
                if(s1==ch){
                    PreparedStatement psmt = con.prepareStatement("update account set loanamt = "+loamt+",loantime ="+lotime+",loanreamt ="+loreamt+",nominee='"+nomine+"' where accno = "+ch);
                    psmt.execute();
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number to view details");
        int ab=sc.nextInt();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");

            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery("select * from account where accno="+ab);
            while (rs.next()) {

                int s1 = rs.getInt("accno");
                String name = rs.getString("accname");
                String type = rs.getString("acctype");
                String address = rs.getString("address");
                int s2 = rs.getInt("loanamt");
                int s3 = rs.getInt("loantime");
                int s4 = rs.getInt("loanreamt");
                String nomin = rs.getString("nominee");

                System.out.println("Account Holder name= " + s1);
                System.out.println("Account number= " + name);
                System.out.println("IFSC code= " + IFSC);
                System.out.println("Account type= " + type);
                System.out.println("addresss of account holder is= " + address );
                System.out.println("Loan details");
                System.out.println("loan amount is: " + s2);
                System.out.println("time period of loan: " + s3);
                System.out.println("Paytime amount is : " + s4);
                System.out.println("Nominee is: " + nomin+"\n\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void transaction() {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("1.Deposit\n2.Withdrawl\n3.loan transaction\n4.Check Balance\n5.Back to Home");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the account Number to Withdraw");
                int acc=sc.nextInt();
                        System.out.println("Enter the amount to deposit");
                        int deamt = sc.nextInt();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
                    Statement smt = con.createStatement();
                    smt.executeUpdate("update account set balance ="+deamt+" where accno="+acc);
                    System.out.println("Successfully updated your account!!");
                }
                catch (Exception e){
                    System.out.println(e);

                }

                break;


            case 2:
                System.out.println("Enter the account Number to Withdraw");
                int ds=sc.nextInt();
                        System.out.println("Enter the withdraw amount");
                        int wamt = sc.nextInt();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
                    Statement smt = con.createStatement();
                    int PreAmt=0;
                    ResultSet rs= smt.executeQuery("select * from account");
                    while (rs.next()){
                        int s1=rs.getInt("accno");
                        if(s1==ds){
                            PreAmt = rs.getInt("balance");
                        }
                    }


                    smt.executeUpdate("update account set balance ="+(PreAmt-wamt)+" where accno="+ds);
                    System.out.println("Successfully updated your account!!");
                }
                catch (Exception e){
                    System.out.println(e);

                }
                        System.out.println(wamt + " is withdraw successfully");
                        break;


            case 3:

                System.out.println("Enter the account number : ");
                int acc1= sc.nextInt();
                System.out.println("Enter the amount of you are acquiring from our bank");
                loanamt = sc.nextInt();

                System.out.println("Enter the number of months for which you are acquiring loan");
                loantime = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the nominee name");
                nominee = sc.next();
                loanreamt = (loanamt + ((loanamt * 15) / 100));
                micro.loanD(acc1,loanamt,loantime,loanreamt,nominee);
                break;
            case 4:
                System.out.println("Enter the account Number to CheckBalance");
                int ab=sc.nextInt();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
                    Statement smt = con.createStatement();
                    int Amt=0;
                    ResultSet rs= smt.executeQuery("select * from account");
                    while (rs.next()){
                        int s1=rs.getInt("accno");
                        if(s1==ab){
                            Amt = rs.getInt("Balance");
                        }
                    }

                    System.out.println("Your account Balance is :"+Amt);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ch;
        do {
            System.out.println("************************* WELCOME TO JAVA BANK ***********************");
            System.out.println("1.Transaction\n2.New Account creation\n3.View Account details\n4.Exit");
            System.out.println("Enter your choice:");

            ch = in.nextInt();
            switch (ch) {
                case 1:
                    transaction();
                    break;
                case 2:
                    newaccount();
                    break;
                case 3:
                    details();
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

/* static void loanD(int ch,int loamt,int lotime,int loreamt,String nomine){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dipak2005");
            Statement smt= con.createStatement();

            ResultSet rs= smt.executeQuery("select accno from account");
            while (rs.next()){
                int s1=rs.getInt("accno");
                if(s1==ch){
                    PreparedStatement psmt = con.prepareStatement("insert into account(loanamt ,loantime ,loanreamt ,nominee ) values('" + loamt + "','" + lotime + "','" + loreamt + "','"+nomine +"')");
                    psmt.execute();
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  */
