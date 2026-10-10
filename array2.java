class array2
{
    public static void main(String args[])
    {
        int m[]={79,27,35,50,70,90,99,80,82,03};
        int e=0, o=0, i;

        for(i=0; i<m.length; i++)
        {
            if(m[i]%2==0)
                e++;
            else
                o++;
        }

        System.out.println("No. of evens = " + e);
        System.out.println("No. of odds = " + o);
    }
}