/**
 Tag Question: Numbers

Hint:

A prime number is a natural number greater than 1, which is only divisible by 1 and itself.

Task:

Write a program which evaluates a number is prime or not.

Write a program to find Prime No.

Input: 3

Output: 3 is prime number

Input: 4

Output: 4 is not prime number


Snippet 
import java.util.regex.*;

import java.util.stream.*;

import static java.util.stream.Collectors.joining;

import static java.util.stream.Collectors.toList;

public class PrimeNo {

static void checkPrime(int n) {

}

// type your code here

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

checkPrime(sc.nextInt());

}

}
 */

import java.util.Scanner;

public class PrimeNo {

static void checkPrime(int n) {

    // type your code here

    boolean isPrime= true ;

    if(n<=1){
        System.out.println(n +" is not prime number");
        return;
    }
    for(int i=2;i<n; i++){
        if(n%i==0){
            isPrime= false;
            
        }
        
    }

    if(isPrime){
        System.out.println(n +" is prime number");
    }
    else{
            System.out.println(n +" is not prime number");
    }
}

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

checkPrime(sc.nextInt());

}

}