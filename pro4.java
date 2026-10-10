import java.util.*;

class pro4
{
    String a[] = new String[20];
    String name;
    int pos = -1;
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 20 names:");
        for(int i = 0; i < 20; i++)
            a[i] = in.nextLine();
        System.out.print("Enter name to be searched: ");
        name = in.nextLine();
    }
    void search()
    {
        for(int i = 0; i < 20; i++)
        {
            if(a[i].equalsIgnoreCase(name))
            {
                pos = i;
                break;
            }
        }
        if(pos != -1)
            System.out.println(name + " found at index position " + pos + ".");
        else
            System.out.println("Name not found");
    }
    public static void main(String args[])
    {
        pro4 ob = new pro4();
        ob.accept();
        ob.search();
    }
}