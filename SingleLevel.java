class Person
{
int no;
String name;

 void  setNo(int no)
{
this.no=no;

}
void  setName(String name)
{

this.name=name;
}
int getNo()
{
return no;

}
String name()
{
return name;

}

}

class Student extends Person
{
String colName;
  void setcolname(String colname)
{
colName=colname;

}

String getColname()
{
return colName;

}

public static void main(String [] args)
{

Student s = new Student();
s.setNo(1);
s.setName("aa");
s.setcolname("ooo");

System.out.println("Student no"+ s.getNo());
System.out.println("Student Name"+ s.name());
System.out.println("Student colname"+ s.getColname());

}

}