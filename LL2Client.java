public class LL2 <E>{
	private E data;
	private LL2 forwards;
	private LL2 backwards;

	public LL2(E data){
		this.data = data;
		forwards = null;
		backwards = null;
	}

	public E getData () {
		return data;
	}
	public void setData (E data){
		this.data = data;
	}
	public LL2 getForwards(){
		return forwards;
	}
	public void setForwards(LL2 forwards){
		this.forwards = forwards;
	}
	public LL2 getBackwards(){
		return backwards;
	}
	public void setBackwards(LL2 backwards){
		this.backwards = backwards;
	}
}
