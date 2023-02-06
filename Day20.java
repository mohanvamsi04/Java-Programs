/*
Day 20 coding Statement : Write a program to identify if the number is Prime number or not

Description

Get a number as input from the user and check whether that number is prime or not.

A prime number is a number with factors as 1 and that number itself.

Input

1

Output

1 is not a prime number

Input

5

Output

5 is a prime number  
*/

import java.util.*;
public class Day20
{  
    public static boolean isPrime(int n){
        
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(isPrime(n))
		System.out.println("It is a prime number.");
		else
		System.out.println("It is not a prime.");
		
		
	}
}
