import java.util.Scanner;

public class sixteenth {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch;

        do{
            System.out.println("1.Addition\n2.Substraction\n3.multiplication\n4.Division\n5.Exit");
            System.out.println("\n Enter Your choice");

            ch=sc.nextInt();

    switch (ch){
        case 1:Addition();break;
        case 2:Subtraction();break;
        case 3:Multiplication();break;
        case 4:Division();break;
        case 5:
            System.out.println("Thank you!!!");break;
        default:
            System.out.println("Enter correct choice");
    }
        }while(ch!=5);

}
static void Addition(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a=sc.nextInt();
    int b =sc.nextInt();
    int sum=a+b;
    System.out.println("Addition is"+sum);

}
    static void Subtraction(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int mul=a-b;
        System.out.println("Subtraction is"+mul);

    }
    static void Multiplication (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int mul=a+b;
        System.out.println("Multiplication is"+mul);

    }
    static void Division(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int sum=a/b;
        System.out.println("Division is"+sum);

    }


}
