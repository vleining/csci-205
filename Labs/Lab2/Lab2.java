import java.util.*;

public class Lab2 {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of integers in the array: ");
		int max = in.nextInt();
		int[] arr = new int[max];
		for (int i=0; i<max; i++){
			System.out.print("Enter an integer: ");
			arr[i] = in.nextInt();
		}
		System.out.print("The largest integer is ");
		System.out.print(maxInt(arr));
		System.out.println(".");
		System.out.print("The smallest integer is ");
		System.out.print(minInt(arr));
		System.out.println(".");
		System.out.print("The sum of the integers is ");
		System.out.print(sum(arr));
		System.out.println(".");
	}
	public static int maxInt(int[] a){
		int m = a[0];
		for (int i=1; i<a.length;i++){
			if (a[i]>m){
				m =a[i];
			}
		}
		return m;
	}
	public static int minInt (int[] a){
		int m = a[0];
		for (int i=1; i<a.length; i++){
			if (a[i]<m){
				m = a[i];
			}
		}
		return m;
	}
	public static int sum (int[] a){
		int s = 0;
		for (int i=0; i<a.length; i++){
			s+=a[i];
		}
		return s;
	}
}

		
