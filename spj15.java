import java.util.*;
class spj15
{
    public static void main (String args[])
    {
        Scanner in =new Scanner (System.in);
        int i,d,n,f,j,m;
        double s=0.0;
        System.out.println ("enter n:");
        n=in.nextInt();
        m=n;
        while (n!=0)
        {
            d=n%10;
            f=1;
            for (i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        //System.out.println (((s!=m)?"not ":"")+"Special number");
        if (m==s)
        {
            System.out.println ("Special number");
        }
        else
        {
            System.out.println ("not a Special number");
        }
    }
}
