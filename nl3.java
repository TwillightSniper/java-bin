class nl3
{
    public static void main (String args [])
    {
        int n,c1=0;
        for (n=1;c1<=50;n++)
        {
            int i,c=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.print(n+",");
                c1++;
            }
        }
    }
}