
public class DaemonThread implements Runnable {
//here we are creating the main methhod 
	public void run(){  
		
		  //here we are Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing"); //print statement 
		  }  
		  else{  
		      System.out.println("user thread executing");  //print statement
	          }  
	   }  
	//here we are creating the main method
	   public static void main(String[] args){  
		 /* Creating two threads: by default they are 
		  * user threads (non-daemon threads)
		  */
		 DaemonThread dt=new DaemonThread();
		 Thread t = new Thread(dt);
		 DaemonThread  dt1= new DaemonThread();
		 Thread t1 = new Thread(dt1);
				 
		 //Making user thread t1 to Daemon
	         t.setDaemon(true);
			     
	        //starting both the threads 
	         
	        t.start();
	        t1.start();
	   }
}

