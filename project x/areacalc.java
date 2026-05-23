import java.util.*;

class areacalc
{
    void area(int ch)
    {
        Scanner in = new Scanner(System.in);
        
        if(ch == 1)
        {
            System.out.print("Enter radius: ");
            double r = in.nextDouble();
            double area = (22.0/7) * r * r;
            System.out.println("Area of Circle = " + area);
        }
        
        else if(ch == 2)
        {
            System.out.print("Enter side: ");
            double s = in.nextDouble();
            double area = s * s;
            System.out.println("Area of Square = " + area);
        }
        
        else if(ch == 3)
        {
            System.out.print("Enter length: ");
            double l = in.nextDouble();
            System.out.print("Enter breadth: ");
            double b = in.nextDouble();
            double area = l * b;
            System.out.println("Area of Rectangle = " + area);
        }
        
        else
        {
            System.out.println("Invalid choice");
        }
    }

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.print("Enter choice: ");
        int ch = in.nextInt();
        areacalc ob = new areacalc();
        ob.area(ch);
    }
}