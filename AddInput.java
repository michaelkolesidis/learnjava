/* 
 * Add Input
 * 
 * Take double numbers as input and outputs their sum. 
 * Should be used with text file as input, as there is no exit 
 * condition for scanner.
 * 
 * 
 * Use: 
 * $ cat text.txt | java Test > output.txt
 * 
 * text.txt:
 * 1
 * 2
 * 3
 * 
 * Output: (in file output.txt)
 * Sum is: 6.0
 */

import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; // Import the ArrayList class

class AddInput {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();

        double sum = 0;

        Scanner scans = new Scanner(System.in); // Create a Scanner object

        while (scans.hasNextLine()) {
            double num = scans.nextDouble();
            nums.add(num);
        }

        scans.close();

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i); // Calculate the sum
        }

        System.out.println("Sum is: " + sum); // Print the sum
    }
}
