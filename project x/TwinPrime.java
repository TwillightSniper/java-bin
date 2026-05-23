import java.util.*;
class TwinPrime
 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int pa = 1, pb = 1;

        for (int i = 2; i < a; i++)
            if (a % i == 0) 
            pa = 0;

        for (int i = 2; i < b; i++)
            if (b % i == 0) 
            pb = 0;

        if (Math.abs(a - b) == 2 && pa == 1 && pb == 1)
            System.out.println("Twin Primes");
        else
            System.out.println("Not Twin Primes");
    }
}
