import java.util.*;

class Library
{
    int acc_num;
    String title;
    String author;

    void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter accession number: ");
        acc_num = in.nextInt();

        in.nextLine();

        System.out.print("Enter title of book: ");
        title = in.nextLine();

        System.out.print("Enter name of author: ");
        author = in.nextLine();
    }

    void compute()
    {
        Scanner in = new Scanner(System.in);

        int days;
        double fine;

        System.out.print("Enter number of days late: ");
        days = in.nextInt();

        fine = days * 2;

        System.out.println("Fine = Rs. " + fine);
    }

    void display()
    {
        System.out.println("Accession Number\tTitle\t\tAuthor");
        System.out.println(acc_num + "\t\t\t" + title + "\t\t" + author);
    }

    public static void main(String args[])
    {
        Library ob = new Library();

        ob.input();
        ob.display();
        ob.compute();
    }
}