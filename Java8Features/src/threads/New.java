package threads;

public class New extends Thread{

public void run() {
		
		for(int i=1;i<=20;i=i+2) {
			System.out.println("Thread 1 "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
