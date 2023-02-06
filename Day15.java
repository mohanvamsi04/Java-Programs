/*
Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input

121

Output

Not a strong number

Input

2

Output

Strong number
*/




import java.util.*;
public class Day15
{   public static int factorial(int n){
    
      int fact=1;
       
       for(int i=1;i<=n;i++){
           fact=fact*i;
       }
       
       return fact;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int val=n;
		int rev=0;
		int sum=0;
		while(n>0)
		{
		    int rem=n%10;
		    sum=sum+factorial(rem);
		    n=n/10;
		}
		if(sum==val)
		System.out.println("It is a Strong number. ");
		else
		System.out.println("It is not a strong number.");
		
	}
}
