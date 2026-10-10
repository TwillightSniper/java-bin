import java.util.*;

class Employee
{
    long e_id;
    String e_name;
    double e_basic,e_da,e_hra,e_interim,e_compen,e_med,e_pf,e_gross;

    void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        e_id = in.nextLong();

        in.nextLine();

        System.out.print("Enter Employee Name: ");
        e_name = in.nextLine();

        System.out.print("Enter Basic Salary: ");
        e_basic = in.nextDouble();
    }

    void calculate()
    {
        if(e_basic <= 20000)
        {
            e_da = e_basic * 80 / 100;
            e_hra = e_basic * 10 / 100;
            e_interim = e_basic * 5 / 100;
            e_compen = e_basic * 20 / 100;
            e_med = 200;
        }
        else if(e_basic <= 40000)
        {
            e_da = e_basic * 90 / 100;
            e_hra = e_basic * 15 / 100;
            e_interim = e_basic * 7 / 100;
            e_compen = e_basic * 35 / 100;
            e_med = 350;
        }
        else if(e_basic <= 60000)
        {
            e_da = e_basic * 110 / 100;
            e_hra = e_basic * 20 / 100;
            e_interim = e_basic * 9 / 100;
            e_compen = e_basic * 45 / 100;
            e_med = 500;
        }
        else
        {
            e_da = e_basic * 135 / 100;
            e_hra = e_basic * 25 / 100;
            e_interim = e_basic * 11 / 100;
            e_compen = e_basic * 55 / 100;
            e_med = 1000;
        }

        e_pf = e_basic * 12 / 100;

        e_gross = e_basic + e_da + e_hra + e_interim + e_compen + e_med;
    }

    void display()
    {
        double net;

        net = e_gross - e_pf;

        System.out.println("Employee ID: " + e_id);
        System.out.println("Employee Name: " + e_name);
        System.out.println("Basic Salary: Rs. " + e_basic);
        System.out.println("Gross Salary: Rs. " + e_gross);
        System.out.println("Provident Fund: Rs. " + e_pf);
        System.out.println("Net Salary: Rs. " + net);
    }

    public static void main(String args[])
    {
        Employee ob = new Employee();

        ob.input();
        ob.calculate();
        ob.display();
    }
}