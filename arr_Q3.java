import java.util.*;

class arr_Q3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
        {
            n[i] = in.nextInt();
        }
        for(int i = 0; i < 10; i++)
        {
            if(n[i] < 0)
                System.out.print(n[i] + " ");
        }
        for(int i = 0; i < 10; i++)
        {
            if(n[i] >= 0)
                System.out.print(n[i] + " ");
        }
    }
}