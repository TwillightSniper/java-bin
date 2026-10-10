import java.util.*;

class movieMagic
{
    int year;
    String title;
    float rating;

    void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year of release: ");
        year = in.nextInt();

        in.nextLine();

        System.out.print("Enter title of movie: ");
        title = in.nextLine();

        System.out.print("Enter rating: ");
        rating = in.nextFloat();
    }

    void display()
    {
        System.out.println("Movie Title: " + title);

        if(rating >= 0.0 && rating <= 2.0)
            System.out.println("Flop");
        else if(rating >= 2.1 && rating <= 3.4)
            System.out.println("Semi-hit");
        else if(rating >= 3.5 && rating <= 4.5)
            System.out.println("Hit");
        else if(rating >= 4.6 && rating <= 5.0)
            System.out.println("Superhit");
    }

    public static void main(String args[])
    {
        movieMagic ob = new movieMagic();

        ob.input();
        ob.display();
    }
}