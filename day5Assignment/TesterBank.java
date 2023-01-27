package Day5BankInterface;

public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new BankA(200);
		Bank b2=new BankB(300);
		Bank b3=new BankC(400);
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
		System.out.println(b3.getBalance());
		}

}
