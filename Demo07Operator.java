public class Demo07Operator{
	public static void main(String[] args){
		int a = 10;
		a += 5;
		System.out.println(a);//15
		
		int b = 10;
		b %= 3;
		System.out.println(b);//1
		
		System.out.println("===========");
		
		byte num = 30;
		//num = byte + int
		//num = int + int 
		//num = int
		//num = (byte)int 
		num += 5;
		System.out.println(num);//35
	}
}