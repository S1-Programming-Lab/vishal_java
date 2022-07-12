import java.util.*;
class Priorityqueue
{
public static void main(String args[])
{
PriorityQueue<String> queue=new PriorityQueue<String>();
System.out.println("1.Insertion\n2.display Top Element\n3.Print and Delete TopElement\n4.Display\n5.Exit\n");
while(true)
{
System.out.println("Enter your choice");
Scanner s=new Scanner(System.in);
int ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter size");
int n=s.nextInt();
System.out.println("Enter the names");
for(int i=0;i<n;i++)
{
String name=s.next();
queue.add(name);
}
break;
case 2:
System.out.println("Top element");
System.out.println("head:"+queue.peek());
break;

case 3:
System.out.println("Removed: "+queue.peek());
queue.poll();
break;
case 4:
System.out.println("iterating the queue elements:");
Iterator itr=queue.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
break;
case 5:
System.exit(0);
break;
default:
System.out.println("Invalid Choice");
break;
}
}
}
}
