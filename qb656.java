import java.util.*;
public class qb656 {
    public static void main(String[] args) {
        {
            distance d1=new distance();
            distance d2=new distance();
            d1.get();
            d2.get();

            distance d3=new distance();
            d3=d1.add(d1,d2);
            d3.show(d3.km,d3.m);
        }
    }
}
class distance
{
    int km,m;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in km");
        km=sc.nextInt();
        System.out.println("enter distance in meter");
        m=sc.nextInt();
    }
    distance add(distance c1,distance c2)
    {
       distance c3=new distance(); 
        c3.m=c1.m+c2.m;
        c3.km=(c1.km+c2.km)+(c3.m/1000);
        c3.m=c3.m%1000;
        return c3;
    }
    void show(int a,int b)
    {
        System.out.println("total distance="+a+"."+b);
    }

}