public class Wrapperimmutability{
	public static void main(String[] args){
		Integer num1=10;
		Integer num2=num1;
		num1=num1+5;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("Are num1 and num2 same object?"+(num1==num2));
		
		Double d1=5.5;
		Double d2=d1;
		d1=d1*2;
		
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("Are d1 and d2 same object?"+(d1==d2));
	}
}
