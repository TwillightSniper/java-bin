import java.util.*;
class pearre_partners
{
    int digit(int n)
    {
        int a,c=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    int FirstDigit(int n)
    {
        int c=digit(n);
        int fd=n/(int)Math.pow(10,c-1);
        return fd;
    }
    int LastDigit(int n)
    {
        return n%10;
    }
    public static void main (String args[])
    {
          pearre_partners ob= new pearre_partners();
          
          int m=567,n=75;
          
          int f1=ob.FirstDigit(m);
          int f2=ob.FirstDigit(n);
          int l1=ob.LastDigit(m);
          int l2=ob.LastDigit(n);
          
          if(f1==l2 && f2==l1)
          {
              System.out.println("pearre_partners");
          }
          else
              System.out.println("not pearre_partners");
          
          
    }
}