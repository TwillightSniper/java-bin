import java.util.*;

class array_buzz
{
    boolean isBuzz(int n)
    {
        return (n % 7 == 0 || n % 10 == 7);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        array_buzz ob = new array_buzz();
        int i, c = 0;
        int a[] = new int[10];
        for(i = 0; i < a.length; i++)
        {
            System.out.println("Enter number");
            a[i] = in.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
            if(ob.isBuzz(a[i]))
            {
                System.out.println(a[i]);
                c++;
            }
        }
        System.out.println();
        System.out.println("No. of Buzz numbers = " + c);
    }
}