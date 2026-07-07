import java.util.*;
class FruitJuice
{
    int product_code,pack_size,product_price;
    String flavour,pack_type;
    FruitJuice()
    {
        product_code = 0;
        pack_size = 0;
        product_price =0;
        flavour = "";
        pack_type = "";
    }
    void input()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter Product code:");
        product_code = in.nextInt();
        System.out.println ("Enter Pack size:");
        pack_size = in.nextInt();
        System.out.println ("Enter Product Price:");
        product_price = in.nextInt();
        in.nextLine();
        System.out.println ("Enter Flavour:");
        flavour = in.nextLine();
        System.out.println ("Enter Pack Type:");
        pack_type = in.nextLine();
    }
    void discount()
    {
        product_price =(product_price * 90)/100;
    }
    void display()
    {
        input();
        discount();
        System.out.println ("Product code:"+product_code);
        System.out.println ("Pack size:"+pack_size);
        System.out.println ("Product Price:"+product_price);
        System.out.println ("Flavour:"+flavour);
        System.out.println ("Pack Type:"+pack_type);
    }
    public static void main (String args [])
    {
        FruitJuice f = new FruitJuice ();
        f.display();
    }
}
