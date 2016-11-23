package codepractice;

public class codepractice2 {
int a;
	void m1(){
		System.out.println("m1method");
	}
  codepractice2(){
	System.out.println("hello");
	
}
  codepractice2(int a){
	System.out.println("argument1");
	this.a =a;

}
  
  
	public static void main(String[] args)
	{
		codepractice2 t =new codepractice2();
		codepractice2 t1=new codepractice2(12);
		t.m1();
	}
	
}
