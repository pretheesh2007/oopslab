class Railway{
	private int availableSeats=1;
	
	public synchronized void bookTicket(){
		System.out.println("Trying to book ticket...");
		while(availableSeats==0){
			try{
				System.out.println("No seats available.Waiting for cancellation...");
				wait();
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
			}
			availableSeats--;
			System.out.println("Ticket book Successfully!");
		}
		
		public synchronized void cancelTicket(){
			System.out.println("Cancelling ticket...");
			availableSeats++;
			System.out.println("Ticket cancelled.Seat is now available.");
			notify();
			}
		}
		
		class BookingThread extends Thread{
		Railway railway;
		BookingThread(Railway railway){
			this.railway=railway;
		}
		
		public void run(){
			railway.bookTicket();
		}
	}
	
	class CancellationThread extends Thread{
		Railway railway;
		
		CancellationThread(Railway railway){
			this.railway=railway;
		}
		
		public void run(){
			railway.cancelTicket();
		}
	}

public class railwaysystem{
	public static void main(String[] args)throws InterruptedException{
		Railway railway=new Railway();
		
		BookingThread booking1=new BookingThread(railway);
		BookingThread booking2=new BookingThread(railway);
		CancellationThread cancel=new CancellationThread(railway);
		
		booking1.start();
		booking2.start();
		Thread.sleep(1000);
		
		cancel.start();
	}
}
