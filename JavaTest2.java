package JavaTesting;

class FreshJuice{
	enum FreshJuiceSize{ small, medium, large}
	FreshJuiceSize size;
}
public class JavaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshJuice juice=new FreshJuice();
		juice.size=FreshJuice.FreshJuiceSize.large;
		System.out.println("Size:" + juice.size);
	}

}
