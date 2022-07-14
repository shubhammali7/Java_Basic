package Day1;

public class Test8_StaticGlobalVariable1 {
	
	static int age=25;

	public static void main(String[] args) {
		System.out.println("SGV :"+age);
		System.out.println(Test8_StaticGlobalVariable1.age);	
	}
}
/*we can write this program any of this 
 * like this Test8_StaticGlobalVariable1 or "SGV :"+age
 */
 