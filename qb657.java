import java.util.*;

public class qb657 {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("enter hour for time 1:");
        int hr1=sc.nextInt();
        System.out.println("ennter min for time 1");
        int min1=sc.nextInt();
        System.out.println("enter hour for timwe 2:");
        int hr2=sc.nextInt();
        System.out.println("enter minut for time 2:");
        int min2=sc.nextInt();
        
        
        time t1=new time();
        time t2=new time();
        t1.sum(hr1,min1);
        t2.sum(hr2,min2);
        time t3=new time();
        t3.sum(t1,t2);
        t3.display();
    }

}
class time
{
    int hr,min;
    void sum(int x,int y)
    {
        hr=x;
        min=y;
    }
    void sum(time obj1,time obj2)
    {
      min=obj1.min+obj2.min;
      hr=(obj1.hr+obj2.hr)+(min/60);
      min=min%60;  
    }
    void display()
    {
        System.out.println("total time="+hr+":"+min);
    }
}