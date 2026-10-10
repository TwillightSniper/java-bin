import java.util.*;
class arr_Q8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[7];
        System.out.println("Enter 7 PIN codes:");
        for(int i = 0; i < 7; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < 6; i++)
        {
            int pos = i;
            for(int j = i + 1; j < 7; j++)
            {
                if(a[j] < a[pos])
                    pos = j;
            }
            int t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < 7; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}