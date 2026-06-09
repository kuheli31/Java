public class RunnableDemo implements Runnable
{
	//Thread Scheduler
	public void run(){//critical section
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("This is run method - User Thread - Critical Section(CS)"+i);
		}
	}

	public static void main(String[] args){ //main thread
		Runnable r1 = new RunnableDemo();
		Runnable r2 = new RunnableDemo();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();//runnable
		t2.start();//runnable

		//t1.run();//normal method
		//t2.run();//normal
	}

}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOPS\Multithreading\code2>javac RunnableDemo.java

D:\Coding\Desktop\Java\OOPS\Multithreading\code2>java RunnableDemo
This is run method - User Thread - Critical Section(CS)1
This is run method - User Thread - Critical Section(CS)2
This is run method - User Thread - Critical Section(CS)1
This is run method - User Thread - Critical Section(CS)2
This is run method - User Thread - Critical Section(CS)3
This is run method - User Thread - Critical Section(CS)4
This is run method - User Thread - Critical Section(CS)5
This is run method - User Thread - Critical Section(CS)3
This is run method - User Thread - Critical Section(CS)4
This is run method - User Thread - Critical Section(CS)5
This is run method - User Thread - Critical Section(CS)6
This is run method - User Thread - Critical Section(CS)7
This is run method - User Thread - Critical Section(CS)6
This is run method - User Thread - Critical Section(CS)7
This is run method - User Thread - Critical Section(CS)8
This is run method - User Thread - Critical Section(CS)8
This is run method - User Thread - Critical Section(CS)9
This is run method - User Thread - Critical Section(CS)9
This is run method - User Thread - Critical Section(CS)10
This is run method - User Thread - Critical Section(CS)10

D:\Coding\Desktop\Java\OOPS\Multithreading\code2>javac RunnableDemo.java

D:\Coding\Desktop\Java\OOPS\Multithreading\code2>java RunnableDemo
This is run method - User Thread - Critical Section(CS)1
This is run method - User Thread - Critical Section(CS)2
This is run method - User Thread - Critical Section(CS)3
This is run method - User Thread - Critical Section(CS)4
This is run method - User Thread - Critical Section(CS)5
This is run method - User Thread - Critical Section(CS)6
This is run method - User Thread - Critical Section(CS)1
This is run method - User Thread - Critical Section(CS)2
This is run method - User Thread - Critical Section(CS)3
This is run method - User Thread - Critical Section(CS)4
This is run method - User Thread - Critical Section(CS)5
This is run method - User Thread - Critical Section(CS)6
This is run method - User Thread - Critical Section(CS)7
This is run method - User Thread - Critical Section(CS)8
This is run method - User Thread - Critical Section(CS)7
This is run method - User Thread - Critical Section(CS)9
This is run method - User Thread - Critical Section(CS)8
This is run method - User Thread - Critical Section(CS)9
This is run method - User Thread - Critical Section(CS)10
This is run method - User Thread - Critical Section(CS)10
*/