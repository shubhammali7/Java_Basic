package Month2;

public class Variables {
	double salary ;
	static char grade;
	int age =24;
	static int empID=123;

	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		int empID=777;
		System.out.println("local empID with std ="+empID);
		System.out.println("SVG grade with std ="+Variables.grade);
		System.out.println("SVG grade without std ="+grade);
		System.out.println("SVG grade with std ="+Variables.empID);
		
		Variables v1=new Variables();
		System.out.println("NSGV salary with std=" +v1.salary);
		System.out.println("NSGV age with std=" +v1.age);
		
		Variables v2=new Variables();
		v2.salary=40000;
		v2.age=30;
		System.out.println("NSGV salary with std=" +v2.salary);
		System.out.println("NSGV age with std=" +v2.age);
		
		System.out.println("Program Ends.......");



	}

}
