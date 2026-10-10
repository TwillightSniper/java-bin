import java.util.*;

class pro8
{
    int a[] = new int[20];
    int even = 0, odd = 0;

    void accept()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 20 integers:");
        for(int i = 0; i < 20; i++)
            a[i] = in.nextInt();
    }

    void calculate()
    {
        System.out.print("Even elements: ");

        for(int i = 0; i < 20; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i] + " ");
                even++;
            }
        }

        System.out.print("\nOdd elements: ");

        for(int i = 0; i < 20; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i] + " ");
                odd++;
            }
        }

        System.out.println();
        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);
    }

    public static void main(String args[])
    {
        pro8 ob = new pro8();
        ob.accept();
        ob.calculate();
    }
}