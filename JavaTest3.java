package JavaTesting;

public class JavaTest3 {
	public int addition(int num1, int num2) {
		return num1+num2;
	}
	public static int substration(int num1, int num2) {
		return num1-num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTest3 test3=new JavaTest3();
		int result = test3.addition(2, 3);
		System.out.println("The result is " + result);
		
		int result1 = substration(4,3);
		System.out.println("The result is " + result1);
		
		myClass text1 = new myClass(20);
		myClass text2 = new myClass(30);
		
		System.out.println(text1.x+ " " + text2.x);
	}

}
class myClass {
	int x;
	
	myClass(int i){
		x = i;
	}
}
