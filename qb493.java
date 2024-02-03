
import java.util.*;



class qb493
{
    public static void main(String[] args) {
        circle c1=new circle();
        c1.getdata();
        c1.calculate();
        
    }
}

class circle
{
    double r,area,peri;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radias");
        r= sc.nextDouble();
    }
    void calculate()
    {
    area=3.14*r*r;
    peri=2*3.14*r;
    System.out.println(area);
    System.out.println(peri);


    
    }
}

