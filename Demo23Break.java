//从第3次以后都不要了
public class Demo23Break{
	public static void main(String[] args){
		for(int i = 1;i <= 10;i++){
			if(i == 4){//如果当前是第四次
				break;//那么就打断整个循环
			}
			System.out.println("循环体" + i);
		}
	}
}