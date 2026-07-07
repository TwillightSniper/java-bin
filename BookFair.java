import java.util.*;

class BookFair
{
    String Bname;
    double price;
    BookFair()
    {
        Bname = "";
        price = 0.0;
    }
    void Input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        Bname = in.nextLine();
        System.out.print("Enter the price of the book: ");
        price = in.nextDouble();
    }
    void calculate()
    {
        double discount;
        if (price <= 1000)
            discount = price * 0.98;
        else if (price <= 3000)
            discount = price * 0.90;
        else
            discount = price * 0.85;
        price = discount;
    }
    void display()
    {
        System.out.println("Book Name : " + Bname);
        System.out.println("Price after Discount : ₹" + price);
    }
    public static void main(String args[])
    {
        BookFair ob = new BookFair();
        ob.Input();
        ob.calculate();
        ob.display();
    }
}