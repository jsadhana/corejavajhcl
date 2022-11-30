  class Person
  {

  String name;
  int age;

   Person(String name,int age)
  {
   this.name=name;
   this.age=age;
  }

  String getName()
 {
   return name;
 }
  int getAge()
 {
return age;
 }
   }
 class Student extends Person
  {
 int rno;
 Student(int rno)
  {  this.rno=rno;
  super("BB",20);
  }
 int getRno()
 {
  return rno;
 }
public  static void main(String args[])
 {
  Student s = new Student(1); 
  System.out.println(" The name of the Student "+ s.getName()+ "\n The Age is "+ s.getAge() +"\n His Roll NUmber is "+ s.getRno());

}
  }