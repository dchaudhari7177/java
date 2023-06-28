//Question 1:- demonstration of addition of three numbers:-
//Question 2:- CGPA of student
//Question 3:- take a input from user his name and send them message hello, have a good day with user name..
//Question 4:- Detect the number entered by user is itb integer or not..

package com.company;

import java.util.Scanner;

public class third {
    public static void main(String[] args){
        //Question 1:-
        int a=6;
        int b=7;
        int c=8;
        int sum=a + b+ c;
        System.out.println("Addition of a, b & c is:");
        System.out.println(sum);
        System.out.println();

    //Question 2:-
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        System.out.println("CGPA of student for 3 subject is: ");
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);
        System.out.println();

    //Question 3:-
        System.out.println("What is Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello,"+ name + " Have a Good Day...");
        System.out.println();

    //Question 4:-
        System.out.println("Enter The number");
        Scanner dc = new Scanner(System.in);
        System.out.println(dc.hasNextInt());

    }
}
