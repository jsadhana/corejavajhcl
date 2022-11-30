

 class Bank
  {
 
 String bName;
 int estd;
  /* Bank()
 {
 bName="BOB";
 estd=1969;
  } */
  // Parameterised constructor
  Bank(String bName,int estd)
  {
 this.bName=bName;
 this.estd=estd;
  } 
  String getBName()
 {
return bName;
 }

  int getEstd()
 {
return estd;
 }

public static void main(String args[])
 {
 //Bank b = new Bank();
 Bank b = new Bank("SBI",1980);
 System.out.println(" BANk NAME "+ b.getBName() +"  ESTD YEAR"+ b.getEstd());

}
  }