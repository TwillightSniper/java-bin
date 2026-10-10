import java.util.*;

class Array
 {
    int a;
    boolean isPrime(int n) 
    {
        int i, c = 0;
        for (i = 1; i <= n; i++) 
        {
            if (n % i == 0)
                c++;
        }
        return (c == 2);
    }
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        Array ob = new Array();
        int i, c = 0;
        int a[] = new int[3];
        for (i = 0; i < a.length; i++) 
        {
            System.out.println("Enter elements");
            a[i] = in.nextInt();
        }
        for (i = 0; i < a.length; i++) 
        {
            if (ob.isPrime(a[i])) {
                System.out.println(a[i] + " ");
                c++;
            }
        }
        System.out.println();
        System.out.println("No of primes in the array = " + c);
    }
}