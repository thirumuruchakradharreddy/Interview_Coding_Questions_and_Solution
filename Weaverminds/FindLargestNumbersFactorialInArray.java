/**
 * Tag Question: Numbers

Hint:

Given an array with size N, find the factorial of its largest number.

Task:

Write a program to find the largest number in array and to find factorial of that largest number.

Find the Factorial of largest number in an array

Input:

array = 1,5,2,4,3,2

largest number -> 5

Output: 120

Explanation: 5! 1*2*3*4*5 = 120

Java

Snippet

import static java.util.stream.Collectors.toList;

public class FindLargestNumbersFactorialInArray {

private static void find LargestnumberFactorial(int[] a) {

type your code here

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String numbers = sc.nextLine().split(",");

int[] a = new int[numbers.length];
for (int i = 0; i < numbers.length; i++) {

a[i] = Integer.valueOf(numbers[i]);

}

findLargestnumberFactorial(a);

sc.close();
}
}
 */

import java.util.Scanner;
import java.util.Arrays;

public class FindLargestNumbersFactorialInArray {

private static void findLargestnumberFactorial(int[] a) {

// type your code here
//Checking the input is empty or not
if(a== null || a.length == 0){
    System.out.println(0);
    return;
}

//max number
int max = Arrays.stream(a).max().getAsInt();

//factorial
long fact=1;
for(int i =1 ; i<=max; i++){
    fact= fact*i;
}
System.out.println(fact);
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String[] numbers = sc.nextLine().split(",");

int[] a = new int[numbers.length];
for (int i = 0; i < numbers.length ; i++) {

a[i] = Integer.valueOf(numbers[i]);

}

findLargestnumberFactorial(a);

sc.close();
}
}