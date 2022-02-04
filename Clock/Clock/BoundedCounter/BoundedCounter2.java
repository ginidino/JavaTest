package BoundedCounter;

public class BoundedCounter2 {
	public static void main(String[] args) {
		BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter );
        
        for (int i = 0; i < 16; i++) {
        	counter.next();
            System.out.println("value: " + counter);
        }
	}
}