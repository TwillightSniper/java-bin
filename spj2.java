import java.util.*;
class spj2
{
    public static void main(String args [])
    {
        Scanner in = new Scanner (System.in);
        int ch,i;
        System.out.println("1.  print z to a");
        System.out.println("2.  print A to Z");
        System.out.println("Enter your choice");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            for (i=122;i>=97;i--)
            {
                System.out.print((char)i+",");
            }
            break;
            case 2:
            for (i=65;i<=90;i++)
            {
                System.out.print((char)i+",");
            }
            break;
        }
    }
}