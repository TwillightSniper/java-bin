import java.util.*;
class spj11
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i,j,c=1;
        System.out.println("a or b");
        char ch = in.next().charAt(0);
        switch (ch)
        {
            case 'a':
                for(i=1;i<=4;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(c);
                        c++;
                    }
                    System.out.println();
                }
            break;
            case 'b':
               for(i=5;i>=2;i--)
                {
                    for(j=i;j<=5;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            break;
        }
    }
}
