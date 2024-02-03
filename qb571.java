import java.util.*;
public class qb571 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enetr n1:");
        int n1=sc.nextInt();
        System.out.println("enetr n2:");
        int n2=sc.nextInt();

          qb571 t=new qb571();
          t.hcf(n1,n2);
          int ans=t.hcf(n1,n2);
          System.out.println("HCF of"+n1+"and"+n2+"is:"+ans);
    }
    int hcf(int n1,int n2)
    {
        if (n2!=0)
           return hcf(n2,n1%n2);
        else
            return n1;
    }
}
