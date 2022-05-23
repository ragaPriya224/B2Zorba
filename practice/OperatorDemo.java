package practice;

public class OperatorDemo {

	public static void main(String[] args) {
		System.out.println(5+5); //10
		System.out.println(10-5);//5
		System.out.println(10/5);//2
		System.out.println(10%5); //0
		System.out.println(10>5);
		System.out.println(5 != 5);

		int age = 20;
		String citizen = "american";
		if(age >= 18  | citizen == "nepali") {
			System.out.println("you're eligible to vote");
		}else {
			System.out.println("you're not eligible to votes");
		}
		//https://twitter.com/java/status/1184685214640926721


		//		System.out.println(++a);//8 //increment operator 
		//		int b = 8;
		//		System.out.println(--b); //decrement operator 
		int a = 7;
		System.out.println(a++);  // print and then incremented it 
		System.out.println(a);

		int money = 2;
		int penCost = 5;
		int pencilCost = 1;
		
		if (money>=penCost) {
			System.out.println("can nbuy pen");	
		}else if(money>=pencilCost) {
			System.out.println("can nbuy pencil");	
		}else if(money>=0.5) {
			
		}else {
			System.out.println("return home");
		}
		System.out.println(22<10);

	}

}
