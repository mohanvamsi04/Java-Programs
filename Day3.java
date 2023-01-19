/*
Day 3 coding Statement: Write a program to find ASCII values of a character

Description:

Get an input character from the user and give the ASCII value of the given input as the output.

Input:

b

Output:

98

Input:

B

Output:

66
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
       
        System.out.println((int)ch);
    }
}
