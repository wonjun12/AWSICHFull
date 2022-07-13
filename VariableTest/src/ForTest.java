
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		for(int count = 1; count<=10; count++) {
			if(count % 2 ==0) {
				sum = sum + count;
			}
		}
		System.out.println("1~10 중 짝수의 수를 더한 값 : " + sum);

	}

}
