public class Multi extends Thread{
	@Override
	public void run()
	{
		for(int i=1 ; i<=5 ; i++)
		{
							System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
			System.out.println(i);// 
		
		try{
			Thread.sleep(750 , 500); // (700 milli second , 500 nano second)sleep/ blocked time for per thread after execution of run()
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args) throws Exception{ //main thread
		Multi t1 = new Multi();  // thread-0
		t1.setPriority(10);
		t1.start();
		t1.join(2500);//waiting 5000ms to do its job , At 5000 ms, t1 has already printed 1–8 and is sleeping before printing 9.
		

		Multi t2 = new Multi();
		t2.setName("second");
		t2.start();

		Multi t3 = new Multi();
		t3.setName("three");
		t3.start();
	}

}


/*
OUTPUT:
D:\Coding\Desktop\Java\OOPS\Multithreading\code5>java Multi
Thread-0
10
1
Thread-0
10
2
Thread-0
10
3
Thread-0
10
4
second
5
1
three
5
1
Thread-0
10
5
second
5
2
three
5
2
second
three
5
3
5
3
three
5
4
second
5
4
three
5
5
second
5
5
*/
