public class Demo12Notic{
	public static void main(String[] args){
		//右侧确实是一个int数字，但是没有超过左侧的范围，就是正确的。
		//int-->byte，不是自动类型转换
		byte num1 = /*(byte)*/30;//右侧没有超过左侧范围
		System.out.println(num1);//30
		
		//byte num2 = 128 // 右侧超过了左侧的范围
		
		//int-->char，没有超过范围
		//编译器会自动补上一个隐含的(char)
		char zifu = /*(char)*/65;
		System.out.println(zifu);//A
		
		System.out.println("==========");
		
		short num3 = 10;//正确写法，右侧没有超过左侧的范围
		
		short a = 5;
		short b = 8;
		//short + short --> int + int --> int
		//short result = a + b;// 错误写法！左侧需要是int类型
		
		//右侧不用变量，而是采用常量。
		short result = 5 + 8;
		System.out.println(result);
		
		//short result2 = 5 + a + 8;//错误写法
	}
}