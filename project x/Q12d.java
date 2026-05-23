class Q12d
{
    public static void main()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            System.out.print((char)('A'+j) + "*");
            System.out.println();
        }
    }
}