public class Demo04Operator{
	public static void main(String[] args){
		int a = 20;
		int b = 30;
		System.out.println(a - b);//-10
		System.out.println(a * 10);//200
		
		int x = 10;
		int y = 3;
		
		int result1 = x / y;
		System.out.println(result1);//3 除法取整，舍弃小数
		
		int result2 = x % y;
		System.out.println(result2);//1  模运算取余数，舍弃整数
		
		//int + double --> double + double = double
		double result3 = x + 2.5;
		System.out.println(result3);//12.5
	}

}