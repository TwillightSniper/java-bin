class rintCheck
{
   public static void main(String args[])
   {
       //System.out.println(Math.rint(1.5));
       int i;
       for(i=1;i<20;i++)
       {
           System.out.print(i+"="+Math.rint(i+0.5));
           if(Math.floor(i+0.5)==Math.rint(i+0.5))
               System.out.println("even");
           else
               System.out.println();
       }
   }
}