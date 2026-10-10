import java.util.*;

class CaesarCipher
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String str = in.nextLine();

        System.out.print("Enter the shift value: ");
        int n = in.nextInt();

        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                ch = (char)('A' + (ch - 'A' + n) % 26);

            else if(ch >= 'a' && ch <= 'z')
                ch = (char)('a' + (ch - 'a' + n) % 26);

            result += ch;
        }

        System.out.println("Caesar Cipher: " + result);
    }
}