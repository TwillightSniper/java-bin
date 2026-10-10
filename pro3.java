import java.util.*;
class pro3
{
    String str, rev = "";
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();
    }
    void check()
    {
        for(int i = str.length() - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        if(str.equals(rev))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }
    public static void main(String args[])
    {
        pro3 ob = new pro3();
        ob.accept();
        ob.check();
    }
}