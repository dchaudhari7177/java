//all operations on stringBuffer
import java.util.Scanner;

public class thirty6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do {
            System.out.println("******************************** OPERATIONS ON STSRINGBUFFER ********************************");
            System.out.println("1.Append \n 2.Insert \n 3.Delete \n 4.DeleteCharAt \n 5.Replace \n 6.Reverse \n 7.Exit");
            System.out.println("Enter Your choice:");
            ch=sc.nextInt();
            switch (ch){
                case 1: appen(); break;
                case 2: Insert(); break;
                case 3: delete(); break;
                case 4: delete1(); break;
                case 5: replace(); break;
                case 6: reverse(); break;
                case 7:
                    System.out.println("Thank You,, Good buyyyy!!!!!");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }while (ch!=7);

    }
    static void appen(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        System.out.println("Enter the string to append");
        String str2=sc.nextLine();

        s1.append(str2);
        System.out.println("After Append operation String is : "+s1);
    }
    static void Insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        System.out.println("Enter the index and value to be insert at index");
        int ind=sc.nextInt();
        String str2=sc.nextLine();

        s1.insert(ind,str2);
        System.out.println("After insert operation String is : "+s1);
    }
    static void delete(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        System.out.println("Enter the startig and end index to perform delete operation");
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();

        s1.delete(ind1,ind2);
        System.out.println("After Delete operation String is : "+s1);
    }
    static void delete1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        System.out.println("Enter the index to delete the character on index");
        int ind1=sc.nextInt();

        s1.deleteCharAt(ind1);
        System.out.println("After deleteCharAt operation String is : "+s1);
    }
    static void replace(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        System.out.println("Enter the Starting and end index and  Enter the new string to replace");
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();

        String str2=sc.nextLine();

        s1.replace(ind1,ind2,str2);
        System.out.println("After Performing replace operation String is : "+s1);
    }
    static void reverse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer(str);
        s1.reverse();

        System.out.println("After performin reverse operation on String is : "+s1);
    }
}

