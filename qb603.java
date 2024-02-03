import java.util.*;
public class qb603
{
    void area(double x)
    {
        double z=3.14*x*x;
        System.out.println("area of circle"+z);
    }
    void area(double x,double y)
    {
        System.out.println("area of rectangle"+x*y);
    }
    void area(long x,long y)
    {
        System.out.println("area of triangle"+0.5*x*y);
    }
}
class overload
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        qb603 t=new qb603();
        boolean b=true;
        while(b)
        {
            System.out.println("choose option");
            System.out.println("1.claculate area of circle");
            System.out.println("2.calculate area of rectangle");
            System.out.println("3.calculate area of triangle");
            System.out.println("4.exits");
            System.out.print("enetr choice");
            int m=sc.nextInt();

            switch(m)
            {
                case 1:System.out.println("enetr radius:");
                t.area(sc.nextDouble());

                break;

                case 2: System.out.println("enetr length and width");
                t.area(sc.nextDouble(),sc.nextDouble());
                break;

                case 3:System.out.println("enetr base and height");
                t.area(sc.nextLong(),sc.nextLong());

                case 4: b=false;
                System.out.println("enter vaild option");
                break;
            }
        }
    }
}
