import java.util.*;

class ts9
{
    String num;
    String name;
    int km;
    double fare;

    ts9(String n, String nm, int k)
    {
        num = n;
        name = nm;
        km = k;
        fare = 0;
    }

    void calcFare()
    {
        if(km <= 10)
            fare = km * 5;
        else if(km <= 20)
            fare = 50+(km-10)* 10;
        else if(km <= 30)
            fare = 150+(km-20) * 15;
        else if(km <= 40)
            fare = 300+(km-30) * 20;
        else
            fare = 500+(km-40) * 25;
    }

    void show()
    {
        System.out.println("Bus No\tName\tKms Travelled\tFare");
        System.out.println(num + "\t" + name + "\t" + km + "\t\t" + fare);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String num, name;
        int km;

        System.out.print("Enter bus number: ");
        num = in.nextLine();

        System.out.print("Enter passenger name: ");
        name = in.nextLine();

        System.out.print("Enter kilometres travelled: ");
        km = in.nextInt();

        ts9 ob = new ts9(num, name, km);

        ob.calcFare();
        ob.show();
    }
}