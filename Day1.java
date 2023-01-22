/*
Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program: 


Take an input character from the user and check whether the given input is a vowel or consonant.

Input

A

Output

Vowel

Input

m

Output

Consonant

Input

3

Output

Invalid Input

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
     if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
         System.out.println("Vowel");
     }else{
         System.out.println("Consonant");
     }
         
     }else{
         System.out.println("Invalid");
     }
    }
}

