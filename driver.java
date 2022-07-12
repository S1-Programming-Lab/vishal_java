import java.util.*;
class operations
{
  public void operation()
  {
    int top=-1,ch,n,e;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of stack");
    n=s.nextInt();
    int size=n-1;
    int[] a=new int[n];
    do
    {
      System.out.println("\n---------------\nMENU :\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n----------------");
      System.out.println("Enter your choice");
      ch=s.nextInt();
      switch(ch)
      {
         case 1:
         if(top==size) 
         {
           System.out.println("***Stack is full***");
          }
         else
         {
           System.out.println("Enter the element");
           e=s.nextInt();
           top++;
           a[top]=e;
         }
          break;
         case 2:
         if(top==-1)
         {
           System.out.println("***Stack is empty***");
          }
         else
         {
           System.out.println("\n"+a[top]+"is removed");
           top--;
         }
          break;
         case 3:
         if(top==-1)
         {
           System.out.println("***Stack is empty***");
          }
         else
         {
           System.out.println("\n***Stack:***\n");
           for(int i=top;i>=0;i--)
           {
             System.out.println(""+a[i]);
             System.out.println("------");
            }
          }
         break;
         case 4:
         System.exit(0);
         default: System.out.println("Invalid choice");
       }
      }
     while(ch!=4);
    }
   }
public class driver
{
   public static void main(String args[])
   {
     operations o=new operations();
     o.operation();
   }
}
             
          
