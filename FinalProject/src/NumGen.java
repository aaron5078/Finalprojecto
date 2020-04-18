import java.util.Random;
public class NumGen {

	private int num = 0;
	public int getnum() {
	Random rand = new Random();
	num = rand.nextInt(2);
	return num;
	}
	public int getnum2() {
		Random rand = new Random();
		num = rand.nextInt(10);
		return num;
		}
}
