import java.util.*;
class test3
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i,j,s=0,m=1,n;
        double S=0;
        System.out.println ("enter n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=0;m=1;
            for(j=1;j<=i;j++)
            {
                m=m*j;
                s=s+j; 
            }
            S=S+(s/m);
        }
        System.out.println ("sum:"+S);
    }
}