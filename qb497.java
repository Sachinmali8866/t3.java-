import java.util.Scanner;
class armstrong
{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        armstrong t=new armstrong();
        t.arm(n);
    }

    double sum=0;
    int r,count=0,temp=0;
 
    void arm(int n)
    {
        temp=n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        n=temp;
        while(n>0)
        {
            r=n%10;
            sum=sum+(Math.pow(r,count));
            n=n/10;
        }
        if(temp==sum)
        System.out.println("yes armstring");
        else
        System.out.println("not armstrong");
    }


   
}

