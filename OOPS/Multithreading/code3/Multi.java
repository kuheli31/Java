public class Multi extends Thread{
	@Override
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i);// 111222333
		
		try{
			Thread.sleep(700 , 500); // (700 milli second , 500 nano second)sleep/ blocked time for per thread after execution of run()
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args){ //main thread
		Multi t1 = new Multi(); 
		t1.start();

		Multi t2 = new Multi();
		t2.start();

		Multi t3 = new Multi();
		t3.start();
	}

}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOPS\Multithreading\code3>java Multi
1
1
1
2
2
2
3
3
3
4
4
4
5
5
5
6
6
6
7
7
7
8
8
8
9
9
9
10
10
10
*/