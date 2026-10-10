import java.util.*;

class Q4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = in.nextLine();

        s = s + " ";

        String w="", maxw="";
        int c=0, max=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                w=w+ch;

                if("AEIOUaeiou".indexOf(ch)!=-1)
                    c++;
            }
            else
            {
                if(c>max)
                {
                    max=c;
                    maxw=w;
                }

                w="";
                c=0;
            }
        }

        System.out.println("Word with maximum vowels: "+maxw);
    }
}