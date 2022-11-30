/*
1.Call by Val and Call by Value.
2.PolyMorphism.
3.Object Count
4.Object Array
Formal Paramters: The values that are passed in the function definition are called as FOrmal Paramters.2)Actual Paramateres: The parameters that are passed in fucntion call are called as actual parameters.
Call by values : when a method is called by passing values then a duplicate set of orginal values(actual parameters) will be copied into formal parameters, any changes made to formal parameters are not  reflected back, untill the method returns the values.
Call by reference: When a method is called by passing reference then the address of actual parameters will be copied into formal parameters ,any changes done in the method to these parameters are automatically reflected back.
// IN java for primitives only call by value is possible.
//When an object is passed automatically the reference of the object will be copied into formal parameter.
*/
public class PassArray
  {
     // main creates array and calls modifyArray and modifyElement
     public static void main( String args[] )
     {
        int array[] = { 1, 2, 3, 4, 5 };

        System.out.println("Effects of passing reference to entire array:\n" + "The values of the original array are:" );

        // output original array elements
        for ( int value : array )// for(init;cond;incr/decr)
           System.out.printf( "   %d", value );

        modifyArray( array ); // pass array reference
        System.out.println( "\n\nThe values of the modified array are:" );

        // output modified array elements
        for ( int value : array )
           System.out.printf( "   %d", value );

        System.out.printf( "\n\nEffects of passing array element value:\n" +
           "array[3] before modifyElement: %d\n", array[ 3 ] );

        modifyElement( array[ 3 ] ); // attempt to modify array[ 3 ]
        System.out.printf(
           "array[3] after modifyElement: %d\n", array[ 3 ] );
     } // end main

     // multiply each element of an array by 2                     
     public static void modifyArray( int array2[] )                
     {                                                             
        for ( int counter = 0; counter < array2.length; counter++ )
          array2[ counter ] *= 2; //a*=2//a=a*2;                                
     } // end method modifyArray                                   

     // multiply argument by 2                                  
     public static void modifyElement( int element )            
     {                                                          
        element *= 2;                                           
        System.out.printf(                                      
           "Value of element in modifyElement: %d\n", element );
     } // end method modifyElement                              
  } // end class PassArray
