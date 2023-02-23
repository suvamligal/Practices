
public class BreakExample {

	//break terminates the loop as soon as it meets the condition inside the loop.
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i > 4) {
				break;
			}
			System.out.println("value of i is " + i);

		}

	}

}
