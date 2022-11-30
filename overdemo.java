  class Base
  {
  void disp()
  {
System.out.println("Hai Iam in SUper class");
  }
  }
 class Der extends Base
 {
  void disp()
  {
//super.disp();
System.out.println("Hai Iam in Derived class");
 }
 public static void main(String args[])
 {
 Base b = new Base();
  b.disp();// Base class method is called
 Der d = new Der();
 b=d;// Base class object can hold the reference of subclass
  b.disp();// Der class method is called with base class obj.

}

 }