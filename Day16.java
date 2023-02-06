/*

Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.

Input

28

Output

Perfect Number

Input

4

Output

Not a perfect number 
*/

import java.util.*;
public class Day16
{  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
		    
		    if(n%i==0)
		      sum=sum+i;
		    
		}
		
		if(sum==n)
		System.out.println("It is a perfect number.");
		else
		System.out.println("It is not a perfect number.");
	
		
	}
}
