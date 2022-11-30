  class Test
   {
    int a,b;
Test()
{
//Dummy one
}
      Test(int a,int b)
      {
     this.a=a;
     this.b=b;
      }
   
 /* Test sum(Test t1, Test t2)// Objects as Formal Parameters
    {
// Test td= new Test();
 Test t = new Test(0,0); 
 t.a= t1.a+t2.a;
 t.b= t1.b+t2.b;
  return t;
       } */
 Test sum(Test t2)// Formal 
    {
 Test t = new Test(0,0); 
 t.a= this.a+t2.a;
 t.b= this.b+t2.b;
 t2.a=100;
 t2.b=100;
this.a=100;
this.b=100; 
  return t;
}
public static void main(String args[])
  {
   Test a = new Test(10,20);
  Test b = new Test(30,40);
  //Test t2=a.sum(a,b);//function call actual params
   Test t2= a.sum(b);//b.sum(a);
    System.out.println(" A" + t2.a+ "B"+ t2.b);
    System.out.println(" a.a   " + a.a+ "a.b   "+ a.b);
    System.out.println(" b.a  " + b.a+ "b.b  "+ b.b);
    
   
  }    

    
   }
  