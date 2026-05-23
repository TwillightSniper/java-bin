import java.util.*;
class st5
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,p,uc=0,lc=1;
        String st;
        char ch;
        System.out.println ("Enter a string");
        st=in.nextLine();
        p=st.length();
        for (a=0;a<p;a++)
        {
            ch=st.charAt(a);
            if (ch>='A'&& ch<='Z')
            uc=uc+1;
            if (ch>='a'&& ch<= 'z')
            lc=lc+1;
        }
        System.out.println ("Number of uppercase letters:"+uc);
        System.out.println ("Number of lowercase letters:"+lc);
        if (uc==lc)
            System.out.println (st+"is a Super string");
        else
        System.out.println (st+"is not a Super string");
    }
}