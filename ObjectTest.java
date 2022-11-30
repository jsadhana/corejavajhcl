 class  Test
 {
  int a;
 
  Test ()
 {
// dummy 
 }
  Test(int a)
  {
  this.a=a;
  }

  void printA()
  {

System.out.println("A value is"+ a);
  }   

/*  Test sum(Test o1, Test o2)
  {
 
  Test t= new Test();
    t.a=o1.a+o2.a;
	o1.a=100;
  return t;

 }*/
 Test sum(Test o1)
 {
 
Test t = new Test();
t.a= o1.a+this.a;
o1.a=100;
// When a object is calling a method(Memberfunction) the data that is being used in the method belongs to the objct which is calling the method
return t; 
 
 
 }
 

 public static void main(String args[])
 {
  Test t1= new Test(10);
  t1.printA();

  Test t2= new Test(20);
  t2.printA();

//Test t3=t1.sum(t1,t2);
Test t3=t1.sum(t2);

   
   t3.printA();
   t2.printA();

 }
 }