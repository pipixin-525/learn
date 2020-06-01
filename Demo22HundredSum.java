//求出1-100之间偶数和
public class Demo22HundredSum{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("for");
		System.out.println("结果是" + sum);
		
		System.out.println("==========");
		
		int sum2 = 0;
		int a = 1;
		while(a <= 100){
			if(a % 2 == 0){
				sum2 += a;
			}
			a++;
		}
		System.out.println("while");
		System.out.println("结果是" + sum2);
		
		System.out.println("==========");
		
		int sum3 = 0;
		int b = 1;
		do{
			if(b % 2 == 0){
				sum3 += b;
			}
			b++;
		}while(b <= 100);
		System.out.println("do...while");
		System.out.println("结果是" + sum3);
	}
}