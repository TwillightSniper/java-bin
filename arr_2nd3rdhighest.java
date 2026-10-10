import java.util.*;

class arr_2nd3rdhighest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int t;
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9 - i; j++)
            {
                if(a[j] < a[j + 1])
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("Second highest = " + a[1]);
        System.out.println("Third highest = " + a[2]);
    }
}