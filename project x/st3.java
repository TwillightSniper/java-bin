import java.util.*;
class st3
{
    public static void main (String args[])
    {
        int a,p;
        String st;
        char ch;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        p=st.length();
        System.out.println ("The output");
        for (a=0;a<p;a++)
        {
            ch=st.charAt(a);
        if (ch=='e')
        {
            ch='*';
        }
        System.out.print(ch);
        }
        System.out.println();
    }
}
