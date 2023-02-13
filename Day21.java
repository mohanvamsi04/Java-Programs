/*
Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome
*/

import java.util.*;
public class Day21
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,q,rev=0;
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		q=n;
		while(n>0){
		    int rem=n%10;
		    rev = rev*10+rem;
		    n/=10;
		}
		
		 if(q==rev){
		     System.out.println("Palindrome");
		 }else{
		     System.out.println("Not Palindrome");
		 }
		
	}
}
