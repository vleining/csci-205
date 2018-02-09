public class Queue<E> {

	private LL2<E> forwards;
	private LL2<E> backwards;

	public Queue (){
		forwards = null;
		backwards = null;
	}
	public Queue(E data){
		LL2<E> temp = new LL2(data);
		forwards = temp;
		backwards = temp;
	}

	public void pushQueue(E data){
		LL2<E>temp = new LL2(data);
		temp.setForwards(forwards);
		if (forwards == null) {
			backwards = temp;
		} else {
			forwards.setBackwards(temp);
		}
		forwards = temp;
	}
	public E popQueue(){
		E data = backwards.getData();
		backwards = backwards.getBackwards();
		if (backwards == null) {
			forwards = null;
		} else {
			backwards.setForwards(null);
		}
		return data;
	}
}
		
