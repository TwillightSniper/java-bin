import java.util.*;
class pro1
{
    int cal (int n)
    {
        int ld = n%10;
        int fd=0;
        while (n!=0)
        {
            int a=n%10;
            n=n/10;
            if (n==0)
            {
                fd = a;
            }
        }
        int sum = fd+ld;
        return sum;
    }
    void display()
    {
        Scanner in = new Scanner (System.in);
        for(int i= 1;i<=10;i++)
        {
            int n= in.nextInt();
            System.out.println("Number:"+n);
            System.out.println("Sum:"+cal(n));
        }
    }
    public static void main (String args[])
    {
        pro1 ob = new pro1();
        ob.display();
    }
}