import java.util.Scanner;
import java.lang.Math.*;

public class ninteenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter The power of a number");
        int po= sc.nextInt();

        System.out.println("Answer is:"+Math.pow(num,po));
    }
}
