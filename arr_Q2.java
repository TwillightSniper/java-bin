import java.util.*;

class arr_Q2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double a[] = new double[20];
        double p = 1;
        System.out.println("Enter 20 numbers:");
        for(int i = 0; i < 20; i++)
        {
            a[i] = in.nextDouble();
            p = p * a[i];
        }
        System.out.println("Product= " + p);
        System.out.println("Squares:");
        for(int i = 0; i < 20; i++)
        {
            System.out.println(a[i] * a[i]);
        }
    }
}