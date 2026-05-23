import java.util.*;

class Q8
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);

        int sum = 0, pro = 1;

        for(int i=1;i<=10;i++)
        {
            int n = in.nextInt();
            sum += n;
            pro *= n;
        }
        String result = "" + sum + pro;
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + pro);
        System.out.println("Concatenated = " + result);
    }
}