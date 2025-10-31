class spj1
{
    public static void main (String args [])
    {
        int n,i;
        for(n=5;n<=10;n++)
        {
            System.out.println("table of "+n+":");
            for(i=1;i<=10;i++)
            {
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
    }
}