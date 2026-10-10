class array4
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int i,j,c,c1 = 0;
        for(i=0;i<a.length;i++)
        {
            c=0;
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    c++;
            }
            if(c==2)
                c1++;
        }
        System.out.println("Number of prime numbers ="+ c1);
    }
}