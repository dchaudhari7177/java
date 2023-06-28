import java.util.Scanner;

public class twenty7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of iteration");
        int num=sc.nextInt();

        for (int i=num;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
