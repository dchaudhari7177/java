import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner di=new Scanner(System.in);
        System.out.println("Enter The meter value to convert it into kilometers");
        float me=di.nextFloat();
        float km=me/1000;
        System.out.println("After converting "+me+"into kilometers "+km+" km");


    }
}
