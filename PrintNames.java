 class PrintNames 
    {
  String fname="sachin",
  mname="ramesh",
  lname="tendulkar";

   PrintNames()
{
	System.out.print(" I am Default");
  //Iam dummy constructor
}
 PrintNames(String fname)
 {
 this.fname=fname;
 }
  PrintNames(String fname,String lname)
{
 this.fname=fname;
 this.lname=lname;
}
  PrintNames(String fname,String lname,String mname)
{
	//System.out.println(" 4th cons the name is " + this.fname+this.mname+this.lname);
 this.fname=fname;
 this.mname=mname;
 this.lname=lname;
}
 void disp()
{
System.out.println(" the name is " + fname+mname+lname);
}
public static void main(String args[])
{
  PrintNames p = new PrintNames();
  p.PrintNames();
  PrintNames p1 = new PrintNames("s");
  PrintNames p2= new PrintNames("s","t");
  PrintNames p3= new  PrintNames("s","r","t");
p.disp();
p1.disp();
p2.disp();
p3.disp();
}
}

