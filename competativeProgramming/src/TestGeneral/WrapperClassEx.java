package TestGeneral;

public class WrapperClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 100;
		Integer num2 = 200;
		Integer num3 = 100;
		Integer num4 = 200;
		
		if(num1 == num2) {
			System.out.println("num1 == num2");
		} else {
			System.out.println("num1 != num2");
		}
		
		if(num1.equals(num2)) {
			System.out.println("num1 == num2");
		} else {
			System.out.println("num1 != num2");
		}
		
		if(num3 == num4) {
			System.out.println("num3 == num4");
		} else {
			System.out.println("num3 != num4");
		}
		
		
		if(num3.equals(num4)) {
			System.out.println("num3 == num4");
		} else {
			System.out.println("num3 != num4");
		}

	
	}
}
