import java.util.*;
class pj6
{
   void sumSeries(int n, double x)
   {
       double s=0;
       for (int i = 1; i <= n ; i++)
       {
           if (i%2==0)
           {
               s=s+Math.pow(x,i);
           }
           else
           {
               s=s-Math.pow(x,i);
           }
       }
       System.out.println ("Sum:"+s);
   }
   void sumSeries()
   {
       int s=0,f=1;
       for (int i = 1; i <= 20 ;i++)
       {
           f=f*i;
           s=s+f;
       }
       System.out.println ("Sum:"+s);
   }
   public static void main (String args [])
   {
       Scanner in = new Scanner (System.in);
       pj6 ob = new pj6();
       System.out.println ("Series 1 or 2");
       int ch = in.nextInt();
       switch (ch)
       {
           case 1:
           System.out.println ("x and n");
           int x = in.nextInt();
           int n = in.nextInt();
           ob.sumSeries(n,x);
           break;
           case 2:
           ob.sumSeries();
           break;
        }
   }
}