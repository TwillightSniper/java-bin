import java.util.*;
class zippo
{
    public static void main (String arg[])
    {
        Scanner in= new Scanner (System.in);
        System.out.println ("Enter a Number");
        int m=in.nextInt();
        int c=0,cz=0,n=m,f,l,a;
        while(n!=0)
        {
            c++;
            a=n%10;
            if(a==0)
            {
                cz++;
            }
            n/=10;
        }
        f=m/(int)Math.pow(10,c-1);
        l=m%10;
        
        if(f!=0 && l!=0 && c-2==cz)
        {
         System.out.println ("is a Zippo number");
        }
        else
        {
         System.out.println ("is not a Zippo number"); 
        }
    }
}