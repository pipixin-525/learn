public class Demo02DataType{
	public static void main(String[] args){
		int num1 = (int)100L;
		System.out.println(num1);//100
		
		int num2 = (int)6000000000L;
		System.out.println(num2);//1705032704,发生数据溢出。
		
		int num3 = (int)3.9;
		System.out.println(num3);//3,这并不是四舍五入，所有的小数位都会被舍弃掉。
		
		char zifu1 = 'A';
		System.out.println(zifu1 + 1);//66,大写字母A的ASCII码为65
		
		byte num4 = 40;//注意！右侧的数值大不能超过左侧的类型范围
		byte num5 = 50;
		//byte + byte --> int + int = int
		int result1 = num4 + num5;
		System.out.println(result1);//90
		
		short num6 = 60;
		//byte + short --> int + int = int
		//int强制转换为short：注意必须保证逻辑上事实大小本来就没有超过short范围，否则会发生数据溢出。
		short result2 = (short)(num4 + num6);
		System.out.println(result2);//100
	}
}