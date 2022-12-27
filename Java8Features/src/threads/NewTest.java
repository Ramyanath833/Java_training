package threads;

public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		New n = new New();
		Old o = new Old();
		n.start();
		o.start();

	}
	

}
