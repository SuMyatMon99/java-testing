package JavaTesting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = 10;
		
		b = ( a == 1 ) ? 20: 30;
		System.out.println("Value of b is : " + b );
		
		b = ( a == 10 ) ? 20: 30;
		System.out.println("Value of b is : " + b );
		
		String name = "Smith";
		boolean result = name instanceof String;
		System.out.println(result);
		
		int [] numbers = {10, 20, 30, 40};
		
		for( int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		
		System.out.print("\n");
		String [] names = {"James", "Smith", "Jon", "Anne"};
		for( String n : names) {
			
			System.out.print(n);
			System.out.print(",");
		}
		System.out.print("\n");
		char grade = 'C';
		
		switch (grade) {
		
         case 'A' : System.out.println("Excellent!"); 
            break;
         case 'B' : System.out.println("Good");
         	break;
         case 'C' : System.out.println("Well done");
            break;
         case 'D' : System.out.println("You passed");
         	break;
         case 'E' : System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
		
		Integer x = 8;
		
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
		System.out.println(x.compareTo(9));
		
		Integer y = 9;
		Integer z = 8;
		Integer i= 8;
		Short w = 8;
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(i));
		System.out.println(x.equals(w));
		
		System.out.println(x.toString());
		System.out.println(Integer.toString(12));
		
		int o = -2;
		double p = -200.55;
		float q  = -30;
		double r = -200.50;
		
		System.out.println(Math.abs(o));
		System.out.println(Math.abs(p));
		System.out.println(Math.abs(q));
		
		System.out.println(Math.ceil(p));
		System.out.println(Math.floor(p));
		
		System.out.println(Math.rint(p));//return the closest double
		System.out.println(Math.rint(r));
		
		System.out.println(Math.round(r));//return the closest long or int
		System.out.println(Math.round(p));
		
		System.out.println(Math.E);
		System.out.println(Math.exp(x)); 
		
		
	}

}
