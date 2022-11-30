//POJO class -- Plain old Java Object A java class with setters annd getters is called as POJO
class Student
  {

   //member data or Instance Data 
     int rno;//
     String name;
    
	/*Student()
	{
		rno=0;
		name=null;
		
	}*/

    void setRno(int no)// formal parameters
    {
		// int x=0; local var
      rno=no;
    }
    int getRno()
    {
     return rno;
    }
     void setName(String sname)//formal parameter
    {
      name=sname;
    }
   String getName()
    {
   return name;
    }
	
   void printData()
   {
   System.out.println("Name : "+name +"  Rno :"+ rno); 
   }
   
 /*public  String toString()
   {
	   System.out.println("In To String Name : "+name +"  Rno :"+ rno); 
	   return "a";
	   
   }
*/
   public static void main(String args[])
  {
//We need to create a object 
//1.Declaring 
 Student s ;//default val is null   s.setRno(1);
 s= new Student();//  instantiation    How mucj memory must be allocated will be given by special method/function called as constructor and that memory will be allocated by new operator, new is also a keyword.

//Student s = new Student();

s.setRno(1);// actual parmeter
s.setName("BBB");

System.out.println(" The name is "+ s.getName() +"The RollNo is "+ s.getRno());

//System.out.println("Object Print"+s);

s.printData();

  }
  }
/*
//Any Java class which is defined with setters and getters is called as POJO.
Plain Old Java Object 

Student s = new Student();
1.In Java when a object is created how much memory will be allocated?

rno  -4by
name-- 10by

setters and getters 40by

Student s = new Student(); 54 bytes---->
Student s1= new Student();54 bytes
Stuent s2= new Student() ;54 bytes

When an object is created memory will be allocated only for the member data, memory wont be allocated for methods.

When a class is given for compilation then memory for methods of the class will be allocated only once.

All the objects will use the same method definitions with their own data members.

When a object is calling a method (s1.rno()) the member data that is being used in the method belongs to the object which is calling the method

 void rno()
{
SOP(rno);

}
s1-1
s2-2
s3-3

s1.rno()----1
s2.rno()---2
s3.rno()---3

javac prg.name--->class--->java .class--->Res
.class--java

When a compiler is generating the class file it doesnt know for whom it is generating the class file.
Unknowingly compiler will generate the class file for Interpretor.This means for Compiler ,Interpreter doesn't exist and int does the Job.Hence Inte for Compiler is called as Virtual Machine and in Java it is reffered as JVM(java virtual machine).


1.When a class file is given to Interpreter , some predefined classes called as ClassLoaders come into picture, these CL's will check whether the Byte code is containing any illegal code or not and also these CL's will subsitute the predefined function and gives the byte code to Interpretar.(JVM)

2.JVM will 5 different memory locations/memory blocks
1.Stack:A stack will contain local variables/temp variable or values of function like formal,actual and return values
2.Heap memory: Will store the objects.
3.PC(Program counter): Will contain the address of the current and next instructions to be executed.
4.Method Area : Will contain the Method definitions. Static variables.
5.Native Stack  : In Java we have the option to deibe cpp and c code called as native code.If such functions in c or cpp are define or used in java prg then memory for them will be allocated in Heap memory.

*/




























