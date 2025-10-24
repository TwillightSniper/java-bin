import java.util.*;

class spj8 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        // Taking range input
        System.out.println("Enter the range (m and n):");
        int m = in.nextInt();
        int n = in.nextInt();

        int es = 0, os = 0; // es = even sum, os = odd sum

        // Checking each number from m to n
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0)
                es += i; // even sum
            else
                os += i; // odd sum
        }

        // Displaying the results
        System.out.println("Sum of even numbers = " + es);
        System.out.println("Sum of odd numbers = " + os);
    }
}
