//import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		
		//int num = in.nextInt();
		//String gran = "";
		
		int num = 0;
		num = ((int) (Math.random()*10))*100;
		
		System.out.println("당신의 번호는 " + num + " 입니다!");
		switch(num) {
			case 100:
				System.out.println("당첨!!");
				break;
			case 200:
				System.out.println("당첨!!");
				break;
			case 300:
				System.out.println("당첨!!");
				break;
			case 400:
				System.out.println("당첨!!");
				break;
			case 500:
				System.out.println("당첨!! 상품은 컴퓨터를 드립니다!");
				break;
			default:
				System.out.println("꽝!!");
		}
		
					
					
	}
}
