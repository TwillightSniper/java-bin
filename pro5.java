import java.util.*;
class pro5
{
    int a[] = new int[15];
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 15 integers:");
        for(int i = 0; i < 15; i++)
            a[i] = in.nextInt();
    }
    void display()
    {
        System.out.println("Original array:");
        for(int i = 0; i < 15; i++)
            System.out.print(a[i] + " ");
    }
    void sort()
    {
        int temp;
        for(int i = 0; i < 14; i++)
        {
            for(int j = 0; j < 14 - i; j++)
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
    void displaySorted()
    {
        System.out.println("\nSorted array:");
        for(int i = 0; i < 15; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String args[])
    {
        pro5 ob = new pro5();
        ob.accept();
        ob.display();
        ob.sort();
        ob.displaySorted();
    }
}