class test1
{
    public static void main (String args [])
    {
        int i,j,c=15;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
               
                System.out.print(c+" "); 
                c--;
            }
            System.out.println();
        }
    }
}