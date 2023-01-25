/*
Day 9 coding Statement : Write a program to find Number of digits in an integer

Description

Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

Input

3241

Output

4

Input

6

Output

1
*/

import java.util.*;
public class Day9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number : ");
	    int n=sc.nextInt();
	    System.out.println("The number of digits are "+(int)Math.floor(Math.log10(n)+1));
		
	}
}
