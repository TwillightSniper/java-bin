import java.util.*;

class array5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,i,num,r,d,count = 0;
        System.out.print("Enter the value of n: ");
        n = in.nextInt();
        int ar[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element " + i);
            ar[i]=in.nextInt();
            n=ar[i];
            r=0;
            while(n>0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if(r== ar[i])
                count++;
        }
        System.out.println("number of palindromes = " + count);
    }
}