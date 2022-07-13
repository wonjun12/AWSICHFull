import java.util.Scanner;
public class FlowTestEx2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String gran = "";
		
		if(num >= 90 && num <= 100) {
			gran = "A";
			if(num >= 95) {
				gran = gran + "+";
			}else if(num <= 92) {
				gran = gran + "-";
			}
		}else if(num >= 80){
			gran = "B";
			if(num >= 85) {
				gran = gran + "+";
			}else if(num <= 82) {
				gran = gran + "-";
			}
		}else if(num >= 70) {
			gran = "C";
			if(num >= 75) {
				gran = gran + "+";
			}else if(num <= 72) {
				gran = gran + "-";
			}
		}
		System.out.println("당신의 점수는 " + num + "이고 등급은 " + gran + "입니다.");
	}
}
