import java.util.Scanner;
import java.util.Arrays;
public class sort
{
  public static void main(String args[])
  {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of words");
    int n=sc.nextInt();
    String word[]=new String[n];
    sc.nextLine();
    for(i=0;i<n;i++)
    {
    System.out.println("Enter a word");
    word[i]=sc.nextLine();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=i+1;j<n;j++)
      { 
        if(word[i].compareTo(word[j])>0)
        {
          String t=word[i];
          word[i]=word[j];
          word[j]=t;
        }
      }
    }
System.out.println("Sorted strings using compareTo function ="+Arrays.toString(word));
System.out.println(word);
}
}
