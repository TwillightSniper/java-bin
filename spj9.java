import java.util.*;

class spj9 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        int c = 0; // count of numbers ending with 0

        System.out.println("Enter 50 numbers:");
        for (int i = 1; i <= 50; i++) {
            int num = in.nextInt();

            // Check if divisible by 5
            if (num % 5 == 0) {
                if (num % 10 == 5)
                    System.out.println(num); // numbers ending with 5
                else if (num % 10 == 0)
                    c++; // count numbers ending with 0
            }
        }

        System.out.println("Count of numbers ending with 0 = " + c);
    }
}
