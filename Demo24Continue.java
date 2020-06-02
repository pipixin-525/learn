//跳过第4层
public class Demo24Continue{
	public static void main(String[] args){
		for(int i = 1;i <= 10;i++){
			if(i == 4){//如果当前是第四层
				continue;//那么跳过当前次循环，马上开始下一次
			}
			System.out.println(i+"层到了");
		}
	}
}