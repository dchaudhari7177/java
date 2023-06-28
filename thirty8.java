import java.util.*;

public class thirty8 {
    int id;
    double salary;
    String name;
    void display() {

        System.out.println(id+ "   \t|\t"+name+ "\t|\t"+salary);
    }
    void getdata(){
        System.out.println("Enter the Employee ID");
        Scanner sc= new Scanner(System.in);
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter The salary");
        salary=sc.nextDouble();

    }
    public static void main(String[] args) {
       thirty8 []Emp =new thirty8[3];
       for (int i=0;i< Emp.length;i++){
           System.out.println("Enter the detais of "+i+" Employee" );
           Emp[i]=new thirty8();
           Emp[i].getdata();
       }
        System.out.println("Emp id\t|\tname\t|\t salary");
       for (int p=0;p<Emp.length;p++){
           Emp[p].display();
       }
    }
}
