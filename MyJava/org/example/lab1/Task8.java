package org.example.org.example.lab1;

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in );
        System.out.print("Enter string:");
        String str1 = in.nextLine();
        for(int i=0;i<=str1.length();i++){
            for(int j=i+1;j<=str1.length();j++){
                System.out.println(str1.substring(i,j));
            }
        }
    }
}