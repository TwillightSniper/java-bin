import java.util.Scanner;
class ParkingLot
{
    int vno;
    int hours;
    double bill;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        vno = in.nextInt();
        System.out.print("Enter Number of Hours Parked: ");
        hours = in.nextInt();
    }
    void calculate()
    {
        if (hours <= 1)
            bill = 3.0;
        else
            bill = 3.0 + (hours - 1) * 1.5;
    }
    void display()
    {
        System.out.println("Vehicle Number : " + vno);
        System.out.println("Hours Parked   : " + hours);
        System.out.println("Parking Charge : ₹" + bill);
    }
    public static void main(String args[])
    {
        ParkingLot ob = new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}