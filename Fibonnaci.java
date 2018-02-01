public class Fibonnaci {

	public static void main (String[] args){
		System.out.println(f(10));
		System.out.println(f2(10));
	}
	public static int f(int n){
		if (n==2 || n==1) {
			return 1;
		} else {
			return f(n-1)+f(n-2);
		}
	}
	public static int f2(int n){
		int a =1;
		int b =1;
		int temp;
		for (int i=3;i<=n; i++){
			temp = b;
			b = a+b;
			a= temp;
		}
		return b;
	}
}
