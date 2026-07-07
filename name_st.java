import java.util.*;
class name_st
{
    public static void main (String args [])
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Name 1:"); 
       String name1 = in.nextLine();
       System.out.println("Enter Name 2:"); 
       String name2 = in.nextLine();
       int space1 = name1.indexOf(' ');
       String f1 = name1.substring(0,space1);
       String t1 = name1.substring(space1);
       int space2 = name2.indexOf(' ');
       String f2 = name2.substring(0,space2);
       String t2 = name2.substring(space2);
       name1=f1+" "+t2;
       name2=f2+" "+t1;
       System.out.println(name1);
       System.out.println(name2);
    }
}