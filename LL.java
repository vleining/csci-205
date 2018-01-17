public class LL {
	private int data;
	private LL point;

	public LL(int data){
		this.data = data;
		point = null;
	}

	public int getData () {
		return data;
	}
	public void setData (int data){
		this.data = data;
	}
	public LL getPoint(){
		return point;
	}
	public void setPoint(LL point){
		this.point = point;
	}
}
