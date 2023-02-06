package L22_1;

public class YingYangThread implements Runnable{
	String nachricht;
	
	@Override
	public void run() {
		while(true) {
		try {
			System.out.println(nachricht);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public YingYangThread(String nachricht) {
		this.nachricht=nachricht;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread myThread1 = new Thread(new YingYangThread("Yin"));
		myThread1.start();
		Thread myThread2 = new Thread(new YingYangThread("Yang"));
		myThread2.start();	
	}

}
