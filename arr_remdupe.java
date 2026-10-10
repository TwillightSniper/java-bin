import java.util.*;
class arr_remdupe
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[20];
        int b[] = new int[20];
        int n = 0, c;
        System.out.println("Enter 20 integers:");
        for(int i = 0; i < 20; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < 20; i++)
        {
            c = 0;
            for(int j = 0; j < n; j++)
            {
                if(a[i] == b[j])
                {
                    c++;
                }
            }
            if(c == 0)
            {
                b[n] = a[i];
                n++;
            }
        }
        System.out.println("removing duplicates:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}