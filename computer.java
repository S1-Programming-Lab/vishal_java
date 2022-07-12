class CPU
{
  double price;
  CPU(int p)
  {
    price=p;
  }
  class Processor
  {
    int cores;
    String manufacturer;
    Processor(int c,String manu)
    {
      cores=c;
      manufacturer=manu;
    }
    void display()
    {
      System.out.println("Processor cores:"+cores);
      System.out.println("Processor manufacturer:"+manufacturer);
    }
   }
   static class RAM
   {
     int memory;
     String manufacturer;
     RAM(int m,String manufact)
     {
       memory=m;
       manufacturer=manufact;
     }
     void disp()
     {
       System.out.println("RAM memory:"+memory);
       System.out.println("RAM manufacturer:"+manufacturer);
     }
   }
}
public class computer
{
  public static void main(String args[])
  {
   CPU cpu=new CPU(30000);
   CPU.Processor processor=cpu.new Processor(5,"Intel");
   CPU.RAM ramobj=new CPU.RAM(2,"Intel");
   processor.display();
   ramobj.disp();
  }
} 
