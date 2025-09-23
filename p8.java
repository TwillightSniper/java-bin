import java.util.*;
class p8
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a,s=0,p=1;
        while (n!=0)
        {
            a=n%10;
            s=s+a;
            p=p*a;
            n=n/10;
        }
        if (p==s)
        {
            System.out.println ("the number is a spy number");
        }
        else
        {
            System.out.println ("the number is not a spy number");
        }
    }
}