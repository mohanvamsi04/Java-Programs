/*
Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :

A

Output: 

Alphabet

Input:

7

Output:

Not an alphabet

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
            System.out.println("Alphabet");
        }else{
            System.out.println("Not an alphabet");
        }
    }
}

