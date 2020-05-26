public class Demo10Operator{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		//数据类型 变量名称 = 条件判断 ？ 表达式A : 表达式B；
		int max = a > b ? a : b;
		System.out.println("最大值" + max);
	}
}