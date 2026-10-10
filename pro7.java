import java.util.*;

class pro7
{
    int a[] = new int[10];
    int max, min, maxPos, minPos;

    void accept()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++)
            a[i] = in.nextInt();
    }

    void calculate()
    {
        max = min = a[0];
        maxPos = minPos = 0;

        for(int i = 1; i < 10; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
                maxPos = i;
            }

            if(a[i] < min)
            {
                min = a[i];
                minPos = i;
            }
        }
    }

    void display()
    {
        System.out.println("Array:");
        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nLargest element = " + max);
        System.out.println("Index position = " + maxPos);
        System.out.println("Smallest element = " + min);
        System.out.println("Index position = " + minPos);
    }

    public static void main(String args[])
    {
        pro7 ob = new pro7();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}