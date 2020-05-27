public class Demo17Max{
	public static void main(String[] args){
		int a = 30;
		int b = 20;
		
		//int max = a > b ? a : b;
		
		int max;
		if(a > b){
			max = a;
		}else{
			max = b;
		}
		System.out.println("最大值" + max);
	}
}