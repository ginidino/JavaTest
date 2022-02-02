package Clock;

public class stopWatch {
	public static void main(String[] args) {
		stopWatch clo = new stopWatch();
		int hour = 23;
		int min = 59;
		int sec = 59;
		while (true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			sec++;
			if (sec >= 60) {
				min++;
				sec = 0;
				if (min >= 60) {
					hour++;
					min = 0;
					if (hour >= 24) {
						hour = 0;
					}
				}
			}
			System.out.println("Current time = " + hour + " : " + min + " : " + sec);
		}
	}
}
