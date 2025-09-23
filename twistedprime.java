import java.util.*;
class twistedprime
{
    public static void main (String args [])
    {
        int n,c=0,r=0,a;
        Scanner in= new Scanner (System.in);
        System.out.println ("enter a prime number");
        n=in.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            while(n!=0)
            {
                a=n%10;
                r=r*10+a;
                n=n/10;
            }
            c=0;
            for(i=1;i<=r;i++)
            {
                if(r%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println("twisted prime");
            }
            else
            System.out.println("not twisted prime");
        }
        else
        System.out.println("not twisted prime");
    }
}