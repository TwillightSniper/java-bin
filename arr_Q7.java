import java.util.*;

class arr_Q7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 numbers:");
        for(int i = 0; i < 20; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9 - i; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for(int i = 10; i < 19; i++)
        {
            for(int j = 10; j < 19 - (i - 10); j++)
            {
                if(a[j] < a[j + 1])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("Final list:");
        for(int i = 0; i < 20; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}