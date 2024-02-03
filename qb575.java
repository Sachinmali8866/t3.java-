import java.util.*;

public class qb575 {
    public static void main(String[] args) {
        qb575 t=new qb575();

        Scanner sc=new Scanner(System.in);
        System.out.println("enetr number 1:");
        int n1=sc.nextInt();
        System.out.println("enetr number 2:");
        int n2=sc.nextInt();
        
        int ans=t.print(n1,n2);
        System.out.println("gcd="+ans);
        System.out.println("lcm="+n1*n2/ans);
    
    }
    int print(int n1,int n2)
    {
        if(n2!=0)
        {
            return print(n2,n1%n2);
        }
      else
          {
             return n1;
        
          }
    }

}
