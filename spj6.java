import java.util.*;

class spj6 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        // Taking input of range m and n
        System.out.println("Enter the range (m and n):");
        int m = in.nextInt();
        int n = in.nextInt();

        System.out.println("Palindrome numbers from " + m + " to " + n + " are:");

        // Checking each number in the given range
        for (int i = m; i <= n; i++) {
            int num = i, rev = 0, temp = num;

            // Reversing the number
            while (temp > 0) {
                int d = temp % 10;   // Extract last digit
                rev = rev * 10 + d;  // Build reverse number
                temp /= 10;          // Remove last digit
            }

            // Checking if number is palindrome
            if (num == rev) {
                System.out.println(num);
            }
        }
    }
}
