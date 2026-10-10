import java.util.*;

class Qu6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n, temp, d, len, i;
        double sum, pow;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        temp = n;
        len = 0;
        while(temp > 0)
        {
            len++;
            temp = temp / 10;
        }
        temp = n;
        sum = 0;
        while(temp > 0)
        {
            d = temp % 10;
            pow = 1;
            for(i = 1; i <= len; i++)
                pow = pow * d;
            sum = sum + pow;
            temp = temp / 10;
        }
        if(sum == n)
            System.out.println("Special Armstrong Number");
        else
            System.out.println("Not a Special Armstrong Number");
    }
}