//javac Marks.
class Marks
  {   
    int m=35,p=35,c=35;
    Marks()
    {
// dummy constructor
    }
    Marks(int m)
    {
   this.m=m;
    }
 Marks(int m,int p)
    {
  this.m=m;
  this.p=p;
    }
Marks(int m, int p, int c)
    {
  this.m=m;
  this.p=p;
  this.c=c;
    }
  int total ()
  {
  return m+p+c;
  }
 public static void main(String args[])
{
     Marks m1 = new Marks();
     Marks m2 = new Marks(70);
     Marks m3 = new Marks(75,46);
     Marks m4 = new Marks(80,90,80);
   int res= m1.total();
System.out.println(" the res of I st student is = " + res);
res= m2.total();
System.out.println(" the res of IInd  student is = " + res);
res= m3.total();
System.out.println(" the res of IIIrd student is = " + res);
res= m4.total();
System.out.println(" the res of IVth  student is = " + res);
}//end of main
}// end of class 
