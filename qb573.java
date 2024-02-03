import java.util.*;

public class qb573 {
    public static void main(String[] args) {
        qb573 t=new qb573();

        Scanner sc=new Scanner (System.in);
        System.out.println("enetr base");
        int b=sc.nextInt();
        System.out.println("enter power:");
        int p=sc.nextInt();
        int ans=t.pow(b,p);
        System.out.println("yopur ans is="+ans);
    }
    int pow(int b,int p)
    {
        if(p==0)
            return 1;
        else
            return b*pow(b,p-1);
    }
}
