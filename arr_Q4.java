import java.util.*;

class arr_Q4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n[] = new int[20];
        System.out.println("Enter 20 numbers:");
        for(int i = 0; i < 20; i++)
        {
            n[i] = in.nextInt();
        }
        System.out.println("Prime numbers:");
        for(int i = 0; i < 20; i++)
        {
            int c = 0;
            for(int j = 1; j <= n[i]; j++)
            {
                if(n[i] % j == 0)
                    c++;
            }
            if(c == 2)
                System.out.print(n[i] + " ");
        }
    }
}