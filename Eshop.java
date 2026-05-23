import java.util.*;
class Eshop
{
    double price;
    String name;
    void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter Name:");
        name=in.nextLine();
        System.out.println("Enter Price:");
        price = in.nextDouble();
    }
    void calculate()
    {
        double dr=0.0;
        if (price>=1000 && price<= 25000)
        {
            dr=0.95;
        }
        else if (price>=25001 && price<= 57000)
        {
            dr=0.925;
        }
        else if (price>=57001 && price<= 100000)
        {
            dr=0.9;
        }
        else
        {
            dr=0.85;
        }
        price = price * dr;
    }
    void display ()
    {
        accept();
        calculate();
        System.out.println ("Item name:"+name);
        System.out.println ("Net Amount to be Paid:"+price);
    }
    public static void main (String args[])
    {
        Eshop ob = new Eshop();
        ob.display();
    }
}
