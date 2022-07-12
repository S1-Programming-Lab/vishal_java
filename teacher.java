import java.util.Scanner;
class employee
{
  int id;
  String name,address;
  double salary;
  employee(int n,String na,double s,String a)
  {
   this.id=n;
   this.name=na;
   this.salary=s;
   this.address=a;
  }
}
class teacher extends employee
{
  String dept;
  String subject;
  teacher(int n,String na,double s,String a,String d,String sub)
  {
    super(n,na,s,a);
    this.dept=d;
    this.subject=sub;
  }
  void display()
  {
    System.out.println("Employee id:"+id);
    System.out.println("Employee name:"+name);
    System.out.println("Employee salary:"+salary);
    System.out.println("Employee address:"+address);
    System.out.println("Department:"+dept);
    System.out.println("Subject:"+subject);
  }
public static void main(String args[])
{
  System.out.println("Enter no. of employees");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  teacher t[]=new teacher[num];
  for(int i=0;i<num;i++)
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter employee id");
    int empid=sc1.nextInt();
    System.out.println("Enter employee name");
    String name=sc1.next();
    System.out.println("Enter employee salary");
    double salary=sc1.nextDouble();
    System.out.println("Enter employee address");
    String address=sc1.next();
    System.out.println("Enter department");
    String dept=sc1.next();
    System.out.println("Enter subject");
    String subject=sc1.next();
    t[i]=new teacher(empid,name,salary,address,dept,subject);
    //sc1.close();
}
System.out.println("**********Informations of all the employees**********");
for(int i=0;i<num;i++)
{
int j=i+1;
System.out.println("\n"+j+").");
t[i].display();
}
sc.close();
}
}
    
    
    
    
    
    
