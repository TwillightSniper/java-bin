import java.util.*;
class vol
{
    void volume (int s)
    {
        int vol=s*s*s;
        System.out.println("Volume of cube:"+vol);
    }
    void volume (int l,int b,int h)
    {
        int vol = l*b*h;
        System.out.println("Volume of cube:"+vol);
    }
    void volume (double r)
    {
        double vol = (4.0/3)*(22/7)*r*r*r;
        System.out.println("Volume of sphere:"+vol);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        vol ob = new vol();
        System.out.println ("1.Cube");
        System.out.println ("2.Cuboid");
        System.out.println ("3.Sphere");
        System.out.println ("Enter choice:");
        int ch = in.nextInt();
        switch (ch)
        {
            case 1:
            System.out.println ("Enter side:");
            int s = in.nextInt();
            ob.volume(s);
            break;
            case 2:
            System.out.println ("Enter length:");
            int l = in.nextInt();
            System.out.println ("Enter breadth:");
            int b = in.nextInt();
            System.out.println ("Enter height:");
            int h = in.nextInt();
            ob.volume(l,b,h);
            break;
            case 3:
            System.out.println ("Enter radius:");
            double r = in.nextDouble();
            ob.volume(r);
            break;
            default:
            System.out.println ("Invaild Choice");
        }
    }
}