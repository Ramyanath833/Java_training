package synchonization;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table e = new Table();
		MyThread t1 = new MyThread(e);
		MyThread1 t2 = new MyThread1(e);
		
		t1.start();
		t2.start();
		
	}

}
