package synchonization;

public class Table {

		
		public synchronized void table(int n) {
			for(int i=0; i<=50;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


}
