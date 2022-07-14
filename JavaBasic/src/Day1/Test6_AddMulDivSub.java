package Day1;

public class Test6_AddMulDivSub {

	public static void main(String[] args) {
		double num1=105.0,num2=50.0; // u can use nay here int or double if u wan ta value in points then use double DT or if u dont want then use int
		double result;
		
		result =num1+num2;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Addition:"+result);
		System.out.println("**************************");

		result =num1*num2;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Multiplication:"+result);
		System.out.println("**************************");

		result =num1/num2;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Division:"+result);//0.5
		System.out.println("**************************");

		
		result =num1/50;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+50);
		System.out.println("Division:"+result);//4.0
		System.out.println("**************************");

		result =num1-num2;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Subtraction:"+result);
		System.out.println("**************************");

		result = num1%num2;
		System.out.println("Mod: "+result);//5.0
		//why 5.0 coz 50 div 100 goes to2 and remaining is 5 so mod is 5
		
	}

}
