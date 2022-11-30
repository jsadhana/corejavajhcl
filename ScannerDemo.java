//java.lang
import java.lang.*;
// Demo to read data from KB 
import java.util.Scanner;
 class ScannerDemo
 {
 
 
 public  static  void main(String [] args )
 {
 
 Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter Name ");
  String name =(String)scanner.nextLine();
  System.out.println("Please enter a Number  ");
  int no= scanner.nextInt();
 System.out.println("Name "+ name  + "No "+ no );
 
 }
 
 }