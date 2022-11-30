/*

Polymorphism : It ia process where we can use same thing for multiple purposes.The same ting can be 
MethodName,Opeartor, Object.
MethodName: more than one method in te class can have same name , ensure that return type or List and Type of Parameters are different.Also use this feature only when these methods are performing similar kind of tasks.This is called as Method Overloading.
squareRoot --- int,float,doube,Integer 
intSR,fSR,dSR
SR(float)
SR(int)
SR(10)

disp(int)
disp(float)


Operator Overloading : Redefining a existing operator is called as OpOvr.
int a = b + c;
Timer t = t1 + t2 ;

+ -- >  diff 

+ - ---> sum of Primitives 
+ new def such that it can add Two objetcs.
+ such that it finnd the diff between two objects.
hence java doesnt permit the developer  to overload operator.

*/



class Figure
{
int l1;
int b;

Figure()
{
	 System.out.println(" Default Constructor ");
	l1=10;
	b=20;
	
}
Figure(int l1,int b)
{
	System.out.println(" Constructor with two params ");
this.l1=l1;
this.b=b;	
	
}
Figure(int l1)
{
	System.out.println("  Constructor -L1 ");
	this.l1=l1;
}
Figure(int b ,String br)
{
	System.out.println(" Constructor -B ");
	this.b= b;
}
 int area()
{

return l1*l1;
}

 int area(int a)
//int area(int l)
{

return 2*(l1*b);

}
// sqrt(int) sqrt(flo) sqrt(d) sqrt(Integer)
public static void main(String args[])
{

Figure f = new Figure(100,400); //JVM will call Constructor 2. Constructor will calculate the amoint of Memoery 3 it will give fig to new 4. new will allocation memory in heap and new will retyurn that reference to Con then constructor will return that to Object 
int res=f.area();
//int f=res=f.area(10,20);
System.out.println("The area of Square"+ res);
//System.out.println("The area of Square"+ res);
 res=f.area(0);
System.out.println("The area of Rectangle"+ res);

Figure f1 = new Figure();
Figure f2 = new Figure(100);
Figure f3 = new Figure(20,"B");

}




}
