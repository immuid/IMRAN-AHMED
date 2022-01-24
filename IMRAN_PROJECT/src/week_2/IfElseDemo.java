package week_2;
//nice work done 

public class IfElseDemo {
	public static void main(String[] args) {
		int i=10;
		if(i>20) {
			System.out.println("I is greater than 20...");
		}
		else if(i==10) {
			System.out.println("I is equal to 10...");
		}
		else {
			System.out.println("I is lesser than 20...");
		}
		IfElseDemo obj=new IfElseDemo();
		String result=obj.met(i);
		System.out.println("the result is "+result);
		
		boolean b= true;
		obj.met2(b);
		
		String str ="hello";
		obj.met3(str);
	}
	String met(int i) {
		if(i==10) {
			return "'i' is equal to 10";
		}
		else {
			return "condition not satisfied";
		}
	}
	void met2(boolean valid) {
		if(valid) {
			System.out.println( "The Valid value is true");
		}
		else {
			System.out.println( "The Valid value is False");
		}			
	}
	void met3(String s) {
		if(s.equals("Hello")) {
			System.out.println("The String is equal");
		}
		else {
			System.out.println("The String is not Equal");
		}
	}
	}
	

