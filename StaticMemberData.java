 class Student 
{
 
 int rno=1;
 String name;        
 static String colName="ABC";

static void print()
{
 System.out.println("Colname in Non Sttaic Methd "+rno);
}
 
      public static void main(String [] args)

     {
System.out.println("  "+Student.colName);
Student s1 = new Student();
s1.print();
System.out.println(" S1... "+s1.colName);

/*s1.colName="XYZ";

System.out.println("After Update S1... "+s1.colName);
  //
Student s2 = new Student();
System.out.println(" S2... "+s2.colName);

System.out.println(" AfterUpdate "+Student.colName); */
     }


}