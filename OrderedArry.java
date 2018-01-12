import java.util.*;

public class OrderedArray {
	public static void main (String[] args){

		int[] data = new int[100];
		Scanner console = new Scanner(System.in);
		int input;
		int pos,total=0;
		input = getData(console);
		if (input >0){
			data[0] = input;
			total = 1;
		}
		while (input > 0){
			input = getData(console);
			if (input > 0) {
				pos = 0;
				while (pos<total && input>=data[pos]) {
					pos++;
				}
				for (int i = total; i>pos; i--){
					data[i] = data[i-1];
				}
				data[pos] = input;
				total++;
			}
		}
		System.out.print(data[0]);
		for(int i=1; i<total;i++){	
			System.out.print(","+data[i]);
		};
		System.out.println();
	}
	public static int getData(Scanner console){
		int input = -1;
		while (input < 0) {
			System.out.println("Enter a positive integer or 0 to end");
			input = console.nextInt();
			if (input <0) {
				System.out.println("Please try again.");
			}
		}
		return input;
	}
}
				
