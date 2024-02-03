import java.util.*;
public class qb622 {
    public static void main(String[] args) {
        product[] obj=new product[5];

        for(int i=0;i<obj.length;i++)
        {
        obj [i]=new product();
        obj [i].set();
        obj[i].display();
        }
    }   
}
class product{
    int id;
    String name;
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr id and name");
        id=sc.nextInt();
        sc.nextLine();
        name=sc.next();

    }
    void display()
    {
        System.out.println("product id="+id);
        System.out.println("product name"+name);
    }

}



