import java.util.*;
class primeno
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int n;
        for (int i=1;i<=20;i++)
        {
            System.out.println("enter a number");
            n=in.nextInt();
            int c=0;
            for (int j=1;j<=n;j++)
            {
                if (i%j==0)
                {
                    c++;
                }
            }
            if (c==2)
            {
               System.out.println(n+" is a prime no");
            }
        
        }
        
    }
}