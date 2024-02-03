import java.util.*;
class qb494
{
    public static void main(String[] args) {
        qb494 t=new qb494();
        t.digit();

    }
    void digit()
    {  
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit=");
        int n =sc.nextInt();

        while(n>0)
        {
            count++;
            n=n/10;
        }
        System.out.println("no. of digit="+count);
    }
}
