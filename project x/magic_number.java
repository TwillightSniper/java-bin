import java.util.*;
class magic_number
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        int s,d;
        while (n>9)
        {
            s=0;d=0;
            while (n!=0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
            n=s;
        }
        if (n==1)
        {
            System.out.println ("Magic number");
        }
        else
        {
            System.out.println (" Not Magic number");
        }
    }
}