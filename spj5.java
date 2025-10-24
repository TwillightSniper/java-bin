import java.util.*;

class spj5 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        int pc = 0, nc = 0;
        int ps = 0, ns = 0;

        // Taking input of 15 numbers
        System.out.println("Enter 15 numbers:");
        for (int i = 1; i <= 15; i++) {
            int num = in.nextInt();

            // Checking if the number is positive or negative
            if (num > 0) {
                pc++;          // Count positive numbers
                ps += num;       // Add to positive sum
            } else if (num < 0) {
                nc++;          // Count negative numbers
                ns += num;       // Add to negative sum
            }
        }

        // Displaying the results
        System.out.println("Count of positive numbers = " + pc);
        System.out.println("Count of negative numbers = " + nc);
        System.out.println("Sum of positive numbers = " + ps);
        System.out.println("Sum of negative numbers = " + ns);
    }
}
