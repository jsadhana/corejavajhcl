 class If_Ex3 {
 
	int a = 11;
	int b = 20;
	int c = 18;
	
	void check() {
		
		if(a>b && a>c) {
			
			System.out.println("A is Greater !!!");
		}
		else if(b>a && b>c) {
			
			System.out.println("B is Greater !!!");
		}
		else {
			
			System.out.println("C is Greater !!!");
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		If_Ex3 obj = new If_Ex3();
		obj.check();
	}
}