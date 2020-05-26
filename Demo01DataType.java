/*
当数据类型不一样时，将发生数据类型及转换。

*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);//这是一个整数，默认就是int型
		System.out.println(3.14);//这是一个浮点数，默认就是double类型
		
		
		//等号的左边是long类型。右边是默认的int类型，左右不一样
		long num1 = 100;
		System.out.println(num1);//100
		
		double num2 = 2.5F;
		System.out.println(num2);//2.5
		
		float num3 = 30L;
		System.out.println(num3);//30.0
	}
}