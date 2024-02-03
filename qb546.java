import java.util.Scanner;

class temperature
{
    void ferenhit(double celsius)
    {
        double result=celsius*(9/5)+32;
        System.out.println("in feranhit="+result);
    }
    void celsius(double ferenhit)
    {
        double result= ferenhit-32*5/9;
        System.out.println(" in celsius"+ result);
    }
}
class main{
    public static void main(String[] args) {
        temperature t=new temperature();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ferenhit:");
        int n=sc.nextInt();
        System.out.println("enter celsius:");
        int n1=sc.nextInt();
        t.ferenhit(n);
        t.celsius(n1);
    }
}