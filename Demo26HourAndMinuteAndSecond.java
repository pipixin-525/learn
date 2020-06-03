public class Demo26HourAndMinuteAndSecond{
	public static void main(String[] args){
		for(int hour = 0;hour < 24;hour++){//外层控制小时
			for(int minute = 0;minute < 60;minute++){//内层控制小时中的分钟
				for(int second = 0;second < 60;second++){//最内层控制分钟中的秒
					System.out.println("现在时间是" + hour +"时"+ minute +"分"+ second +"秒");
				}
			}
		}
	}
}