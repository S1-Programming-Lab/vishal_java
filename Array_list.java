import java.util.*;
class Array_list
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
System.out.println("1. Insertion\n2. Remove\n3. Replace\n4. Display\n5. Get element by position\n6. Exit\n");
while(true)
{
System.out.println("Enter your choice");
Scanner s=new Scanner(System.in);
int ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the size:");
int n=s.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<n;i++)
{
String Arr=s.next();
a.add(Arr);
}
System.out.println(a);
break;
case 2:
System.out.println("Enter the position to be removed:");
int p=s.nextInt();
a.remove(p);
System.out.println(a);
break;
case 3:
System.out.println("Enter the position to be replaced:");
int r=s.nextInt();
System.out.println("Enter the String to be replaced:");
String str=s.next();
a.set(r,str);
System.out.println(a);
break;
case 4:
System.out.println(a);
break;
case 5:
System.out.println("Enter the position to be displayed:");
int d=s.nextInt();
System.out.println(a.get(d));
break;
case 6:
System.exit(0);
break;
}
}
}
}
