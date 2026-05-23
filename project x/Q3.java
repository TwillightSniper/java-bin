import java.util.*;
class Q3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ch;
        double p, i, y, m, t, A;

        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.print("Enter your choice: ");
        ch = in.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Enter Principal: ");
                p = in.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                i = in.nextDouble();
                System.out.print("Enter Time (years): ");
                y = in.nextDouble();

                A = p * Math.pow((1 + i / 100), y);
                System.out.println("Maturity Amount = " + A);
                break;

            case 2:
                System.out.print("Enter Monthly Installment: ");
                m = in.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                i = in.nextDouble();
                System.out.print("Enter Time (months): ");
                t = in.nextDouble();

                A = m * t + (m * t * (t + 1) / 2) * (i / 100) * (1.0 / 12);
                System.out.println("Maturity Amount = " + A);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
