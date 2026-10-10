import java.util.*;

class arr_Q6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int roll[] = new int[20];
        String name[] = new String[20];
        int marks[][] = new int[20][6];
        double percentage[] = new double[20];
        char grade[] = new char[20];
        for(int i = 0; i < 20; i++)
        {
            System.out.println("details of student " + (i + 1));
            System.out.print("Roll No: ");
            roll[i] = in.nextInt();
            System.out.print("Name: ");
            name[i] = in.next();
            int sum = 0;
            System.out.println("Enter marks in 6 subjects:");
            for(int j = 0; j < 6; j++)
            {
                marks[i][j] = in.nextInt();
                sum = sum + marks[i][j];
            }
            percentage[i] = sum / 6.0;
            if(percentage[i] >= 80)
                grade[i] = 'A';
            else if(percentage[i] >= 60)
                grade[i] = 'B';
            else if(percentage[i] >= 40)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }
        System.out.println("Roll No.\tName\tPercentage\tGrade");
        for(int i = 0; i < 100; i++)
        {
            System.out.println(roll[i] + "\t\t" + name[i] + "\t" + percentage[i] + "\t\t" + grade[i]);
        }
    }
}