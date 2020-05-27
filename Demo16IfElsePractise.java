public class Demo16IfElsePractise{
	public static void main(String[] args){
		int score = 80;
		if(score < 0 || score > 100){
			System.out.println("成绩错误！");
		}else if(score >= 90 && score <= 100){
			System.out.println("成绩为优秀！");
		}else if(score >= 80 && score <= 89){
			System.out.println("成绩为好！");
		}else if(score >= 70 && score <= 79){
			System.out.println("成绩为良！");
		}else if(score >= 60 && score <= 69){
			System.out.println("成绩为及格！");
		}else{
			System.out.println("成绩为不及格！");
		}
	}
}