class nl2
{
    public static void main (String args [])
    {
        int n;
        for (n=100;n<=999;n++)
        {
            int m=n,a,s=0;
            while(m!=0)
            {
                a=m%10;
                s=s+a*a*a;
                m=m/10;
            }
            if (s==n)
            {
                System.out.println (n+",");
            }
        
        }
    }
}