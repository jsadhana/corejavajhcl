public class Employee
  {
  
      String firstName;
      String lastName;
     static int count = 0; // number of objects in memory

     // initialize employee, add 1 to static count and
     // output String indicating that constructor was called
     public Employee( String firstName, String lastName )
     {
        this.firstName = firstName;
        this.lastName = lastName;

        count++; // increment static count of employees
        System.out.printf( "Employee constructor: %s %s; count = %d\n",firstName, lastName, count );
     } // end Employee constructor

     // subtract 1 from static count when garbage
     // collector calls finalize to clean up object;
     // confirm that finalize was called
     protected void finalize()
     {
	 
        count--; // decrement static count of employees
        System.out.printf( "Employee finalizer: %s %s; count = %d\n",firstName, lastName, count );
     } // end method finalize

     // get first name
     public String getFirstName()
     {
        return firstName;
     } // end method getFirstName

     // get last name
     public String getLastName()
     {  
	  System.out.println("Hello guys"+getCount());
        return lastName;
     } // end method getLastName

     // static method to get static count value
     public static int getCount()              
     {             
      	
        return count;                          
     } // end method getCount    

static{

System.out.println("Hello ....");
  
}	 
  } // end class Employee
