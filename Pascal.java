public class Pascal {

	public static void main (String[] args){
		System.out.println(pascal(35,17));
		System.out.println(pascal(6,3));
	}

	public static int pascal(int row, int column){
		if (column == 0 || column ==row) {
			return 1;
		} else {
			return pascal(row-1,column-1) + pascal(row-1,column);
		}
	}
}
