import java.util.*;

class pro6
{
    int a[] = new int[20];
    int n;

    void accept()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 20 integers:");
        for(int i = 0; i < 20; i++)
            a[i] = in.nextInt();

        System.out.print("Enter number to be searched: ");
        n = in.nextInt();
    }

    void sort()
    {
        int temp;

        for(int i = 0; i < 19; i++)
        {
            for(int j = 0; j < 19 - i; j++)
            {
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void search()
    {
        int l = 0, u = 19, mid;
        boolean found = false;

        while(l <= u)
        {
            mid = (l + u) / 2;

            if(a[mid] == n)
            {
                System.out.println(n + " found at position " + (mid + 1) + ".");
                found = true;
                break;
            }
            else if(n > a[mid])
                l = mid + 1;
            else
                u = mid - 1;
        }

        if(found == false)
            System.out.println("Element not found");
    }

    void display()
    {
        System.out.println("Sorted array:");
        for(int i = 0; i < 20; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        pro6 ob = new pro6();
        ob.accept();
        ob.sort();
        ob.display();
        ob.search();
    }
}