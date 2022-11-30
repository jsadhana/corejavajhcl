public class DataType_Boolean {
	
	boolean a =true ;
	
	void check() {
		
		if(a == true) {
			
			a = false;
			
			System.out.println("IF The Boolean Value is : " + a);
		}
		else
		{
			System.out.println("Else The Boolean Value is : " + a);
			
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		DataType_Boolean obj = new DataType_Boolean();
		
		obj.check();
	}
}