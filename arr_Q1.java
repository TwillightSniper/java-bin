import java.util.*;

class arr_Q1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[20];
        int i, es = 0, os = 0;
        System.out.println("Enter 20 numbers:");
        for(i = 0; i < 20; i++)
        {
            a[i] = in.nextInt();
            if(a[i] % 2 == 0)
                es = es + a[i];
            else
                os = os + a[i];
        }
        System.out.println("Sum of even numbers = " + es);
        System.out.println("Sum of odd numbers = " + os);
    }
}