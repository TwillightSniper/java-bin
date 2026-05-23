import java.util.*;
class st4
{
    public static void main (String args [])
    {
        int a,i,p;
        String st,st1="";
        char ch,ch1;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string:");
        st=in.nextLine();
        p=st.length();
        for (a=0;a<p;a++)
        {
            ch=st.charAt(a);
            if (ch>='a'&& ch<='z')
            {
                ch1 = Character.toUpperCase(ch);
                st1=st1+ch1;
            }
            else if (ch>='A' && ch<='Z')
            {
                ch1=Character.toLowerCase(ch);
                st1=st1+ch1;
            }
            else
            {
                st1=st1+ch;
            }
        }
        System.out.println("the new string after converting the case of letter:");
        System.out.println(st1);
    }
}