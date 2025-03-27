public class Customer{
	private int cid;
	private String cname;
	private static String bank="SBI";
	private Account account; //using Account class reference variable

	public Customer(int cid , String cname , Account account){
	 this.cid = cid;
	 this.cname = cname;
	 this.account = account;
	}

	public void disp(){
	 System.out.println(cid+" "+cname+" "+bank);
	 account.getAccount();
	}

	//main method
	public static void main(String[] args){
	Account a1 = new Account(12345,"Savings",100000);
	Customer c1 = new Customer(1122,"Kuheli",a1);

	c1.disp();
	}
}