
public class ForTest2 {
	public class Max {
	    public static final int MAX_VALUE = 5;
	}
	public static void main(String[] args) {		
		String str;
		String spa;
		int i = 1;
		int j = Max.MAX_VALUE, z = j - 1;
		for(int count = 1; count <= j; count++)
		{
			str = "";
			spa = "";
			for(int count3 = z; count3 > 0; count3--)
			{
				spa += " ";
			}
			for(int count2 = 0 ; count2 < i ; count2++)
			{
				str += "*";
			}
			System.out.print(spa);
			System.out.println(str);
			if(z>0){
			z--;
			i += 2;
			}else {
				z++;
				i -= 2;
			}
		}
		for(int count = j ; count > 0 ; count--)
		{
			str = "";
			spa = "";
			for(int count3 = 0; count3 < z; count3++)
			{
				spa += " ";
			}
			
			for(int count2 = i; count2 > 0 ; count2--)
			{
				str += "*";
			}
			System.out.print(spa);
			System.out.println(str);
			z++;
			i -=2;
		}
	}
}
