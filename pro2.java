import java.util.*;
class pro2
{
    String str;

    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        str = in.nextLine();
    }

    void display()
    {
        String word = "";

        System.out.print("Output: ");

        for(int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
                word = ch + word;
            else
            {
                System.out.print(word + " ");
                word = "";
            }
        }
        System.out.print(word);
    }
    public static void main(String args[])
    {
        pro2 ob = new pro2();
        ob.accept();
        ob.display();
    }
}