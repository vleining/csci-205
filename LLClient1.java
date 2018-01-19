import java.io.*;
import java.util.*;

public class LLClient1 {

	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int data = getInt(console);
		LL list = new LL(data);
		data = getInt(console);
		while (data != -1){
			if (data < list.getData()) {
				LL temp = new LL(data);
				temp.setPoint(list);
				list = temp;
			} else {
				LL position = list.getPoint();
				LL lastPosition = list;
				while (position != null && data>= position.getData()){
					position = position.getPoint();
					lastPosition = lastPosition.getPoint();
				}
				LL temp = new LL(data);
				lastPosition.setPoint(temp);
				temp.setPoint(position);
			}

			printLL(list);
			data = getInt(console);
		}
		printLL(list);
	}
	
	public static int getInt(Scanner console){
		System.out.println ("Enter a non-negative integer or -1 to end.");
		int input =console.nextInt();
		while (input < -1) {
			System.out.println("Please try again");
			System.out.println("Enter a non-negative integer or -1 to end.");
			input = console.nextInt();
		}
		return input;
	}
	public static void printLL(LL list){
		LL pos = list;
		System.out.print(pos.getData());
		while (pos.getPoint()!= null){
			pos = pos.getPoint();
			System.out.print(", "+pos.getData());
		}
		System.out.println();
	}
}
