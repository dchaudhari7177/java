import java.util.Scanner;

public class twentyy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int fibo=0;
        for(int i=1;i<= num;i++)
        {
          fibo=fibo+i;
            System.out.println(fibo);
        }

    }
}
