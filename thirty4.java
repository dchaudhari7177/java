import java.util.Scanner;

public class thirty4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The email");
        String email=sc.nextLine();
        int i=email.indexOf('@');
        int j=email.indexOf('.');
        if(i!=-1 && j!=-1 && i<j){
            System.out.println("Valid email Address");
        }
        else
            System.out.println("Invalid email Address");
    }
}
