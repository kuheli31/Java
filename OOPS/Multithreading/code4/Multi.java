public class Multi extends Thread{
	@Override
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i);// 
		
		try{
			Thread.sleep(700 , 500); // (700 milli second , 500 nano second)sleep/ blocked time for per thread after execution of run()
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args) throws Exception{ //main thread
		Multi t1 = new Multi(); 
		t1.start();
		t1.join(5000);//waiting 5000ms to do its job , At 5000 ms, t1 has already printed 1–8 and is sleeping before printing 9.

		Multi t2 = new Multi();
		t2.start();

		Multi t3 = new Multi();
		t3.start();
	}

}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOPS\Multithreading\code4>java Multi
1
2
3
4
5
6
7
8
1
1
9
2
2
10
3
3
4
4
5
5
6
6
7
7
8
8
9
9
10
10
*/