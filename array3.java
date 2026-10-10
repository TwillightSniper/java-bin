class array3
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        int i,t=0;
        double avg;
        for(i=0;i<a.length;i++)
        {
            t=t+a[i];
        }
        avg = t/5.0;
        System.out.println("Total="+t);
        System.out.println("Average="+avg);
    }
}