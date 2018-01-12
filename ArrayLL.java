public class ArrayLL {

	private int[] data = new int[100];
	private int[] position = new int[100];
	private int start;
	private int end;

	public ArrayLL() {
		start = -1;
		end = 0;
	}
	public ArrayLL(int first){
		data[0] =first;
		start = 0;
		position[0] = -1;
		end = 1;
	}

	public String toString(){
		int pos = start;
		String out = "";
		boolean begin = true;
		while (pos != -1){
			if (begin) {
				out = out +data[pos];
				begin = false;
			} else {
				out = out + ", "+data[pos];
			}
			pos = position[pos];
		}
		return out;
	}

	public void add(int newData){
		data[end] = newData;
		if (start == -1){
			start = end;
			position[end] = -1;
		} else {
			if (newData < data[start]){
				position[end] =start;
				start = end;
			} else {
				int pos = start;
				while (position[pos]!= -1 && data[position[pos]]<=newData){
					pos = position[pos];
				}
				position[end] = position[pos];
				position[pos] = end;
			}
		}
		end++;
	}
}
			
			
