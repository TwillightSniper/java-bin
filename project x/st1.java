import java.util.*;
class st1
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,b;
        String st;
        System.out.println ("Enter word in upper case:");
        st=in.next();
        b=st.length();
        System.out.println ("pattern:");
        for (a=0;a<b;a++)
        {
            System.out.println (st.charAt (a));
        }
    }  
}
