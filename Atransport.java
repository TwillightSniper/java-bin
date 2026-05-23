import java.util.*;
class Atransport
{
    int w,charge;
    String name;
    void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter Name:");
        name=in.nextLine();
        System.out.println("Enter weight:");
        w = in.nextInt();
    }
    void calculate()
    {
        int tw =w;
        if (tw <= 10)
        {
            charge = tw * 25;
        }
        else if (tw <= 30 && tw > 10)
        {
            charge = (10*25)+(tw-10)*20;
        }
        else
        {
            charge = (10*25)+(20*20)+((tw-30)*10);
        }
    }
    void print ()
    {
        accept();
        calculate();
        System.out.println ("Name\t    Weight \t Bill amount");
        System.out.println (name+"\t\t"+w+"\t\t\t     "+charge);
    }
    public static void main (String args[])
    {
        Atransport ob = new Atransport();
        ob.print();
    }
}
