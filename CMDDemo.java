
 class CMD
  {
     public static void main(String args[])//main(char argv,int argc)
    {
		///sum(10,20);
	/*javac PRG.java
	java classname  values to mIan params--- java classname.main()
     */
      int cnt=0;
	  
      for (int i=0;i<args.length;i++)
     {

     System.out.println("ARGS  " +args[i]);
	// cnt = cnt + args[i];
 cnt = cnt + Integer.parseInt(args[i]);//Wrapper 
	

    }    


System.out.println("COUNT"+cnt);
    }
  }
	// javac CMDDemo.java --- > CMD.class ---> java CMD.class --- Java Virtual Machine(JVM)

/* 
Command line Arguments: main is also a method(function) it is also capable of accepting parameters, In Java Mian always accepts a array of Strings,as main  is not called from other functions, the values for the main method are to be passed from the pplace where we call main. In general main will be called by interprete and if we run the program in command prompt we pass the values to main from command prompt, hence these are called as Command line arguments.

Java provides special classes called as Wrapper classes whose job is to convert the behaviour of Objects if they are containing primitive values into their respective primitive
byte--- Byte
short--Short
int--- Integer.parseInt(args)
long--Long
float--Float
double--Double
boolean-- Boolean

char--Character.
*/