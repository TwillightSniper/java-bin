class tp
{
    boolean ip(int n)
    {
        int c = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }

        return c == 2;
    }

    public static void main(String args[])
    {
        tp ob = new tp();

        for(int i = 2; i <= 1000; i++)
        {
            if(ob.ip(i) && ob.ip(i + 2))
            {
                System.out.println(i + "," + (i + 2));
            }
        }
    }
}