import java.util.*;

class arr_vownames
{
    boolean isVow(char ch)
    {
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;
    }
    boolean isName(String s)
    {
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if(isVow(first) && isVow(last))
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        arr_vownames ob = new arr_vownames();
        String name;
        int c = 0;
        System.out.println("Enter names:");
        while(c < 5)
        {
            name = in.nextLine();
            if(ob.isName(name))
            {
                System.out.println("Valid name: " + name);
                c++;
            }
        }
        System.out.println("5 names have been found");
    }
}