public class qb547 {
    int a=10;
    boolean b=true;

    void method1()
    {
        System.out.println("method 1 called");
    }
    void method2()
    {
        System.out.println("method 2 callled");
    }
}
class s1
{
    public static void main(String[] args) {
        qb547 t=new qb547();
        System.out.println("variable 1 accessed"+t.a);
        System.out.println("variable 2 accessed"+t.b);
        t.method1();
        t.method2();
    }
}
