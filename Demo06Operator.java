public class Demo06Operator{
	public static void main(String[] args){
		int num1 = 10;
		System.out.println(num1);//10
		++num1;
		System.out.println(num1);//11
		num1++;
		System.out.println(num1);//12
		System.out.println("=================");
		
		int num2 = 20;
		System.out.println(++num2);//21
		System.out.println(num2);//21
		System.out.println("=================");
		
		int num3 = 30;
		System.out.println(num3++);//30
		System.out.println(num3);//31
	}
}