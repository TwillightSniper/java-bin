import java.util.*;

class array_marks
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i;
        int m[] = new int[20];
        int t = 0;
        double avg;
        for(i = 0; i < m.length; i++)
        {
            System.out.println("Enter marks");
            m[i] = in.nextInt();
        }
        for(i = 0; i < m.length; i++)
        {
            t = t + m[i];
        }
        avg = (double) t / m.length;
        System.out.println("Total marks = " + t);
        System.out.println("Average marks = " + avg);
    }
}