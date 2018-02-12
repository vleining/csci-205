public class LL2Client {

	public static void main(String[] args){
		Queue<Integer> queue = new Queue<Integer>();
		queue.pushQueue(5);
		queue.pushQueue(11);
		queue.pushQueue(32);
		queue.pushQueue(7);
		System.out.println(queue.popQueue());
		System.out.println(queue.popQueue());
		System.out.println(queue.popQueue());
		System.out.println(queue.popQueue());
		Queue<String> one = new Queue<String>("hi there");
		one.pushQueue("My name is ");
		one.pushQueue("Alfred");
		System.out.println(one.popQueue());
		System.out.println(one.popQueue());
		System.out.println(one.popQueue());
	}
}
		
