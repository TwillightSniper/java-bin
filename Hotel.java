import java.util.*;

class Hotel
{
    String name;
    long mobno;
    int days, bill;

    void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        name = in.nextLine();

        System.out.println("Enter Mobile Number:");
        mobno = in.nextLong();

        System.out.println("Enter Number of Days Stayed:");
        days = in.nextInt();
    }

    void charge()
    {
        if(days <= 3)
        {
            bill = days * 1000;
        }
        else if(days <= 7)
        {
            bill = (3 * 1000) + ((days - 3) * 900);
        }
        else
        {
            bill = (3 * 1000) + (4 * 900) + ((days - 7) * 800);
        }

        bill = bill + (bill * 18 / 100);
    }

    void print()
    {
        input();
        charge();

        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Bill: " + bill);
    }

    public static void main(String args[])
    {
        Hotel ob = new Hotel();
        ob.print();
    }
}