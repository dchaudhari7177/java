import java.util.Scanner;

public class twenty9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of iterations");
        int num=sc.nextInt();
        int a=1;
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
