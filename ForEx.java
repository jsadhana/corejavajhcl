 class For_Ex1 {
	
	void display(int n) {
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("for - i : " + i);
		}
	}
}
 
class MainClass {
	
	public static void main(String[] args) {
		
		For_Ex1 obj = new For_Ex1();
		
		obj.display(5);
	}
}