/*
Day 4 coding Statement:  Write a program to identify of the a number is positive or negative

Description

Get an input number from the user and check whether it is a positive or negative number.

Input :

-10

Output : 

Negative number

Input :

0

Output :

Neither positive nor negative

Input :

15

Output : 

Positive number

*/

import java.util.*;
class Day4 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        if(n==0){
            System.out.println("Neither positive nor negative");
        }else if(n>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
    }
}

