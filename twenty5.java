import java.util.*;
public class twenty5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int rem,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println(temp+" is palindrome number");
        }
        else {
            System.out.println(temp+" is not a palindrome number");
        }
    }
}
