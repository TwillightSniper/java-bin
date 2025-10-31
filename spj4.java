import java.util.*;
class spj4
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i,s=1;
        char ch;
        System.out.println("\n a. 1, 4, 9, 16, ");
        System.out.println("b. 1, 2, 4, 7, 11, ");
        System.out.println("Enter your choice");
        ch=in.next().charAt(0);
        switch(ch)
        {
            case 'a':
            for (i=1;i<=10;i++)
            {
                System.out.print(i*i+",");
            }
            break;
            case 'b':
            for (i=1;i<=10;i++)
            {
                System.out.print(s+",");
                s=s+i;
            }
            break;
            default:
                System.out.print("invalid choice");
        }
    }
}