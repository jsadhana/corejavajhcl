class While_Ex2 {
	
	int i = 1;
	
	void check1(int n) {
		
		while(i < n) {
			
			System.out.println("While - i : " + i);
		}
	}
	
	void check2(int n) {
		
		do {
			System.out.println("Do While - i : " + i);
		} while(i < n);
	}
}
class MainClass {
	
	public static void main(String args[]) {
		
		While_Ex2 obj = new While_Ex2();
		obj.check1(1);
		obj.check2(1);
	}
}


