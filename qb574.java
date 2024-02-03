import java.util.*;
public class qb574 {
    public static void main(String[] args) {
        qb574 t=new qb574();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr number:");
        int n=sc.nextInt();
        
        t.print(n);
        int ans=t.print(n);
        System.out.println(ans);
    }
    int print(int n)
    {
        if(n==0)
            return 0;
        else
            return(n%2+10*(print(n)/2));
    }
}
