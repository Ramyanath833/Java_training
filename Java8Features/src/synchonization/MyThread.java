package synchonization;

public class MyThread extends Thread{

	Table t;
	
	MyThread(Table t){
		this.t=t;
	}
	
	public void run() {
		t.table(5);
	}
}
