import java.util.Scanner;

public class twelveth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("The sum of Three Integers You Entered"+(a+b+c));
        System.out.println("Average value of three Integers numbers You Entered"+((a+b+c)/3));
    }
}
