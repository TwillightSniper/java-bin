import java.util.*;

class Q6
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        int a = (int)ch;
        System.out.println("ASCII Code = " + a);

        int rev = 0;
        while(a>0)
        {
            rev = rev*10 + a%10;
            a /= 10;
        }
        System.out.println("Reverse: " + rev);
        char ch2 = (char)rev;
        System.out.println("Equivalent character: " + ch2);

    }
}