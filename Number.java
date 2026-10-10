import java.util.*;

class Number
{
    int num;

    void take()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();
    }

    int maxDigit()
    {
        int n = num;
        int digit;
        int max = 0;

        while(n > 0)
        {
            digit = n % 10;

            if(digit > max)
                max = digit;

            n = n / 10;
        }

        return max;
    }

    void disp()
    {
        System.out.println("Maximum digit = " + maxDigit());
    }

    public static void main(String args[])
    {
        Number ob = new Number();

        ob.take();
        ob.disp();
    }
}