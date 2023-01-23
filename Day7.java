/*
Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.

Input

Enter month : 2

Enter year : 2000

Output

29
*/

import java.util.*;
public class Day7
{
    public static boolean isLeapYear(int year){
        
         if(year%400==0){
             return true;
         }
         
         if(year%100==0){
             return false;
         }
         
         if(year%4==0){
             return true;
         }
         
         return false;
    }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year and month :");
		
		int year=sc.nextInt();
		int month=sc.nextInt();
		
		if(isLeapYear(year) && month==2){
		    System.out.println("The number of days are "+29);
		}else if(month==2){
		     System.out.println("The number of days are "+28);
		}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
		     System.out.println("The number of days are "+31);
		}else{
		     System.out.println("The number of days are "+30);
		}
		
		
		
	}
}
