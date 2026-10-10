import java.util.*;
class StringCheck
{
    String str;
    int v, c, d, s;
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();
    }
    void check()
    {
        v = c = d = s = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = Character.toUpperCase(str.charAt(i));
            if(ch >= 'A' && ch <= 'Z')
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    v++;
                else
                    c++;
            }
            else if(ch >= '0' && ch <= '9')
                d++;
            else
                s++;
        }
    }
    void display()
    {
        System.out.println("Original String: " + str);
        System.out.println("Number of vowels = " + v);
        System.out.println("Number of consonants = " + c);
        System.out.println("Number of digits = " + d);
        System.out.println("Number of special characters = " + s);
    }
    public static void main(String args[])
    {
        StringCheck ob = new StringCheck();
        ob.accept();
        ob.check();
        ob.display();
    }
}

