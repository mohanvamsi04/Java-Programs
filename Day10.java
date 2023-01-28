/*
Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24
*/

import java.util.*;
public class Day10
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter  a number :");
		n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
		    fact=fact*i;
		}
		System.out.println("The factorial of the number "+n+" is "+fact);
	}
}
