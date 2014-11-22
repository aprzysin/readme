
public class RecursionTest {

	public static void main(String[] args) {
		System.out.println(mapIntSystem(10));
		
	}
	public static int mapIntSystem(int x) {
		if (x > 1) {
			return x + mapIntSystem(x - 1);
		} else {
			return 1;
		}



	}
	}
