class Switch_Ex1 {
	
	void display(int n) {
		
		switch(n) {
		
		case 1 :
			System.out.println("Switch Case : 1");
			break;
		case 2 :
			System.out.println("Switch Case : 2");
			break;
		case 3 :
			System.out.println("Switch Case : 3");
			break;
		default :
			System.out.println("Switch Case : Default");
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Switch_Ex1 obj = new Switch_Ex1();
		obj.display(2);
		obj.display(10);
	}
}

