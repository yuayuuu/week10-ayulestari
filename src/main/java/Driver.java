import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counters();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
