/*
JAR : JAVA ARCHIEVE
tools.jar-lib
java.lang.String, System
 String is a class, java.lang.String, import java.lang.String,import java.lang.System,import
 packages-- collection of classes,subpackages.
 tools.jar----- collection of packages
 Java Archieve.
 java
 lang,util,sql,awt,io 
 lang ----System,String
 import java.lang.String;
 import java.lang.*;
 
 
 String S = new String(); ---- Heap Memeory 
 String s1= "JAVA";
 String s2="JAVA"; (intern()-- Heap to SCP)
 
 String S3= new String("JAVA");


immutable.-- UnModified // String s = "CORE     " s = core.trim() ... s 
String pwd="aaa"; --"bbb"
Striing path="b"
path=" 
String userID="A";
String pwd="EP";
retrun pwd+ something return path+dirpath;
String path="NETWROK" //FILEPATH
  
  
String class supports STring pooling.
String s ="JAVA";    1024
String s1="JAVA"--->
if(x==10)
if(s1==s) --not possible
 String s1="software"
 String s="SOFTWARE"
 s1.equalsIgnoreCase(s)---->
 
 Project --- String URL --- Path of File ,String PWD,String ip 
 
 PWD - get and set 
 1
 2 updating pwd ,
 Hashing -- String as 
 
*/
  
class Stringdemo
   {
      public static void main(String args[])
   {
	   
   String name=new String("    software");
   String s=name;
   System.out.println("the String is " + name);
   System.out.println(" the String is " + name.charAt(5));
   System.out.println(" the String is " + name.startsWith("so"));
   System.out.println(" the String is " + name.endsWith("re"));
   char names[]=name.toCharArray();
   System.out.println(" the String is "+names[6] );
   System.out.println(" the String is " +name.indexOf("w") );
   System.out.println(" the String is " +name.toLowerCase() );											

   System.out.println(" the String is " +name.toUpperCase() ); 
  String newTemp=name.toUpperCase();
     System.out.println(" Modified String... " +newTemp ); 
   System.out.println(" the String is with trim" +name.trim() );
   //name=name.trim();
	//name=s;	
System.out.println("After calling trim()"+name);//SOFTWARE
//System.out.println("SSS"+s);
   String name2="      software";
   //name2.equals(name)
   System.out.println(" the String is " +name.equals(name2) );//equalsIgnoreCase
   System.out.println(" the String is " +name.length() );
   
   //String Split
   
 String   source = "JSE is Language ,JEE is API";
String[] occurrences = source.split(" ");

for(int i=0;i<occurrences.length;i++)
	System.out.println("String.."+occurrences[i]);

for(String s11: occurrences)// Enhanced for loop.
	System.out.println(" "+s11);
 //Numbers to String
String intStr = String.valueOf(10);
System.out.println("intStr = " + intStr);

String flStr = String.valueOf(9.99);
System.out.println("flStr = " + flStr); 
   
   //if(name.trim().equalsIgnoreCase("SOFTWARE");
  // String trimame=name.trim();
   StringBuffer sb= new StringBuffer("software");//Mutable
   //sb=(StringBuffer)"software";
   System.out.println(" the String is " +sb.append("solutions"));
   System.out.println(" the String is " +sb.charAt(4) );
   System.out.println(" the String is " +sb.insert(1,'j' ));
System.out.println(" the String is " +sb.reverse() );
System.out.println(" the String is " +sb );
//StringBuilder
   }   
	   } //StringBuilder-- It like SB but non-synchronized.
	   
	   /*
String pool is possible only because String is immutable in java, this way Java Runtime saves a lot of java heap space because different String variables can refer to same String variable in the pool. If String would not have been immutable, then String interning would not have been possible because if any variable would have changed the value, it would have been reflected to other variables also.
If String is not immutable then it would cause severe security threat to the application. For example, database username, password are passed as String to get database connection and in socket programming host and port details passed as String. Since String is immutable it’s value can’t be changed otherwise any hacker could change the referenced value to cause security issues in the application.
Since String is immutable, it is safe for multithreading and a single String instance can be shared across different threads. This avoid the usage of synchronization for thread safety, Strings are implicitly thread safe.
Strings are used in java classloader and immutability provides security that correct class is getting loaded by Classloader. For example, think of an instance where you are trying to load java.sql.Connection class but the referenced value is changed to myhacked.Connection class that can do unwanted things to your database.
Since String is immutable, its hashcode is cached at the time of creation and it doesn’t need to be calculated again. This makes it a great candidate for key in a Map and it’s processing is fast than other HashMap key objects. This is why String is mostly used Object as HashMap keys.

Above are some of the reasons I could think of that shows benefits of String immutability. It’s a great feature of Java String class and makes it special.
	   
	   */
   