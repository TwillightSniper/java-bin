import java.util.*;
class income_tax
{
    double i,tax=0.0;
    void accept ()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter income");
        i = in.nextDouble();
    }
    double Calc()
    {
        if (i<=400000)
        {
            tax=0;
        }
        else if (i>400000 && i<=800000)
        {
            tax= i*(5/100.0);
        }
        else if (i>800000 && i<=1200000)
        {
            tax= i*(10/100.0);
        }
        else if (i>1200000 && i<=1600000)
        {
            tax= i*(15/100.0);
        }
        else if (i>1600000 && i<=2000000)
        {
            tax= i*(20/100.0);
        }
        else if (i>2000000 && i<=2400000)
        {
            tax= i*(25/100.0);
        }
        else
        {
            tax= i*(30/100.0);
        }
        return tax;
    }
    void check ()
    {
        i=i-75000;
        Calc();
        if (i<1200000)
        {
            display ();
            System.out.println ("no tax");
        }
        else
        {
            display ();
            System.out.println("amount to be paid:"+tax);
        }
    }
    void display ()
    {
        System.out.println("income:"+i);
        System.out.println("gross tax:"+tax);
    }
    public static void main ()
    {
        income_tax ob = new income_tax ();
        ob.accept();
        ob.check();
    }
}