// sum of given number by recursion
import java.util.*;
public class recursion {
    public static void main(String[] args) {
    recursion t=new recursion();
    
    Scanner sc=new Scanner (System.in);
    System.out.println("enetr digit;");
    int n=sc.nextInt();

    t.add(n);
    int ans=t.add(n);
    System.out.println(ans);
    }
    int add(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return n+add(n-1);
        }
    }
}
