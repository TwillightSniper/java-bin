import java.util.*;

class Qu8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name;
        int i, ascii;
        boolean flag = true;
        System.out.print("Enter a name: ");
        name = in.nextLine();
        for(i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) != ' ')
            {
                ascii = (int)name.charAt(i);
                if(ascii % 2 == 0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Odd Name");
        else
            System.out.println("Not an Odd Name");
    }
}