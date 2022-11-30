class EmpClass
{

int eno;
String name;
//Default const will be added by the compiler
EmpClass()
{

eno=0;
name=null;

}

//Setters and Getters.
// This is a key word , it provides differentiation between formalparameters and member data when their names are same.
  void setEno(int eno)
{
this.eno=eno;

}

int getEno()
{
return eno;
}
 void setName(String name)
{
this.name=name;

}

String getName()
{
return name;
}

public static void main(String names[])
{

//declaring the object
EmpClass e;// Null

//Allocating memory to the object or Object Instantiation

e= new EmpClass();// EmpClass e = new EmpClass();

e.setEno(1);
e.setName("AAA");

System.out.println("The Number of the Emp is "+ e.getEno() +"The Name of the Emp is "+ e.getName());



}

}