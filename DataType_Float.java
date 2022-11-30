public class DataType_Float {
	
	float a =  10.56f;
	float b = (float) -23.57;
	
	void add() {
		
		float c = a + b;
		
		System.out.println("The Float Vaue is : " + c);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		DataType_Float obj = new DataType_Float();
		
		obj.add();
	}
}