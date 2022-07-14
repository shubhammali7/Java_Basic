package Month2;

public class Method_8FEB {

	public static void main(String[] args) {
		Method_8FEB m1=new Method_8FEB();
		m1.display(); //Without Param
		m1.display('A',35,90000); //With Param
	}
	void display() {
		System.out.println("********Without Param*******");
		char grade='A';
		int age=30;
		int salary=50000;
		System.out.println("Garde is: "+grade);
		System.out.println("age is: "+age);
		System.out.println("Salary is: "+salary);
	}
	void display(char grade, int age, int salary) {
		System.out.println("********With Param*******");
		System.out.println("Garde is: "+grade);
		System.out.println("age is: "+age);
		System.out.println("Salary is: "+salary);	
	}

}
