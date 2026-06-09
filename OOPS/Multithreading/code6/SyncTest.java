public class SyncTest{
	public static void main(String args[])
	{
		Table t = new Table();

		First t1 = new First(t);
		t1.start(); //printing 19 table

		Second t2 = new Second(t);
		t2.start(); // printing 17 table

		Third t3 = new Third(t);
		t3.start(); // printing 20 table

	}
}

/*
OUTPUT:

D:\Coding\Desktop\Java\OOPS\Multithreading\code6>java SyncTest
19 * 1 = 19
19 * 2 = 38
19 * 3 = 57
19 * 4 = 76
19 * 5 = 95
19 * 6 = 114
19 * 7 = 133
19 * 8 = 152
19 * 9 = 171
19 * 10 = 190
20 * 1 = 20
20 * 2 = 40
20 * 3 = 60
20 * 4 = 80
20 * 5 = 100
20 * 6 = 120
20 * 7 = 140
20 * 8 = 160
20 * 9 = 180
20 * 10 = 200
17 * 1 = 17
17 * 2 = 34
17 * 3 = 51
17 * 4 = 68
17 * 5 = 85
17 * 6 = 102
17 * 7 = 119
17 * 8 = 136
17 * 9 = 153
17 * 10 = 170

*/