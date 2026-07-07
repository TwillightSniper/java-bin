import java.util.*;
class pj9
{
    boolean ip(int n)
    {
        int c = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }

        return c == 2;
    }

    int rev (int n)
    {
        int r=0,a;
        while (n!=0)
        {
            a=n%10;
            r=r*10+a;
            n/=10;
        }
        return r;
    }

    public static void main(String args[])
    {
        pj9 ob = new pj9();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a Number");
        int i = in.nextInt();
        if(ob.ip(i) && ob.ip(ob.rev(i)))
        {
            System.out.println(i+" is a twisted prime");
        }
        else
        {
            System.out.println(i+" is not a twisted prime");
        }
    }
}