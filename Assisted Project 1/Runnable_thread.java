package thread;

public class Runnable_thread implements Runnable{ 
	public static int myCount = 0;
	public Runnable_thread(){
		
	}
	public void run() {
		while(Runnable_thread.myCount <= 10){
			try{
				System.out.println("Expl Thread: "+(++Runnable_thread.myCount));
				Thread.sleep(100);
				} catch (InterruptedException iex) {
					System.out.println("Exception in thread: "+iex.getMessage());
					}
			}
		}
	public static void main(String a[]){
		System.out.println("Starting Main Thread...");
		Runnable_thread mrt = new Runnable_thread();
		Thread t = new Thread(mrt);
		t.start();
		while(Runnable_thread.myCount <= 10){
			try{
				System.out.println("Main Thread: "+(++Runnable_thread.myCount));
				Thread.sleep(100);
				} catch (InterruptedException iex){
					System.out.println("Exception in main thread: "+iex.getMessage());
					}
			}
		System.out.println("End of Main Thread...");
		}
	}
