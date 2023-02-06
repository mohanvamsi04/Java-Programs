/*
Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number  

*/
import java.util.*;
public class Day19
{  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int numberOfDigits=(int)Math.log10(n)+1;
		System.out.println(numberOfDigits);
		int val=n;
		int sum=0;
		while(val>0){
		    int rem=val%10;
		    sum=sum+(int)Math.pow(rem,numberOfDigits);
		    val=val/10;
		    
		}
		if(sum==n)
		System.out.println("The number is an Armstrong number");
		else
		System.out.println("The number is not an Armstrong number");
	
		
	}
}
