//to find the percentage of 5 subjects of student
package com.company;
import java.util.Scanner;
public class second {
    public static void main(String[] args){
        System.out.println("Measuring percentage from marks of 5 subjects of student");
            Scanner marks = new Scanner(System.in);

        System.out.println("Enter marks of 1st subject:");
        int a= marks.nextInt();

        System.out.println("Enter marks of 2nd subject:");
        int b= marks.nextInt();

        System.out.println("Enter marks of 3rd subject:");
        int c= marks.nextInt();

        System.out.println("Enter marks of 4th subject:");
        int d= marks.nextInt();

        System.out.println("Enter marks of 5th subject:");
        int e= marks.nextInt();

        float percentage = (a+b+c+d+e)/5;
        System.out.println("Percentage of student for 5 subject is:");
        System.out.println(percentage);
                }


}
