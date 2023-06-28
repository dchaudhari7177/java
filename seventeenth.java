import java.util.*;
public class seventeenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial of a number");
        int num=sc.nextInt();
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of"+num+"is"+f);
    }
}
