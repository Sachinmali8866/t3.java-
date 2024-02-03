import java.util.*;

public class qb548 {

    Scanner sc=new Scanner(System.in);
    
    void sum()
    {
        System.out.println("lets do addition");
        System.out.println("enetr value 1:");
        int a=sc.nextInt();
        System.out.println("enetr value 2:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum="+sum);

    }
    void  minus(int a,int b)
    {
        int c=a-b;
        System.out.println("sub="+c);
    }
    int multi()
    {
        System.out.println("lets do multiplication");
        System.out.println("enter value 1");
        int a=sc.nextInt();
        System.out.println("enetr value 2");
        int b=sc.nextInt();
        int c=a*b;
        return c;
    }
    double division(int a,int b)
    {
        double c=a/b;
        return c;
    }

}
class run{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        qb548 t=new qb548();

        t.sum();

        System.out.println("lets do substraction");
        System.out.println("enter value 1");
        int x=sc.nextInt();
        System.out.println("enetr value 2");
        int y=sc.nextInt();
        t.minus(x,y);

        t.multi();
        int ans=t.multi();
        System.out.println("multi"+ans);

        
        System.out.println("lets do division");
        System.out.println("enetr value 1:");
        int a=sc.nextInt();
        System.out.println("enetr value 2:");
        int b=sc.nextInt();
        double ans1=t.division(a,b);
        System.out.println("division"+ans1);
      }
}
