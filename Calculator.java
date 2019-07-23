public class Calculator{
	public static void main(String[] args){
		int result,n1,n2;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		result = sum(n1,n2);
		System.out.println(result);
		result = sub(n1,n2);
		System.out.println(result);
	}

	public static int sum(int a, int b){
		return a + b;

	}
	public static int sub(int a, int b){
		return a - b;

	}
}