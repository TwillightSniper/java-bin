import java.util.*;

class pro9
{
    int a[] = new int[10];

    void accept()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++)
            a[i] = in.nextInt();
    }

    void display()
    {
        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    void sort()
    {
        int max, temp;

        for(int i = 0; i < 9; i++)
        {
            max = i;

            for(int j = i + 1; j < 10; j++)
            {
                if(a[j] > a[max])
                    max = j;
            }

            temp = a[i];
            a[i] = a[max];
            a[max] = temp;
        }
    }

    public static void main(String args[])
    {
        pro9 ob = new pro9();
        ob.accept();

        System.out.println("Array before sorting:");
        ob.display();

        ob.sort();

        System.out.println("Array after sorting:");
        ob.display();
    }
}