import java.util.*;
class arr_Q5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        String name[] = new String[n];
        int tm[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter name: ");
            name[i] = in.next();
            System.out.print("Enter total marks: ");
            tm[i] = in.nextInt();
            sum = sum + tm[i];
        }
        double avg = (double)sum / n;
        System.out.println("average = " + avg);
        for(int i = 0; i < n; i++)
        {
            double d = tm[i] - avg;
            System.out.println(name[i] + " = " + d);
        }
    }
}