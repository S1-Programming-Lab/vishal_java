class product
{
  int pcode,price;
  String name;
  product(int a,int b,String s)
  {
    this.pcode=a;
    this.price=b;
    this.name=s;
  }
public static void main(String args[])
{
  product obj=new product(101,5,"Tea");
  product obj1=new product(102,10,"Coffee");
  product obj2=new product(111,200,"Biscuits");
  if((obj.price<obj1.price)&&(obj.price<obj2.price))
  System.out.println("Product with low price:"+obj.name);
  else if(obj1.price<obj2.price)
  System.out.println("Product with low price:"+obj1.name);
  else
  System.out.println("Product with low price:"+obj2.name);
}
}
  


