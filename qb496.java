import java.util.Scanner;

public class qb496 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your nu.=");
        int n=sc.nextInt();
    
        qb496 t=new qb496();
        t.peli(n);

    }
    int temp=0,rev=0,r;
    void peli(int n)
    {
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("given number is not palindrom");
        }
    }
}
