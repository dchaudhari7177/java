import java.util.Scanner;

public class twenty4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The number");
        int num=sc.nextInt();
        int rem=1,c=0,s=0;
        while (num!=0)
        {
            rem=num%10;
            num=num/10;

            if(rem>c)
            {
                c=rem;
            }
            else
            {
                s=rem;
            }

        }
        System.out.println("Greatest number in a number"+num+"is : "+c);
        System.out.println("Smallest number in a number"+num+"is : "+s);
    }
}
