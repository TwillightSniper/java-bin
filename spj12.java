import java.util.*;

class spj12
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        // Ask the user for their ch of pattern
        System.out.println("Enter your ch:");
        System.out.println("1. Pattern (a)");
        System.out.println("2. Pattern (b)");
        char ch = in.next().charAt(0);

        // Switch-case structure to print the selected pattern
        switch(ch)
        {
            case 'a':
                // Pattern (a)
                int numA = 11; // Starting number for pattern (a)
                for(int i = 4; i >= 1; i--)  // Outer loop controls rows
                {
                    for(int j = 1; j <= i; j++)  // Inner loop prints numbers in each row
                    {
                        System.out.print(numA + " ");
                        numA += 11; // Increment by 11 each time
                    }
                    System.out.println(); // Move to next line
                }
                break;

            case 'b':
                // Pattern (b)
                int numB = 50; // Starting number for pattern (b)
                for(int i = 4; i >= 1; i--)  // Outer loop controls rows
                {
                    for(int j = 1; j <= i; j++)  // Inner loop prints numbers in each row
                    {
                        System.out.print(numB + " ");
                        numB -= 10; // Decrease by 10 each time
                    }
                    System.out.println(); // Move to next line
                }
                break;

            default:
                // If the user enters an invalid ch
                System.out.println("Invalid ch!");
        }

        in.close(); // Close the scanner
    }
}
