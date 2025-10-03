import java.util.*;
class spj3
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n,m,i,p;
        System.out.println("enter m");
        m=in.nextInt();
        System.out.println("enter n");
        n=in.nextInt();
        for (i=m;i<=n;i++)
        {
            p=i*(i+1);
            if(p<=n)
            {
                System.out.println(p);
            }
            else{
                break;
            }
        }
    }
}