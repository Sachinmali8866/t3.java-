import java.util.*;

public class qb495 {
    public static void main(String[] args) {
        qb495 t=new qb495();
        t.product();
    }
    

void product()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your nu.=");
    int n=sc.nextInt();

    int sum=0;
    int product=1;
    int r;
    
    while(n>0)
    {
        r=n%10;
        product=product*r;
        n=n/10;
    }
    System.out.println("product of all diguit="+product);
}
}