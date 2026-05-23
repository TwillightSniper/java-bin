import java.util.*;
class st3pt2
{
    public static void main (String args[])
    {
        String st;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        String r= st.replace('e','*');
        System.out.println(r);
    }
}