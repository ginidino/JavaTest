package BoundedCounter;

public class BoundedCounter1 {
	public static void main(String[] args) {
		BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter);
        
        for (int i = 0; i < 10; i++) {
        	counter.next();
            System.out.println("value: " + counter);
        }
	}
}