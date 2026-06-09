public class Multi extends Thread{

	//Thread Scheduler
	public void run(){//critical section
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("This is run method - User Thread - Critical Section(CS)");
		}
	}

	public static void main(String[] args){ //main thread
		Multi t1 = new Multi(); // thread created - t1 -New
		t1.start(); // - Runnable -- Thread Scheduler

		Multi t2 = new Multi();
		t2.start();

		//main thread
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("I'm Main Thread.");
		}
	}
}


/*
OUTPUT:

D:\Coding\Desktop\Java\OOPS\Multithreading\code1>java Multi
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
I'm Main Thread.
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
This is run method - User Thread - Critical Section(CS)
*/