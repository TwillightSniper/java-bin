import java.util.*;
class st2
{
    public static void main(String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,b,v=0;
        String st;
        char ch;
        System.out.println ("Enter a string:");
        st=in.nextLine();
        b=st.length();
        for (a=0;a<b;a++)
        {
            ch=st.charAt(a);
            if ("AEIOUaeiou".indexOf(ch)>0)
            v=v+1;
        }
        System.out.print("The number of vowels in the String:"+v);
    }
}