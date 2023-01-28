/*
Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description

Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.

Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

Input

5

Output

0,1,1,2,3

Input

8

Output

0,1,1,2,3,5,8,13
*/

import java.util.*;
public class Day11
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter  a number :");
		n=sc.nextInt();
		int first=0;
		int second=1;
		int next;
		System.out.println("The fibonacci series of "+n+" is :");
		if(n==1)
	    	System.out.println(first);
		if(n==2)
	    	System.out.print(first+" "+second+" ");
		if(n>=3){
	    	System.out.print(first+" "+second+" ");
		for(int i=3;i<=n;i++){
		    next=first+second;
		    System.out.print(next+" ");
		    first=second;
		    second=next;
		}
		}
	
	}
}
