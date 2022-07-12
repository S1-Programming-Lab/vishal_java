import java.util.*;
class com
{
  int real,imaginary;
  com()
  {
    }
  com(int realtemp,int imaginarytemp) 
  {
    real=realtemp;
    imaginary=imaginarytemp;
  }
  com addcomplex(com ip1,com ip2)
  {
    com temp=new com();
    temp.real=ip1.real+ip2.real;
    temp.imaginary=ip1.imaginary+ip2.imaginary;vbbbb
    return temp;
  }
}
class complex
{
 public static void main(String args[])
 {
   com ip1=new complex(15,24);
   System.out.println("The Ist complex no. is defined as:"+ip1.real+"+i"+ip1.imaginary);
   com ip2=new complex(3,7);
   System.out.println("The 2nd complex no. is defined as:"+ip2.real+"+i"+ip2.imaginary);
   com result=new complex();
   result=result.addcomplex(ip1,ip2);
   System.out.println("The sum of complex no. is:"+result.real+"+i"+result.imaginary);
}
}



