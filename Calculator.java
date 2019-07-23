public class Calculator{
	public static void main(String[] args){
		int sum = sum(5,10);
		System.out.println(sum);
		int sub = sub(5,10);
		System.out.println(sub);
	}

	public int sum(int a, int b){
		return a + b;

	}
	public int sub(int a, int b){
		return a - b;

	}
}