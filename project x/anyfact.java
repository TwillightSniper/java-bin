import java.util.*;
class anyfact
{
    public static void main (String args [])
    {
        Scanner in =new Scanner (System.in);
        int i,j,n;
        long f;
        
        for(i=1;i<=10;i++)
        {
            n=(int)(Math.random()*20)+1;
            f=1;
            for (j=1;j<=n;j++)
            {
                f=f*j;
            }
            System.out.println(n+"! = "+f);
        }
    }
}