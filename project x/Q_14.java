import java.util.*;
class Q_14
{
    int perimeter (int s)
    {
        return 4*s;
    }
    int perimeter (int l , int b)
    {
        return 2*(l+b);
    }
    double perimeter (double r)
    {
        return 2*(22/7)*r;
    }
    public static void main ()
    {
        Scanner in = new Scanner (System.in);
        Q_14 ob = new Q_14 ();
        System.out.println ("enter s");
        int s = in.nextInt();
        System.out.println ("enter l");
        int l = in.nextInt();
        System.out.println ("enter b");
        int b = in.nextInt();
        System.out.println ("enter r");
        double r = in.nextDouble();
        System.out.println ("square:"+ob.perimeter(s));
        System.out.println ("rectangle:"+ob.perimeter(l,b));
        System.out.println ("circle:"+ob.perimeter(r));
    }
}