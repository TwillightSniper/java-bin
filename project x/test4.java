import java.util.*;
class test4
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i=1,j,n,c=0,c1;
        System.out.println ("enter n");
        n=in.nextInt();
        while(c<=n)
        {
            c1=0;
            for (j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                    c1++;
                }
            }
            if(c1==2)
            {
                System.out.print(i+",");
                c++;
            }
            i++;
        }
    }
}