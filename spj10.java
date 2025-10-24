import java.util.*;
class spj10
{
    public static void main (String args [])
    {
        double s=0.0;
        int f,i,j;
        char ch;
        Scanner in = new Scanner (System.in);
        
        System.out.println("a or b");
        ch = in.next().charAt(0);
        
        System.out.println ("Enter a:");
        int a = in.nextInt();
        
        System.out.println ("Enter n:");
        int n = in.nextInt();
        
        switch (ch)
        {
            case 'a' :
                for (i=1;i<=n;i++)
                {
                    f=1;
                    for (j=1;j<=i;j++)
                    {
                        f=f*j;
                    }
                    s=s+a/(double) f;
                }
                System.out.println (s);
            break;
            case 'b' :
                for (i=1;i<=10;i++)
                {
                    f=1;
                    for (j=1;j<=i;j++)
                    {
                        f=f*j;
                    }
                    s=s+a/(double) i;
                }
                System.out.println (s);
            break;
            default:
                System.out.println("invalid choice");
        }
    }
}
