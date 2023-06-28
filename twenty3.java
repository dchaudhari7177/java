import java.util.Scanner;

public class twenty3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rem=0,c=0;
        while (num!=0)
        {
            rem=num%10;
            num=num/10;

            if(rem==3)
            {
                c++;
            }
        }
        System.out.println("number of 3's:= "+c);

    }
}
