import java.util.*;

class spj7 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of terms (n):");
        int n = in.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1. Series (i): 0, 3, 8, 15,...");
        System.out.println("2. Series (ii): 24, 99, 224, 399,...");
        int ch = in.nextInt();

        switch (ch) {
            case 1:
                // Series (i): 0, 3, 8, 15,...
                System.out.println("Series (i):");
                for (int i = 1; i <= n; i++) {
                    int term = (i * i) - 1;   // Pattern: n² - 1
                    System.out.print(term + " ");
                }
                break;

            case 2:
                // Series (ii): 24, 99, 224, 399,...
                System.out.println("Series (ii):");
                for (int i = 2; i <= n + 1; i++) {
                    int term = (i * i * i) + (i * i) - 4;  // Derived pattern
                    System.out.print(term + " ");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
