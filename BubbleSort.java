import java.util.*;

public class BubbleSort {

	public static void main(String[] args){

		int[] list = {4,1,6,8,7,12,13,14};
		int swap = list.length-1;
		while (swap >0){
			int iterate = swap;
			swap = 0;
			for(int j=0;j<iterate;j++){
				if(list[j]>list[j+1]){
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					swap = j;
				}
			}
		}
		System.out.println(Arrays.toString(list));
	}
}	
