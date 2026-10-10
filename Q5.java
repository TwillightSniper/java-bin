import java.util.*;

class Q5
{
    void number()
    {
        int a=0, b=0, c=1, d;

        System.out.println("First 10 terms of Tribonacci Series: ");

        System.out.println(a+" "+b+" "+c+" ");

        for(int i=4;i<=10;i++)
        {
            d=a+b+c;
            System.out.print(d+" ");

            a=b;
            b=c;
            c=d;
        }
    }

    void number(int n)
    {
        System.out.println("Square root of each digit:");

        while(n>0)
        {
            int d=n%10;
            System.out.println(d+" = "+Math.sqrt(d));
            n=n/10;
        }
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Q5 ob=new Q5();
        ob.number();
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        ob.number(n);
        }
    }
