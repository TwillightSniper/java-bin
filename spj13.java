class spj13
{
    public static void main (String args [])
    {
        int n,i;
        for (n=1;n<=1000;n++)
        {
            int s=0;
            for (i=1;i<n;i++)
            {
                if (n%i==0)
                {
                    s=s+i;
                }
            }
            if (s==n)
            {
                System.out.println(n+",");
            }
        }
    }
}