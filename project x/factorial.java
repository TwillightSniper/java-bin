import java.util.*;
class factorial
{
    public static void main (String args [])
    {
        Scanner in =new Scanner (System.in);
        int n,m,i,j,f;
        System.out.println("enter the value of m");
        m=in.nextInt();
        System.out.println("enter the value of n");
        n=in.nextInt();
        
        for(i=m;i<=n;i++)
        {
            f=1;
            for (j=1;j<=i;j++)
            {
                f=f*j;
            }
            System.out.println(i+"! = "+f);
        }
    }
}