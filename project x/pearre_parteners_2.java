import java.util.*;
class pearre_parteners_2
{
    public static void main (String args [])
    {
        Scanner in= new Scanner (System.in);
        System.out.println ("Enter First Number");
        int m=in.nextInt();
        System.out.println ("Enter Second Number");
        int n=in.nextInt();
        int f1,f2,l1,l2,c1=0,c2=0,m1=m,n1=n;
        
        while(m1!=0)
        {
            c1++;
            m1/=10;
        }
        while(n1!=0)
        {
            c2++;
            n1/=10;
        }
        f1=m/(int)Math.pow(10,c1-1);
        f2=n/(int)Math.pow(10,c2-1);
        l1=m%10;
        l2=n%10;
        if (f1==l2 && f2==l1)
        {
            System.out.println("pearre partners");
        }
        else
        {
            System.out.println("not pearre partners");
        }
    }
}