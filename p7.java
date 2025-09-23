import java.util.*;
class p7
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a,r=0;
        while (n!=0)
        {
            a=n%10;
            if (a!=0)
                r=r*10+a;
            n=n/10;
        }
        n=r;
        r=0;
        
        
        while (n!=0)
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        System.out.println ("number without the zero="+r);
    }
}
