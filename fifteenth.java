import java.util.Scanner;

public class fifteenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for swapping them");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);

    }
    static void swap(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping values \n x="+x+"\n y="+y);

    }
}
