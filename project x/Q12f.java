class Q12f
{
    public static void main()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
            if(j<5-i)
             System.out.print((char)('A'+j));
            else
            System.out.print((char)('A'+(j-(5-i))));
            }
            System.out.println();
        }
    }
}