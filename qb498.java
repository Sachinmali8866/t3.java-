import java.util.Scanner;

class qb498
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n=");
        int n=sc.nextInt();
        System.out.println("enter r");
        int r=sc.nextInt();

        qb498 t=new qb498();
        int fact=t.factorial(n);
        int nr=t.factorial(n-r);
        int npr=fact/nr;

        System.out.println(npr);
    }
    int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }    

} 
