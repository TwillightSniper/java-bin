import java.util.*;
class cyclo 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = n;

        int last = n % 10;
        while (n >= 10) 
        {
             n =n/10; 
             
        }
        int first = n;

        if (first == last)
            System.out.println(t + " is Cyclo");
        else
            System.out.println(t + " is not Cyclo");
    }
}
