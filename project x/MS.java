import java.util.*;

class MS
{
    void Magic(String str)
    {
        int flag = 0;
        
        str = str.toUpperCase();
        
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i+1) - str.charAt(i) == 1)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("It is a Magic String");
        else
            System.out.println("It is not a Magic String");
    }

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.next();
        MS ob = new MS();
        ob.Magic(str);
    }
}