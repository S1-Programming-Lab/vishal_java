import java.util.Scanner;
public class fibeven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lower limit of range : ");
int x=sc.nextInt();
System.out.println("Enter the upper limit of range : ");
int y=sc.nextInt();
Runnable r=new fibannoci(x,y);
Thread obj1=new Thread(r);
obj1.start();
Runnable p=new even(x,y);
Thread obj2=new Thread(p);
obj2.start();
}
}
class even implements Runnable
{
int n1,n2;
even(int x, int y)
{
n1=x;
n2=y;
}
@Override
public void run()
{
for(int i=n1;i<=n2;i++)
{
if(i%2==0)
{
System.out.println("Even ="+i);
}
}
}
}
class fibannoci implements Runnable
{
int n1,n2,num=0,x=0,y=1;
fibannoci(int l, int u)
{
n1=l;
n2=u;
}
@Override
public void run()
{
System.out.println("Fibannoci ="+0);
System.out.println("Fibannoci ="+1);
while(num<n2-1)
{
num=x+y;
if((num>=n1)&&(num<=n2))
{
System.out.println("Fibannoci ="+num);
}
x=y;
y=num;
}
}
}
