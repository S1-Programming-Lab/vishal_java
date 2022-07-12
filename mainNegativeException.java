import java.util.*;
class EntryNegative extends Exception
{
private int n; EntryNegative(int a)
{
n=a;
}
public String toString()
{
return "EntryNegativeException number should be positive";
}
}
class mainNegativeException
{
static int r,s,sum=0;
static int count,avg;
static int entry(int n,int ra) throws EntryNegative
{
r=n; s=ra;
for (int i=0;i<s;i++)
{
if(n<0)
{
throw new EntryNegative(n);
}
else
{
sum+=n;
count+=1;
}

}
avg=sum/count;
return avg;
}
public static void main(String args[])
{
int num,range;
Scanner sc=new Scanner(System.in);
System.out.println("Enter range:");
range=sc.nextInt();
System.out.println("Enter "+range+" numbers");
int a[]=new int[range];
for(int i=0;i<range;i++)
{
try
{
a[i]=sc.nextInt();
avg=entry(a[i],range);
}
catch(EntryNegative e)
{
System.out.println("Caught "+e);
}
}
System.out.println("Average:"+avg);
}
}
