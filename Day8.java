/*
Day 8 coding Statement:  Write a program to find roots of a quadratic equation

Description

Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input

Enter the value of a, b and c : 1 -6 9

Output

Roots are equal

Root 1= root 2 = 3.00
*/

import java.util.*;
public class Day8
{
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 int a,b,c;
	 System.out.println("Enter the values of a, b and c (coefficients of quadratic equation) :");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 double r1=0,r2=0;
	 double d=b*b-4*a*c;
	 if(d>=0){
	 r1=(-b+Math.sqrt(d))/(2*a);
	 r2=(-b-Math.sqrt(d))/(2*a);
	 }
	 
	 if(d==0){
	     System.out.println("Roots are real and equal .");
	     System.out.println("root1 = "+r1+" \nroot2 = "+r2);
	 }
	 if(d>0){
	     System.out.println("Roots are real and distinct");
	      System.out.println("root1 = "+r1+" \nroot2 = "+r2);
	 }
	 
	 if(d<0){
	     
	     System.out.println("Roots are complex ");
	     System.out.println("root1 = -"+b+"+sqrt("+d+")/"+2*a);
	     System.out.println("root1 = -"+b+"-sqrt("+d+")/"+2*a);
	    
	 }
	 
	 
	}
}
