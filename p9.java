import java.util.*;
class p9
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a,c=0,m=n,fh,sh,f=0;
        while (n!=0)
        {
            c++;
            n=n/10;
        }
        if (c%2==0)
        {
           fh = m/(int)Math.pow(10,c/2);
           sh = m%(int)Math.pow(10,c/2);
           if ((int)Math.pow(fh+sh,2)==m)
           {
               f=1;
           }
        }
        if(f==1)
        {
             System.out.println("tech number"); 
        }
        else
        {
            System.out.println("not a tech number"); 
        }
    }
}