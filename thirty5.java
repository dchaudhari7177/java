import java.util.Scanner;

public class thirty5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email");
        String email = sc.nextLine();
        int a=email.indexOf('@');
        int b=email.indexOf('.');
        String s1=email.substring(0,a);
        String s2=email.substring((a+1),b);
        String s3=email.substring((b+1));

        System.out.println("User Name = "+s1);
        System.out.println("Company = "+s2);
        System.out.println("Domain = "+s3);

    }
}
