package practice;

public class NonPrimitiveDemo {

	public static void main(String[] args) {
		int a = 90;
		int b = 93;
		int c = 20;
		int d = 56; // mark of student
		//----ARRAY----------   []
		int marks[] = new int[4];
		marks[0]= 90;
		marks[1] = 93;
		marks[2] = 20;
		marks[3] = 56;
		System.out.println(marks.length);
		System.out.println(marks[1]);
		System.out.println(marks.toString());
		
        int []age = new int[7];
        age[3] = 50;
        age[20] = 100;
        System.out.println(age[3]);
//        System.out.println(age[10]); //array index out of bound exception
        System.out.println("**********");
        
	}

}
