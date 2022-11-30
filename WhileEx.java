class While_Ex1 {
	
	int i = 1;
	
	void check(int n) {
		
		while(i<n) {
			
			System.out.println("While - i : " + i);
			i++;
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		While_Ex1 obj = new While_Ex1();
		obj.check(4);
	}
}