import java.util.*;
class spj1
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n,i;
        System.out.println("enter a number");
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}