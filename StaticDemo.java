/*
Static Keyword: Static is a keyword in java which can be prefixed to method,member data  and block.
If it is prefixed to member data then only one copy of such variables is allocated for all the objects.All the objects will share the same varibale(memory location)If one object updates the variable then the updated value is reflected to all other objects.
The memory for static variables will be allocated before object creation and they willbe stored in MethodArea.Static variables can be accessed by class names with out any objetcs.Memory for Static Variables will be allocated before object creation as they are class level variables.

Static Methods: These methods can be called directly by class names before object creation.They can access only other static methods of the same class directly, they can use only static memberdata .

Static block: static {}, instructions in the static block will be executed before any other instructions in the program.They are usually used to intialize the static members as Java doesnt provide support for static constructors.A class can have only one static block. 
static
{
open

}

System.gc()

protected void finalize()
{
releases the resources
}
*/

public class StaticDemo
{
	
static 
{
System.out.println(" 2...");
}

int rno;
static String colName="AAA";

static void printData()
{
//hello();
System.out.println("RNO AND COLNAME"+colName );
}

void hello()
{
	//printData();
System.out.println("Hello Students..."+rno+colName);
}
public static void main(String [] names)
{
//printData();
//hello();//Non static call directly from Static method.
System.out.println(" FIRST STMT"+ StaticDemo.colName);

StaticDemo s1= new StaticDemo();
s1.printData();

StaticDemo s2= new StaticDemo();
s2.printData();

s2.colName="BBB";//Updating Static Member.
System.out.println(" S1 print data");
//StaticDemo.printData();
s1.printData();

}

// Static block
static 
{
System.out.println(" Hello Guys Iam in static block.**************");
}
}
