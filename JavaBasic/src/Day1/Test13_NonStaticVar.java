package Day1;

public class Test13_NonStaticVar {
	//global var
	int mobileNum=123;//non-static global var
	
	public static void main(String[] args) {
		System.out.println("program Start..........");
		
		Test13_NonStaticVar ref = new Test13_NonStaticVar();
		System.out.println("Nonstatic global var = "+ ref.mobileNum); //123
		ref.mobileNum=456;
		System.out.println("updated Nonstatic global var = "+ ref.mobileNum); //456 

		System.out.println("program End..........");

	}

}
