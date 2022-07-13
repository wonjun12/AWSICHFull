import java.util.Scanner;
public class FlowTestEx1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String gran = "";
		
		if(num >=90) {
			gran = "A";
		}else if(num >= 80){
			gran = "B";
		}else if(num >= 70) {
			gran = "C";
		}else if(num >= 60) {
			gran = "D";
		}else{
			gran = "F";
		}
		
		System.out.println("당신의 점수는 " + num + "이고 등급은 " + gran + "입니다.");
	}
}
