import java.util.Scanner;
import Excep.*;
public class authentication
{
  public static void main(String args[])
  {
    String username="Tom";
    String password="Cat";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter username");
    String u=s.nextLine();
    System.out.println("Enter password");
    String p=s.nextLine();
    try
    {
      if((u.equals(username))&&(p.equals(password)))
      {
        System.out.println("Access granted");
      }
      else
      {
        throw new credentialexception("Invalid Credentials");
      }
    }
    catch(credentialexception e)
    {
      System.out.println(e.getMessage());
    }
  }
}
    
