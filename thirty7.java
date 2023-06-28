//Methods of all String class
import java.util.Scanner;

public class thirty7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int ch;
    do{
        System.out.println("***********************************STRING CLASS METHODS*******************************************\n");
        System.out.println("1.Length \n2.CharAt \n3.IndexOf1 \n4.IndexOf2 \n5.LastIndexOf \n6.Equals \n7.EqualsIgnoreCase \n8.CompareTo \n9.EndsWith \n10.StartWith");
        System.out.println("11.Getbytes \n12.ToLowerCase \n13.Uppercase \n14.trim \n15.Substring1 \n 16.Substring2 \n\n17.Exit");
        System.out.println("Enter Your choice");
        ch=sc.nextInt();
        switch (ch){
            case 1:Length(); break;
            case 2:CharAt(); break;
            case 3:IndexOf1(); break;
            case 4:IndexOf2(); break;
            case 5:LastIndexOf(); break;
            case 6:Equals(); break;
            case 7:EqualsIgnoreCase(); break;
            case 8:CompareTo(); break;
            case 9:EndsWith(); break;
            case 10:StartsWith();break;
            case 11:GetBytes(); break;
            case 12:ToLowercase(); break;
            case 13:UpperCase(); break;
            case 14:Trim();
            case 15:SubString1(); break;
            case 16:SubString2(); break;
            case 17:
                System.out.println("Thank You,,, Good Buyy!!!!");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }while(ch!=17);

    }
    static void Length(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("The length of the string : "+str.length());
    }
    static void CharAt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The index to get the character on index");
        int ind=sc.nextInt();
        char ch=str.charAt(ind);
        System.out.println("The character on the Index "+ind+" is "+ch);
    }
    static void IndexOf1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The Character to get the index");
        char ch=sc.next().charAt(0);
        int ind=str.indexOf(ch);
        System.out.println("The index of character "+ch+" in String "+str+" is: "+ind);
    }
    static void IndexOf2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The String to get the index");
        String s=sc.nextLine();

        int ind=str.indexOf(s);
        System.out.println("The index of String "+s+" in String "+str+" is: "+ind);
    }
    static void LastIndexOf(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The character to get the last index");
        char ch=sc.next().charAt(0);

        int ind=str.lastIndexOf(ch);
        System.out.println("The Last occurence of Character "+ch+" in String "+str+" is on : "+ind+"Index");
    }
    static void Equals(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str1=sc.nextLine();
        System.out.println("Enter the 2Nd String");
        String str2=sc.nextLine();

        boolean b=str1.equals(str2);
        System.out.println("The both strings you entered are equal : "+b);
    }
    static void EqualsIgnoreCase(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str1=sc.nextLine();
        System.out.println("Enter the 2Nd String");
        String str2=sc.nextLine();

        boolean b=str1.equalsIgnoreCase(str2);
        System.out.println("Both strings are equal,ignoring the case consideration: "+b);
    }
    static void CompareTo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str1=sc.nextLine();
        System.out.println("Enter the 2Nd String");
        String str2=sc.nextLine();

        int i=str1.compareTo(str2);
        System.out.println("Lexicographically(equal=0, 1st is greater='>0' & 2nd is greater='<0'");
        System.out.println(i);
    }
    static void EndsWith(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The string to test that your string matches with end of string"+str);
       String s=sc.nextLine();
        boolean b=str.endsWith(s);
        System.out.println("String "+str+"Ends with "+s+": "+b);
    }
    static void StartsWith(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The string to test that your string matches with start of string"+str);
        String s=sc.nextLine();
        boolean b=str.startsWith(s);
        System.out.println("String "+str+"starts with "+s+": "+b);
    }
    static void GetBytes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        byte []b=str.getBytes();
        System.out.println("String in the sequence of bytes "+b);
    }
    static void ToLowercase(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String s=str.toLowerCase();
        System.out.println("After converting the string "+str+" to Lower case,,New string is "+s);
    }
    static void UpperCase(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String s=str.toUpperCase();
        System.out.println("After converting the string "+str+" to Upper case,,New string is "+s);
    }
    static void Trim(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        str.trim();
        System.out.println("After performing the Trim operation on String the string is"+str);
    }
    static void SubString1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The index to get the substring");
        int i=sc.nextInt();
        String s=str.substring(i);
        System.out.println("Substring from index "+i+" is : "+s);
    }
    static void SubString2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter The Start index to get the substring");
        int ind1=sc.nextInt();
        System.out.println("Enter The End index to get the substring");
        int ind2=sc.nextInt();
        String s=str.substring(ind1,ind2);
        System.out.println("Substring from index "+ind1+" to "+ind2+" is: "+s);
    }
}
