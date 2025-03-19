/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Correct implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2; // Even number: divide by 2
        } else {
            return 3 * n + 1; // Odd number: multiply by 3 and add 1
        }
    }

    public static void main(String[] args) {
        int n = 5; // Starting number
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n); // Get the next number in the sequence
            System.out.print(n + " "); // Print the next number
        }
        System.out.println(); // Print a new line after the sequence ends
    }
}