import java.util.*;
class Q4ii
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int bin, d, dec = 0, p = 0;

        System.out.print("Enter binary number: ");
        bin = in.nextInt();

        while(bin > 0)
        {
            d = bin % 10;
            dec += d * Math.pow(2, p);
            p++;
            bin /= 10;
        }

        System.out.println("Decimal equivalent = " + dec);
    }
}
