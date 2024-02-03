import java.util.*;
public class qb623 {
    public static void main(String[] args) {
        student a[]=new student[3];
        for(int i=0;i<a.length;i++)
        {
            a[i]=new student();
            a[i].getdata();
        }
        for(int i=0;i<a.length;i++)
        {
            a[i].display();
        }
    }
}
class student
{
   int roll;
   String name;
   long mo;
   void getdata()
   {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter roll no. =");
    roll=sc.nextInt();
    sc.nextLine();
    System.out.println("enetr name=");
    name=sc.nextLine();
    System.out.println("enetr mobile number=");
    mo=sc.nextLong();
    System.out.println();
   } 
   void display()
   {
    System.out.println();
    System.out.println("roll number is="+roll);
    System.out.println("student name is="+name);
    System.out.println("mobile number="+mo);
   }
}