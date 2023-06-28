import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class fourty1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of source file");
        String files=sc.nextLine();
        try{
            FileInputStream fin=new FileInputStream(files);
            System.out.println("Enter the Destination file name");
            String filed=sc.nextLine();

            FileOutputStream fout=new FileOutputStream(filed);
            int b=fin.read();
            while (b!=-1){
                fout.write((byte)b);
                b=fin.read();
            }
            fin.close();
            fout.close();
            System.out.println("items from source file  to Destination file copied successfully");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}