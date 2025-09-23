import java.util.*;
class p10
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a,o=0,e=0;
        while (n!=0)
        {
            a=n%10;
            if (a%2==0)
            {
                e=e+a;
            }
            else
            {
                o=o+a;
            }
            n=n/10;
        }
        if (e==o)
        {
            System.out.println ("the number is a lead number");
        }
        else
        {
            System.out.println ("the number is not a lead number");
        }
    }
}