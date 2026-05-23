import java.util.*;

class CabService
{
    String carType;
    double km, bill;

    CabService()
    {
        carType = "";
        km = 0.0;
        bill = 0.0;
    }

    void accept()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Car Type (AC/NON AC):");
        carType = in.nextLine();

        System.out.println("Enter Kilometer Travelled:");
        km = in.nextDouble();
    }

    void calculate()
    {
        if(carType.equalsIgnoreCase("AC"))
        {
            if(km <= 5)
            {
                bill = 150;
            }
            else
            {
                bill = 150 + ((km - 5) * 10);
            }
        }
        else
        {
            if(km <= 5)
            {
                bill = 120;
            }
            else
            {
                bill = 120 + ((km - 5) * 8);
            }
        }
    }

    void display()
    {
        accept();
        calculate();

        System.out.println("CAR TYPE: " + carType);
        System.out.println("KILOMETER TRAVELLED: " + km);
        System.out.println("TOTAL BILL: " + bill);
    }

    public static void main(String args[])
    {
        CabService ob = new CabService();
        ob.display();
    }
}