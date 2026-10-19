
/**
 Program

Tag Question: Strings

Hint:

sentence and word to search will be separated by "-"

Task:

Write a program to Count the number of times a word is present in a given sentence.

Count the number of times a word is present in the sentence.

Input:

i love java more than i love python or i love any other language-love

Output:

No of Times love is present is: 3

Snippet:-
public class Counting Words {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String query = sc.nextLine();

String sentence = query.split("-")[0];

String searchWord = query.split("-")[1];

 Type your code here

sc.close();

}
}

 */
import java.util.Scanner;

public class CountingWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String query = sc.nextLine().trim();

        query = query.toLowerCase(); // making into lower case

        String sentence = query.split("-")[0];

        String searchWord = query.split("-")[1];

        // Type your code here

        String[] words= sentence.split(" ");
        int count=0;

        for(String word : words){
            if(word.equals(searchWord)){ //using equals function for content comprasion
                count++;
            }
        }
        System.out.println("No of Times "+ searchWord+" is present is: "+ count);

        sc.close();

    }
}