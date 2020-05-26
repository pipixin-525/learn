public class Demo05Plus{
	public static void main(String[] args){
		String str1 = "Hello";
		System.out.println(str1);//Hello
		
		System.out.println("Hello" + "Word");//HelloWord
		
		String str2 = "Java";
		//String + int = String
		System.out.println(str2 + 20);//Java20
		
		//优先级
		System.out.println(str2 + 20 + 30);//Java2030
		System.out.println(str2 +(20 + 30));//Java50
		System.out.println(20 + 30 + str2);//50Java
	}
}