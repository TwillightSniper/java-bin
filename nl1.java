class nl1
{
    public static void main (String args [])
    {
        int n;
        for (n=1;n<=100;n++)
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
            }
        }
    }
}