// Md Sohanur Rahman
// Algorithms
// Proj1 - "sums to n problem"
// Received help from StackOverflow and Michael O' Brien

import java.util.Scanner;

public class Proj1{

    public static void main(String[] args) {

        System.out.print("Enter a positive whole number: ");
        int n = new Scanner(System.in).nextInt();

        // continue asking for valid input if input isn't already valid
        while(n <= 0) {
            System.out.print("Please enter a whole number greater than 0: ");
            n = new Scanner( System.in ).nextInt();
        }

        System.out.println("Here are all the different ways to get numbers that add to " + n);

        // Generate a possibilities tree
        for (int counter = 1; counter <= n; counter++)
            generate(n, "" + counter, counter, counter);

    } // end main

    private static void generate(int n, String leaf, int currentNum, int runningSum){

        // Check if runningSum = n. If so, print leaf
        if (runningSum == n)
            System.out.println(leaf);

        // Keep generating branches
        else if (runningSum < n){
            for (int counter = currentNum; counter < n; counter++)
                generate(n, leaf + " + " + counter, counter, runningSum + counter);
        }
    } // end generate

} // end class

