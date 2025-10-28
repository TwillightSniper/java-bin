class pat1
{
    public static void main (String args [])
    {
        int i,j;
        
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                if (j%2==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}