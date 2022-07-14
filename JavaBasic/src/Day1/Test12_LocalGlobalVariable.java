package Day1;

public class Test12_LocalGlobalVariable {
	
	static int age=25; //Global var
	public static void main(String[] args) {
		System.out.println("program Start..........");
		System.out.println("SGV = "+age );
		System.out.println("SGV with standard ="+ Test12_LocalGlobalVariable.age);
		System.out.println("*************************");
		
		age = 30;//updating var or overriding 
		System.out.println("SGV= "+age);
		System.out.println("SGV with standard ="+ Test12_LocalGlobalVariable.age);

		
		int age = 35;//local var
		System.out.println("Local variable ="+age );
		System.out.println("program End..........");

		
	}

}
