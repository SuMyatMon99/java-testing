package JavaTesting;

public class Puppy {
	int puppyAge;
	public Puppy(String name) {
		System.out.println("Puppy's name is " + name);
	}
	public void setAge(int age) {
		puppyAge = age;
	}
	public int getAge() {
		System.out.println("Puppy's age is " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("Tommy");
		myPuppy.setAge(3);
		myPuppy.getAge();
		System.out.println("Variable value: " + myPuppy.puppyAge);
	}

}
