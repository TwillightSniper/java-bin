import java.util.*;
class primeNprime
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int n,i,ch;
       
       System.out.println("1> print all prime no");
       System.out.println("2> print all non prime no");
       System.out.println("Enter your choice:");
       ch=in.nextInt();
       
       for(n=1;n<=100;n++)
       {
           int c=0;
           for(i=1;i<=n;i++)
           {
               if(n%i==0)
                   c++;
           }
           if(ch==1 && c==2)
           {
               System.out.print(n+",");
           }
           else if(ch==2 && c!=2){
               System.out.print(n+",");
           }
       }
    }
}