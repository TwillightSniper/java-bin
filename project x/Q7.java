import java.util.*;

class Q7
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = in.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            ch = Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("ASCII value = " + (int)ch);
        else
            System.out.println("Not a lowercase vowel");
    }
}