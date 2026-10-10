import java.util.*;

class ts8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = in.nextLine();

        int flag = 1;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(ch != ' ' && (int)ch % 2 == 0)
            {
                flag = 0;
                break;
            }
        }

        if(flag == 1)
            System.out.println("Odd Name");
        else
            System.out.println("Not an Odd Name");
    }
}