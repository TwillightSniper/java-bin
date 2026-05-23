import java.util.*;
class Trunk_number
{
    public static void main (String arg [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter a number");
        int n = in.nextInt();
        int a,r=0,m=n;
        while (n!=0)
        {
            a=n%10;
            r=r*10+a;
            n/=10;
        }
        if (r>m)
        {
            System.out.println ("Trunk Number");
        }
        else
        {
            System.out.println ("Not Trunk Number");
        }
    }
}