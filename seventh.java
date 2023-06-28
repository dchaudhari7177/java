//package com.company.;
import java.util.Scanner;

class fir {
    int a,b;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for A & B");
         a = sc.nextInt();
         b = sc.nextInt();
    }
}
class Dip extends fir{
    void add(){
        int sum=a+b;
        System.out.println("Addition is:"+sum);
    }
}
    public class seventh {
        public static void main(String[] args) {

            Dip ved=new Dip();
            ved.accept();
            ved.add();


        }
    }




