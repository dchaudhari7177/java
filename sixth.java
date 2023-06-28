package com.company;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        int di[] = new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 numberrs");
        for(int i=0;i<10;i++) {

            di[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++) {

            System.out.println(di[i]);
        }
    }
}