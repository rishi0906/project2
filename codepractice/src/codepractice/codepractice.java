package codepractice;

public class codepractice {

	public int reverse(int number){
	int reverse=0;
	while(number!=0){
		reverse=(reverse*10)+(number%10);
		number=number/10;
	
	}
	
	return reverse;}

	public static void main(String[] args) {

	codepractice t = new codepractice();
	System.out.println(t.reverse(456544464));
	}	}
	
		
		
		
		
		
		
		
		
		
		
		
	