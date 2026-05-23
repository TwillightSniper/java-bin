class palsum2
{
    public static void main (String args [])
    {
        int n,s=0,i=0,d=0,r=0,c=0;
        while (c<=50)
        {
            n=i;
            d=0;r=0;
            while (n!=0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if (i==r)
            {
                c++;
                s=s+i;
            }
            i++;
        }
        System.out.println ("sum:"+s);
    }
}