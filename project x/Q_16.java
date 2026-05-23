import java.util.*;
class Q_16
{
    double series (double n)
    {
        double sum= 0;
        for (int i=1 ;i<=n;i++)
        {
            sum= sum+(1/i);
        }
        return sum;
    }
    double series (double a,double n)
    {
        int c=0,j=0,i;
        double sum=0;
        for (i=1;c<=n;i=j+2)
        {
            j=i+1;
            sum= sum + (i/Math.pow(a,j));
            c++;
        }
        return sum;
    }
    
    public static void main ()
    {
       Scanner in = new Scanner (System.in);
       Q_16 ob = new Q_16 ();
       System.out.println ("enter n");
       double n=in.nextDouble();
       System.out.println ("enter a");
       double a=in.nextDouble();
        System.out.println ("Sum of Series 1 "+ob.series(n));
        System.out.println ("Sum of Series 2 "+ob.series(n,a));
    }
}