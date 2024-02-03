import java.util.*;

public class qb624{

    int id;Double balance;String name;
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       bank[] b=new bank[2];

       for(int i=0;i<b.length;i++)
       {
        b[i]=new bank();
        b[i].getdata();

       }
       for(int i=0;i<b.length;i++)
       {
        b[i].display();
       }
       bank p=new bank();
       int x=p.search();
       for(int i=0;i<b.length;i++)
       {
        if(x==b[i].id)
       {
        b[i].display();
        break;
       }
    }
}

class bank
    {
    void getdata()
    {
        System.out.println("enetr id");
        id =sc.nextInt();
        sc.nextLine();
        System.out.println("enter bank ballance");
        balance=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter name:");
        name=sc.nextLine();
    }
    void display()
    {
        System.out.println("id is="+id);
        System.out.println("bank ballance is"+balance);
        System.out.println("name is="+name);
    }
    int search()
    {
    System.out.println("enter id you want to search");
    int search=sc.nextInt();
    return search;
    }
}
