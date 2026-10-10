import java.util.*;

class Q7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = in.nextInt();

        int num = n * 1000000 + (n * 2) * 1000 + (n * 3);

        boolean flag = true;
        int c = 0;

        while(num > 0)
        {
            int d = num % 10;

            if(d == 0)
            {
                flag = false;
                break;
            }

            int temp = num / 10;

            while(temp > 0)
            {
                if(d == temp % 10)
                {
                    flag = false;
                    break;
                }
                temp = temp / 10;
            }

            if(flag == false)
                break;

            c++;
            num = num / 10;
        }

        if(flag && c == 9)
            System.out.println("Fascinating Number");
        else
            System.out.println("Not a Fascinating Number");
    }
}