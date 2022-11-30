/*
Array 
 int rno=1;
int rno1,......rno100;
Array --- n val of same data type under one variable.
int rno[100] -- rno[0],rno[1]...rno[99].

*/

 class Emp 
  {
  
  int empId;
  String eName;
// int a =10;  
	Emp()
	{
			empId=0;
			eName=null;
 // Dummy Constructor.
	}
  
  Emp(int empId, String eName)
	{
//empId=empId;
  this.empId=empId;
  this.eName=eName;
  
	}
 
   void setEmpID(int empId) 
  {
// int a;
   this.empId=empId;
  }
  int getEmpId()
  {
  return empId;
  }
  void setEName(String eName) 
  {
   this.eName=eName;
  }
  String getEName() 
  {
  return eName;
  }   
public static void main(String []data)
 {
  int n=3;
  Emp e[] = new Emp[n];// Object Array
  //Let JVM know the size of the Array
 for(int i=0;i<n;i++)

	{
  e[i]=new Emp(1,"BBBB");

  /*e[i]=new Emp();
  e[i].setEmpID(1);
  e[i].setEName("AAA");*/
  //System.out.println("EMP "+e[i].getEmpId()+"NAme:"+e[i].getEName());
	}
//MAP--ENTRY --SET 
for(int i=0;i<3;i++)
{
	System.out.println("EMP For "+e[i].getEmpId()+"NAme:"+e[i].getEName());
	
}
//Enchanced for loop 
	for(Emp em : e)
	{
		
		System.out.println("EEE");
		System.out.println("EMP "+em.getEmpId()+"NAme:"+em.getEName());
		
	}
	//

  }

}

 /*
  int a= a+b;
  function retrun int a 
  function acept int a
int a =10; 
  Student 
  Student s = new Student();
  Stutdent()
  {
	  
	  rno =0;
	  Name=null;
	  
  }
  Student (int rno,String name)
  {
	  
	  
  }  
  Constructor is a special method of the class whose job is to intialise the member data.
  It is called as Spcial beacuse its name will be always same as class name.
  This is called as soon as Object is created.This feature is introduced to prove that objects can also behave like varaibles of primitives in the case of Intialization as soon as they are declared.
  A constructor can be called only once per object creation.
  It cannot have a return type even void also because internally it returns the reference of the object which is created by invoking the constructor.
  A constrcutor can accept parameters like methods.
  If no explicit constructor is defined in a class then compiler will add a default constructor.
  Student s = new Student(1"A")
  
  Java doesn't support destructor.Garbage collection will be taken care by JVM.
  
  Const:When a class is there and you know the values of the member data then create the object by passing the valyues as parameters to the constructor.
  
  Setters: When values for the member data are know after object creation then call the setters of the class to assign values to member data.
  
  
  */
  
  2 mins ...
  

 