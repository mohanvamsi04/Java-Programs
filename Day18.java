/*
Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input

2  3

4  3

Output

2/1   
*/
import java.util.*;
public class Day18
{  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  numerator and denominator of two fractions: ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=x1*y2+x2*y1;
		int y3=y1*y2;
		double val=x3/y3;
		System.out.println("The value of "+x3+" / "+y3+" = "+val);
		
	}
}
