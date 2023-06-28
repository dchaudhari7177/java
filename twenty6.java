import java.util.Scanner;

public class twenty6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number");
        int num=sc.nextInt();
        int first_num=0;
        int sum=1;
       int x=0;
        int last_num=num%10;
        while (num>=10)
        {
            num=num/10;
            x=num/10;
        }
        first_num=x;

        sum=first_num+last_num;
        System.out.println("The sum is"+sum);
    }
}
