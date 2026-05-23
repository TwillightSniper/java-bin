class palsum
{
    public static void main (String args [])
    {
        int n,s=0,i=1,c=0,d,r;
        for(i=1;c<=50;i++)
        {
            n=i;
            d=0;r=0;
            while(n!=0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if(i==r)
            {
                s=s+i;
                c++;
            }
        }
    }
}